package demo.exercises;

import demo.domain.Movie;
import demo.service.MovieService;

import java.util.Collection;

public class Ex4 {
	public static void main(String[] args) {
		// Print out the year with the most movies created.

		MovieService movieService = MovieService.getInstance();
		Collection<Movie> movies = movieService.findAllMovies();

		// Solution

	}
}
