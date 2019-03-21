package com.spring;

import java.util.Set;

public class SetAnswers {

	public Set<Question> answers;
	
	public SetAnswers() {
		super();
		
	}

	public SetAnswers(Set<Question> answers) {
		super();
		this.answers = answers;
	}

	public Set<Question> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Question> answers) {
		this.answers = answers;
	}
	
	public void show()
	{
		for(Question s:answers)
		{
			System.out.println(s.getQuestionId()+") " +s.getQuestion()+"?\nAnswer) "+s.getAnswers());
		}
	}
}
