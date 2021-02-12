package demo.domain;

import java.util.ArrayList;
import java.util.List;

public class Director {
	private int id;
	private String name;
	private String imdb;
	private List<Movie> movies = new ArrayList<>();

	public Director(int id, String name, String imdb) {
		this.id = id;
		this.name = name;
		this.imdb = imdb;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getImdb() {
		return imdb;
	}

	public List<Movie> getMovies() {
		return movies;
	}
}
