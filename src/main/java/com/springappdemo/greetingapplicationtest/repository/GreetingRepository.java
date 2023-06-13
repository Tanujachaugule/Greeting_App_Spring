package com.springappdemo.greetingapplicationtest.repository;

import com.springappdemo.greetingapplicationtest.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
