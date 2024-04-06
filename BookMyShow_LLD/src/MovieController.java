import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Enums.City;

public class MovieController {

	Map<City,List<Movie>> cityVsMovies = new HashMap<>();
	List<Movie> allMovies = new ArrayList<>();
	
	MovieController(){
		cityVsMovies = new HashMap<>();
		allMovies = new ArrayList<>();
	}
	
	public void addMovie(Movie movie, City city) {
		allMovies.add(movie);
		List<Movie> movies = cityVsMovies.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityVsMovies.put(city, movies);
	}
	
	public Movie getMoviebyName(String movieName) {
		
		for(Movie movie : allMovies) {
            if((movie.getName()).equals(movieName)) {
                return movie;
            }
        }
        return null;
	}
	
	List<Movie> getMoviesByCity(City city) {
        return cityVsMovies.get(city);
    }
}
