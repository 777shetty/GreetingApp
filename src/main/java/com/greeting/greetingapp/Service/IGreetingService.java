package com.greeting.greetingapp.Service;

import java.util.Optional;

import com.greeting.greetingapp.model.Greeting;
import com.greeting.greetingapp.model.User;

public interface IGreetingService {

	Greeting addGreeting(User user);
	Optional<Greeting> getGreetingById(long id);

}
