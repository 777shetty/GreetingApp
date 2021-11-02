package com.greeting.greetingapp.Service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.greeting.greetingapp.Repository.GreetingRepository;
import com.greeting.greetingapp.model.Greeting;
import com.greeting.greetingapp.model.User;

@Service
public class GreetingService implements IGreetingService {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private GreetingRepository greetinRepository;

	@Override
	public Greeting addGreeting(User user) {
	String message =String.format(template,(user.toString().isEmpty())? "Hello World" : user.toString());
	return greetinRepository.save(new Greeting(counter.incrementAndGet(),message));
	}

	@Override
	public Greeting getGreetingById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
