package com.project.questionservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.questionservice.entities.Question;
import com.project.questionservice.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuizController {
    @Autowired
    private QuestionService questionService;

    @PostMapping
    public Question saveQuestion(@RequestBody Question question) {
        return questionService.create(question);
    }

    @GetMapping
    public List<Question> getAllQuestions() {
        return questionService.findAll();
    }

    @GetMapping("/{id}")
    public Question getQuestionById(@PathVariable int id) {
        return questionService.findById(id);
    }

    @GetMapping("/quiz/{id}")
    public List<Question> getQuestionByIdofQues(@PathVariable int id) {
        return questionService.findByIdofQues(id);
    }
}
