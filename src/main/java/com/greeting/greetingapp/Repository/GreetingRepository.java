package com.greeting.greetingapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greeting.greetingapp.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {

}
