package com.cg.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cg.entity.Question;
import com.cg.entity.Result;
import com.cg.entity.Test;
import com.cg.entity.User;
import com.cg.exception.OnlineTestException;
import com.cg.service.OnlineTestServiceI;

@CrossOrigin(origins="http://localhost:4214")
@RestController
public class OnlineTestController {

	@Autowired
	OnlineTestServiceI service;
	
	@PostMapping(value="/question/new", consumes= {"application/json"})
	public String createQuestion(@RequestBody Question question) 
	{
		service.createQuestion(question);
		return "question created";
	
	}

	@GetMapping(value = "/question")
	public List<Question> getAllQuestion()
	{
		return service.getAllQuestion();
	}
	
	@PutMapping(value ="question/update", consumes= {"application/json"})
	public String updateQuestion(@RequestBody Question question)
	{
		service.updateQuestion(question);
		return "question updated";
	}
	
	
	@DeleteMapping(value = "question/delete/{questionId}")
	public String deleteQuestion(@PathVariable BigInteger questionId)
	{
		service.deleteQuestion(questionId);
		return "deleted";
	}
	@GetMapping(value ="/result/{userId}")
	public List<Result> getResult(@PathVariable int userId)
	{
	return service.getResult(userId);
	}
	@PostMapping(value="/user/new", consumes= {"application/json"})
	public String createUser(@RequestBody User user) 
	{
		service.createUser(user);
		return "question created";
	}
	@GetMapping(value ="/user/{id}")
	public User getUser(@PathVariable BigInteger id)
	{
	return service.getUser(id);
	}

}