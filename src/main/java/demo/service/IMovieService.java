package demo.service;

import demo.domain.Movie;

import java.util.Collection;

public interface IMovieService {

	Collection<Movie> findAllMovies();

}
