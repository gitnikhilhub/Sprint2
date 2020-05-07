package com.cg.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import com.cg.dao.OnlineTestDaoI;
import com.cg.entity.Question;
import com.cg.entity.Result;
import com.cg.entity.User;
import com.cg.exception.OnlineTestException;

@Service
public class OnlineTestServiceImpl implements OnlineTestServiceI {

	@Autowired
	OnlineTestDaoI dao;
	
	//value of question came from controller and from here it will go to dao layer.
	//and it will be persist in table through entity manager 

	@Override
	public void createQuestion(Question question) throws OnlineTestException {
		try{
			dao.createQuestion(question);
			}
		catch(DataIntegrityViolationException exception)
		{
			throw new OnlineTestException("question with this id already exists");
		}
	}

	
	//user requested to get all questions
	//request will pass to dao layer and it will return all question.
	@Override
	public List<Question> getAllQuestion() {
		
		return dao.getAllQuestion();
	}
	
	//this function send the request for update to dao and it will help him to update.
	@Override
	public void updateQuestion(Question question) {
		dao.updateQuestion(question);
		
	}

	//this function send the request for Deletion to dao and it will help him to Delete the question.
	@Override
	public void deleteQuestion(BigInteger questionId) {
		dao.deleteQuestion(questionId);
		
	}
	
	@Override
	public List<Result> getResult(int userId)
	{
	   return dao.getResult(userId);
	}	
	
	//value of question came from controller and from here it will go to dao layer.
	//and it will be persist in table through entity manager 
	
	@Override
	public void createUser(User user) throws OnlineTestException {
		try{
			dao.createUser(user);
			}
		catch(DataIntegrityViolationException exception)
		{
			throw new OnlineTestException("id already present");
		}
	}
	
	
	//user requested to get a user
	//id is passed to dao layer and it will search in database and return result
	@Override
	public User getUser(BigInteger id) throws OnlineTestException 
	{
		User user=dao.getUser(id);
		if(user!=null)
		{
			return dao.getUser(id);
		}
		else
		{
			throw new OnlineTestException("No user exists");
		}
	}
}
