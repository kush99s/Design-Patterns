import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Enums.City;

public class TheatreController {

	List<Theatre> allTheatre = new ArrayList<>();
	Map<City,List<Theatre>> cityVsTheatre = new HashMap<>();
	
	TheatreController() {
        cityVsTheatre = new HashMap<>();
        allTheatre = new ArrayList<>();
    }
	
	void addTheatre(City city,Theatre theatre) {

        allTheatre.add(theatre);

        List<Theatre> theatres = cityVsTheatre.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        
        cityVsTheatre.put(city, theatres);
	}
	
	Map<Theatre, List<Show>> getAllShow(Movie movie, City city){
		Map<Theatre,List<Show>> allShows = new HashMap<>();
		
		List<Theatre> theatres =  cityVsTheatre.getOrDefault(city, new ArrayList<>());
		for(Theatre theatre:theatres) {
			
			List<Show> shows = theatre.getShows();
			List<Show> givenMovieShows = new ArrayList<>();
			
			for(Show show:shows) {
				if(show.getMovie()==movie) {
					givenMovieShows.add(show);
				}
			}
			
			if(!givenMovieShows.isEmpty()) {
				allShows.put(theatre, givenMovieShows);
            }
			
		}
		return allShows;
	}
}
