package demo.exercises;

import demo.domain.Movie;
import demo.service.MovieService;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
	public static void main(String[] args) {
		// #1 Sort the movies by title alphabetically and put them into list.
		// #2 Do the same, but sort titles in the opposite order.

		MovieService movieService = MovieService.getInstance();
		Collection<Movie> movies = movieService.findAllMovies();

		// Solution

	}
}
