package com.sree.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer>{
	
	

}
