package com.greeting.greetingapp.Service;

import com.greeting.greetingapp.model.Greeting;
import com.greeting.greetingapp.model.User;

public interface IGreetingService {

	Greeting addGreeting(User user);
	Greeting getGreetingById(long id);

}
