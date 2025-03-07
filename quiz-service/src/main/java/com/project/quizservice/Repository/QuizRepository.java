package com.project.quizservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.quizservice.entities.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {
    
}
