package com.roomiee.SignUp.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.roomiee.SignUp.Domain.SignUpRequest;

public interface SignUpRequestRepositary extends MongoRepository<SignUpRequest, String> {

}
