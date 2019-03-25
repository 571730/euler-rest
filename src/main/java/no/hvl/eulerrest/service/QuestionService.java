package no.hvl.eulerrest.service;

import no.hvl.eulerrest.Question;

import java.util.List;

public interface QuestionService {
    List<Question> findAll();
}
