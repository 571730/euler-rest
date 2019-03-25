package no.hvl.eulerrest.service;

import no.hvl.eulerrest.Question;
import no.hvl.eulerrest.interfaces.QuestionDAO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class QuestionServiceImpl implements QuestionService{
    @Resource
    QuestionDAO qDAO;

    @Override
    public List<Question> findAll(){
        return qDAO.findAll();
    }
}
