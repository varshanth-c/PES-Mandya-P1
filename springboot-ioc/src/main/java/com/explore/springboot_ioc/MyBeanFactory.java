package com.explore.springboot_ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// bean factory/ container
@Configuration
public class MyBeanFactory {

    @Bean(autowireCandidate = false, name="ece")
    public Professor getEceProfessor(){
        Professor professor = new Professor();
        professor.setProfessorId(678764);
        professor.setProfessorDepartment("ECE");
        professor.setProfessorExperience(5);
        professor.setProfessorName("Bala");
        return professor;
    }

    @Bean
    public Professor getCseProfessor(){
        Professor professor = new Professor();
        professor.setProfessorId(89283);
        professor.setProfessorDepartment("CSE");
        professor.setProfessorExperience(12);
        professor.setProfessorName("Manikandan");
        return professor;
    }
}
