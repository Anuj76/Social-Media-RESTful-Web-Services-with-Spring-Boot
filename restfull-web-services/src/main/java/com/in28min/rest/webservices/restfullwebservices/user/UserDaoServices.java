package com.in28min.rest.webservices.restfullwebservices.user;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoServices {

	private static List<User> users = new ArrayList<>();
	private static int idCount = 0;
	
	static {
		users.add(new User(idCount++,"Anuj",LocalDate.now().minusYears(30)));
		users.add(new User(idCount++,"Ankita",LocalDate.now().minusYears(21)));
		users.add(new User(idCount++,"Akshat",LocalDate.now().minusYears(24)));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User findOne(int id)
	{
		Predicate<? super User> Predicate = user -> user.getId().equals(id);
		return users.stream().filter(Predicate).findFirst().orElse(null);
	}
	
	public void deleteOne(int id)
	{
		Predicate<? super User> Predicate = user -> user.getId().equals(id);
		users.removeIf(Predicate);
	}
	
	public User addUser(User user){
		user.setId(idCount++);
		users.add(user);
		return user;
	}
}
