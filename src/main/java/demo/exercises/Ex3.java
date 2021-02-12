package demo.exercises;

import demo.domain.Movie;
import demo.service.MovieService;

import java.util.Collection;

public class Ex3 {
	public static void main(String[] args) {
		// Out of all movies, print first 5 movie director names, whose name is longer than 12.

		MovieService movieService = MovieService.getInstance();
		Collection<Movie> movies = movieService.findAllMovies();

		// Solution

	}
}
