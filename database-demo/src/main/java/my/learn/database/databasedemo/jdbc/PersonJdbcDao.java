package my.learn.database.databasedemo.jdbc;

import my.learn.database.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll() {
        return jdbcTemplate.query("select * from PERSON", new BeanPropertyRowMapper<Person>(Person.class));
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("select * from PERSON where id=?", new Object[]{id}, new BeanPropertyRowMapper<Person>(Person.class));
    }
}
