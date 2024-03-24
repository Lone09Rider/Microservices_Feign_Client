package com.project.questionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.questionservice.entities.Question;
import java.util.List;


public interface QuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findByQuizId(int quizId);
}
