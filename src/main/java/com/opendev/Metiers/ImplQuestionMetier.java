package com.opendev.Metiers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opendev.DAO.QuestionRepository;
import com.opendev.entities.Question;

@Service
public class ImplQuestionMetier implements QuestionMetier {

	@Autowired
	private QuestionRepository questionRepository  ;
	
	@Override
	public List<Question> getQuestions(String type) {
		
		return questionRepository.findByType(type);
	}

}
