package demo.exercises;

import demo.domain.Movie;
import demo.service.MovieService;

import java.util.Collection;

public class Ex1 {
	public static void main(String[] args) {
		// Print out all the movies which were created before Nortal AS was founded.

		MovieService movieService = MovieService.getInstance();
		Collection<Movie> movies = movieService.findAllMovies();

		// Solution

	}
}
