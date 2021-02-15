package demo.exercises;

import demo.domain.Movie;
import demo.service.MovieService;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex4 {
	public static void main(String[] args) {
		// Print out the year with the most movies created using streams.

		MovieService movieService = MovieService.getInstance();
		Collection<Movie> movies = movieService.findAllMovies();

		// Solution

	}
}
