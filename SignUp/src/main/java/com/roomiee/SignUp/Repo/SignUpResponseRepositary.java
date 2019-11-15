package com.roomiee.SignUp.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.roomiee.SignUp.Domain.SignUpResponse;

public interface SignUpResponseRepositary extends MongoRepository<SignUpResponse, String> {
	
}
