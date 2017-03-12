package com.opendev.Metiers;

import java.util.List;

import com.opendev.entities.Question;

public interface QuestionMetier {
	
	public List<Question> getQuestions(String type);
 

}
