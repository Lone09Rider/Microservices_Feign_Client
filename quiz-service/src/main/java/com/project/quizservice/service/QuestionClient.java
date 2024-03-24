package com.project.quizservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.quizservice.entities.Question;

@FeignClient(url = "http://localhost:8080", value = "Question-Client")
public interface QuestionClient {
    
    @GetMapping("/question/quiz/{quizId}")
    List<Question> getQuestionsOfQuiz(@PathVariable int quizId);

}
