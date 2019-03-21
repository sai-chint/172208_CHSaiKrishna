package com.spring;

import java.util.List;

public class ListAnswers {

	public List<Question> answers;


	public ListAnswers() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public ListAnswers(List<Question> answers) {
		super();
		this.answers = answers;
	}



	public List<Question> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Question> answers) {
		this.answers = answers;
	}
	
	public void show() {
		for(Question s:answers)
		{
			System.out.println(s.getQuestionId()+") " +s.getQuestion()+"?\nAnswer) "+s.getAnswers());
		}
	}
	
}
