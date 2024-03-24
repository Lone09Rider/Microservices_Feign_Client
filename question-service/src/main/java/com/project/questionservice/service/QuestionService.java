package com.project.questionservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.questionservice.entities.Question;
import com.project.questionservice.repository.QuestionRepository;

@Service
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    public Question create(Question question) {
        return questionRepository.save(question);
    }

    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    public Question findById(int id) {
        return questionRepository.findById(id).orElseThrow(()->new RuntimeException("Question Not Found"));
    }

    public List<Question> findByIdofQues(int id) {
        return questionRepository.findByQuizId(id);
    }
}
