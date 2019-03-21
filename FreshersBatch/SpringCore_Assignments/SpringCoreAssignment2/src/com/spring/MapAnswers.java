package com.spring;

import java.util.Map;

public class MapAnswers {

	public Map<Question,Question> answers;

	public MapAnswers() {
		super();
		
	}

	public MapAnswers(Map<Question, Question> answers) {
		super();
		this.answers = answers;
	}

	public Map<Question, Question> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Question, Question> answers) {
		this.answers = answers;
	}

	public void show() {
		
		for(Question s:answers)
		{
			System.out.println(s.getQuestionId()+") " +s.getQuestion()+"?\nAnswer) "+s.getAnswers());
		}
		
	}
}
