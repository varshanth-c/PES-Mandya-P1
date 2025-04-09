package com.explore.springboot_ioc;

// POJO

public class Professor {
    private int professorId;
    private String professorName;
    private String professorDepartment;
    private int professorExperience;
    @Override
    public String toString() {
        return "Professor [professorId=" + professorId + ", professorName=" + professorName + ", professorDepartment="
                + professorDepartment + ", professorExperience=" + professorExperience + "]";
    }
    public int getProfessorId() {
        return professorId;
    }
    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }
    public String getProfessorName() {
        return professorName;
    }
    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }
    public String getProfessorDepartment() {
        return professorDepartment;
    }
    public void setProfessorDepartment(String professorDepartment) {
        this.professorDepartment = professorDepartment;
    }
    public int getProfessorExperience() {
        return professorExperience;
    }
    public void setProfessorExperience(int professorExperience) {
        this.professorExperience = professorExperience;
    }
}
