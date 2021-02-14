package demo.exercises;

import lombok.*;

public class Ex5 {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1L);
		user.setUsername("admin");
		User user2 = new User(2L, "user");
		System.out.println(user.getId() + " " + user.getUsername());
		System.out.println(user2.toString());
	}
}

// add Lombok annotations
class User {

	private Long id;
	private String username;
}
