package com.cg.entity;

import java.io.Serializable;
import java.math.*;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity                  //it is useful with model classes to denote that this is the entity or table

@Table(name="question")  //this name will be used to name a table in DataBase
public class Question implements Serializable{

	@Id                //it denotes primary key of the  table which is created
	private BigInteger questionId ;   


	
	@Column(name = "options")    //it is used to create column in the database
	private String[] option;

	@Column
	private String questionTitle ;
	
	@Column
	private String questionAnswer ;

	
	@Column
	private BigDecimal questionMarks ;
	
	@Column
	private Integer chosenAnswer ;
	
	@Column
	private BigDecimal marksScored ;
	
	
	

	
	public Question()
	{
		
	}


	public Question(BigInteger questionId, String questionTitle,
			String questionAnswer, BigDecimal questionMarks, Integer chosenAnswer, BigDecimal marksScored) {
		super();
		this.questionId = questionId;
		this.questionTitle = questionTitle;
		this.questionAnswer = questionAnswer;
		this.questionMarks = questionMarks;
		this.chosenAnswer = chosenAnswer;
		this.marksScored = marksScored;
	}


	public BigInteger getQuestionId() {
		return questionId;
	}


	public void setQuestionId(BigInteger questionId) {
		this.questionId = questionId;
	}


	public String getQuestionTitle() {
		return questionTitle;
	}


	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	
	public String[] getOption() {
		return option;
	}


	public void setOption(String[] option) {
		this.option = option;
	}


	public String getQuestionAnswer() {
		return questionAnswer;
	}


	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}


	public BigDecimal getQuestionMarks() {
		return questionMarks;
	}


	public void setQuestionMarks(BigDecimal questionMarks) {
		this.questionMarks = questionMarks;
	}


	public Integer getChosenAnswer() {
		return chosenAnswer;
	}


	public void setChosenAnswer(Integer chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}


	public BigDecimal getMarksScored() {
		return marksScored;
	}


	public void setMarksScored(BigDecimal marksScored) {
		this.marksScored = marksScored;
	}

	


	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionTitle="
				+ questionTitle + ", questionAnswer=" + questionAnswer + ", questionMarks=" + questionMarks
				+ ", chosenAnswer=" + chosenAnswer + ", marksScored=" + marksScored + "]";
	}
	
	
	
}
