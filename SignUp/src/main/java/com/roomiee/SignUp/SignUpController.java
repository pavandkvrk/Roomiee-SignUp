package com.roomiee.SignUp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roomiee.SignUp.Domain.SignUpRequest;
import com.roomiee.SignUp.Domain.SignUpResponse;
import com.roomiee.SignUp.Repo.SignUpRequestRepositary;
import com.roomiee.SignUp.Repo.SignUpResponseRepositary;
import com.roomiee.SignUp.Service.SignUpService;

@RestController
public class SignUpController {
	
	@Autowired
	SignUpService service;
	@Autowired
	SignUpRequestRepositary requestRepositary;
	@Autowired
	SignUpResponseRepositary responseRepositary;
	
	@PostMapping("/createaccount")
	public Map<String, Integer> createAccount(@RequestBody SignUpRequest request) {
		int hashCd = request.getEmail().hashCode();
		SignUpResponse response = new SignUpResponse();
		response.setName(request.getFirstName()+request.getLastName());
		response.setHashCd(hashCd);
		Map<String, Integer> result = new HashMap<String, Integer>();
		result.put(response.getName(), response.getHashCd());
		requestRepositary.save(request);
		return result;
	}

}
