package com.cg.service;

import java.math.BigInteger;
import java.util.List;
import com.cg.entity.Question;
import com.cg.entity.Result;
import com.cg.entity.Test;
import com.cg.entity.User;
import com.cg.exception.OnlineTestException;

public interface OnlineTestServiceI {


	public void createQuestion(Question question);
    public void updateQuestion(Question question);
	public List<Question> getAllQuestion();
	public void deleteQuestion(BigInteger questionId);
	public List<Result> getResult(int userId);
	public void createUser(User user);
	public User getUser(BigInteger id);

}
