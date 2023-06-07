package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import javax.sql.DataSource;
import java.util.List;

public class JdbcTemplate {
    public JdbcTemplate(DataSource dataSource) {
    }

    public List<Member> query(String s, RowMapper<Member> memberRowMapper, Long id) {
    }
}
