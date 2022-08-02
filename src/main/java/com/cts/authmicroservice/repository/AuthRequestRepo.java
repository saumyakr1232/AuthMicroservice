package com.cts.authmicroservice.repository;


import com.cts.authmicroservice.model.AuthenticationRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRequestRepo extends JpaRepository<AuthenticationRequest, String> {

}
 