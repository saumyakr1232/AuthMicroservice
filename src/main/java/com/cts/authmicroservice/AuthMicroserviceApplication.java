package com.cts.authmicroservice;

import com.cts.authmicroservice.model.AuthenticationRequest;
import com.cts.authmicroservice.repository.AuthRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class AuthMicroserviceApplication implements CommandLineRunner {

    @Autowired
    AuthRequestRepo authRequestRepo;

    public static void main(String[] args) {
        SpringApplication.run(AuthMicroserviceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        AuthenticationRequest user1 = new AuthenticationRequest("saumya", "saumya");
        AuthenticationRequest user2 = new AuthenticationRequest("abhimanyu", "abhimanyu");
        AuthenticationRequest user3 = new AuthenticationRequest("pawan", "pawan");
        AuthenticationRequest user4 = new AuthenticationRequest("admin", "admin");

        authRequestRepo.save(user1);
        authRequestRepo.save(user2);
        authRequestRepo.save(user3);
        authRequestRepo.save(user4);
    }

}
