package no.hvl.eulerrest;

import no.hvl.eulerrest.interfaces.QuestionDAO;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DaoImpl implements QuestionDAO {
    private NamedParameterJdbcTemplate template;
    public DaoImpl(NamedParameterJdbcTemplate template){
        this.template = template;
    }

    @Override
    public List<Question> findAll() {
        return template.query("select * from questions", new QuestionRowMapper());
    }
}
