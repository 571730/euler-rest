package no.hvl.eulerrest.interfaces;

import no.hvl.eulerrest.Question;

import java.util.List;

public interface QuestionDAO {
    List<Question> findAll();
}
