package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Query;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
public class TestService {

    @Autowired
    private TestEntityManager testEntityManager;

    @Test
    public void test() {
        String query = "SELECT group_concat(s.name) FROM Student s GROUP BY s.college.id";

        Query query1 = testEntityManager.getEntityManager().createQuery(query);

        Object o = query1.getSingleResult();

        System.out.println(o);
    }
}
