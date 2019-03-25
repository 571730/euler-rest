package no.hvl.eulerrest;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionRowMapper implements RowMapper<Question> {
    @Override
    public Question mapRow(ResultSet resultSet, int i) throws SQLException {
        Question question = new Question();
        question.setQid(Integer.parseInt(resultSet.getString("qid")));
        question.setAnswer(resultSet.getString("answer"));
        question.setQuestion(resultSet.getString("question"));
        return question;
    }
}
