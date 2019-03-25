package no.hvl.eulerrest;

import no.hvl.eulerrest.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/euler")
public class Controller {
    @Resource
    QuestionService qService;

    @GetMapping(value = "/questions")
    public List<Question> getQuestions(){
        return qService.findAll();
    }

}
