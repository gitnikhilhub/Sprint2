package com.cg.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.cg.dao.OnlineTestDaoI;
import com.cg.entity.Question;
import com.cg.entity.Result;
import com.cg.entity.Test;
import com.cg.entity.User;
import com.cg.exception.OnlineTestException;

@Service
public class OnlineTestServiceImpl implements OnlineTestServiceI {

	@Autowired
	OnlineTestDaoI dao;

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



	@Override
	public List<Question> getAllQuestion() {
		
		return dao.getAllQuestion();
	}



	@Override
	public void updateQuestion(Question question) {
		dao.updateQuestion(question);
		
	}

	@Override
	public void deleteQuestion(BigInteger questionId) {
		dao.deleteQuestion(questionId);
		
	}
	@Override
	public List<Result> getResult(int userId)
	{
	   return dao.getResult(userId);
	}	
	
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
