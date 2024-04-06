import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Enums.City;
import Enums.SeatType;

public class BookMyShow {

	MovieController movieController;
	TheatreController theatreController;
	
	BookMyShow(){
		movieController = new MovieController();
		theatreController = new TheatreController();
	}
	
	public static void main(String args[]) {

        BookMyShow bookMyShow = new BookMyShow();

        bookMyShow.initialze();

        bookMyShow.createBooking(City.Bangalore, "BAAHUBALI");
        
        bookMyShow.createBooking(City.Bangalore, "BAAHUBALI");

    }
	
	public void initialze() {
		
		createMovies();

        createTheatre();
		
	}
	
	  private void createBooking(City userCity, String movieName) {


	        List<Movie> movies = movieController.getMoviesByCity(userCity);

	        Movie interestedMovie = null;
	        for (Movie movie : movies) {

	            if ((movie.getName()).equals(movieName)) {
	                interestedMovie = movie;
	            }
	        }

	        Map<Theatre, List<Show>> showsTheatreWise = theatreController.getAllShow(interestedMovie, userCity);

	        //4. select the particular show user is interested in
	        Map.Entry<Theatre,List<Show>> entry = showsTheatreWise.entrySet().iterator().next();
	        List<Show> runningShows = entry.getValue();
	        Show interestedShow = runningShows.get(0);

	        //5. select the seat
	        int seatNumber = 30;
	        List<Integer> bookedSeats = interestedShow.getBookedSeats();
	        if(!bookedSeats.contains(seatNumber)){
	            bookedSeats.add(seatNumber);
	            //startPayment
	            Booking booking = new Booking();
	            List<Seat> myBookedSeats = new ArrayList<>();
	            for(Seat screenSeat : interestedShow.getScreen().getSeats()) {
	                if(screenSeat.getSeatID() == seatNumber) {
	                    myBookedSeats.add(screenSeat);
	                }
	            }
	            booking.setBookedSeat(myBookedSeats);
	            booking.setShow(interestedShow);
	        } else {
	            //throw exception
	            System.out.println("seat already booked, try again");
	            return;
	        }

	        System.out.println("BOOKING SUCCESSFUL");
	    }
	  
	private void createTheatre() {

        Movie avengerMovie = movieController.getMoviebyName("AVENGERS");
        Movie baahubali = movieController.getMoviebyName("BAAHUBALI");

        Theatre inoxTheatre = new Theatre();
        inoxTheatre.setId(1);
        inoxTheatre.setScreen(createScreen());
        inoxTheatre.setCity(City.Bangalore);
        List<Show> inoxShows = new ArrayList<>();
        Show inoxMorningShow = createShows(1, inoxTheatre.getScreen().get(0), avengerMovie, 8);
        Show inoxEveningShow = createShows(2, inoxTheatre.getScreen().get(0), baahubali, 16);
        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);
        inoxTheatre.setShows(inoxShows);


        Theatre pvrTheatre = new Theatre();
        pvrTheatre.setId(2);
        pvrTheatre.setScreen(createScreen());
        pvrTheatre.setCity(City.Delhi);
        List<Show> pvrShows = new ArrayList<>();
        Show pvrMorningShow = createShows(3, pvrTheatre.getScreen().get(0), avengerMovie, 13);
        Show pvrEveningShow = createShows(4, pvrTheatre.getScreen().get(0), baahubali, 20);
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);
        pvrTheatre.setShows(pvrShows);

        theatreController.addTheatre(City.Bangalore, inoxTheatre);
        theatreController.addTheatre(City.Delhi, pvrTheatre);

    }

    private List<Screen> createScreen() {

        List<Screen> screens = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setScreenId(1);
        screen1.setSeats(createSeats());
        screens.add(screen1);

        return screens;
    }

    private Show createShows(int showId, Screen screen, Movie movie, int showStartTime) {

        Show show = new Show();
        show.setShowId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
    
        return show;
    }

    //creating 100 seats
    private List<Seat> createSeats() {

        List<Seat> seats = new ArrayList<>();

        //1 to 40 : SILVER
        for (int i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setSeatID(i);
            seat.setType(SeatType.Platinum);
            seats.add(seat);
        }

        //41 to 70 : SILVER
        for (int i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setSeatID(i);
            seat.setType(SeatType.Platinum);
            seats.add(seat);
        }

        //1 to 40 : SILVER
        for (int i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setSeatID(i);
            seat.setType(SeatType.Platinum);
            seats.add(seat);
        }

        return seats;
    }

    private void createMovies() {

        //create Movies1
        Movie avengers = new Movie();
        avengers.setId(1);
        avengers.setName("AVENGERS");

        //create Movies2
        Movie baahubali = new Movie();
        baahubali.setId(2);
        baahubali.setName("BAAHUBALI");


        //add movies against the cities
        movieController.addMovie(avengers, City.Bangalore);
        movieController.addMovie(avengers, City.Delhi);
        movieController.addMovie(baahubali, City.Bangalore);
        movieController.addMovie(baahubali, City.Delhi);
    }
}
