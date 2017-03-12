package com.opendev.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opendev.entities.Question;

public interface QuestionRepository  extends JpaRepository<Question, Long>{

	public List<Question> findByType(String type);
}
