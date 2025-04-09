package org.pes.web_crud;

// POJO 
public class Doctor {
    private int doctorId;
    private String doctorName;
    private String doctorDepartment;
    private int doctorExperience;
    public Doctor(int doctorId, String doctorName, String doctorDepartment, int doctorExperience) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorDepartment = doctorDepartment;
        this.doctorExperience = doctorExperience;
    }
    public Doctor() {
    }
    @Override
    public String toString() {
        return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorDepartment=" + doctorDepartment
                + ", doctorExperience=" + doctorExperience + "]";
    }
    public int getDoctorId() {
        return doctorId;
    }
    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public String getDoctorDepartment() {
        return doctorDepartment;
    }
    public void setDoctorDepartment(String doctorDepartment) {
        this.doctorDepartment = doctorDepartment;
    }
    public int getDoctorExperience() {
        return doctorExperience;
    }
    public void setDoctorExperience(int doctorExperience) {
        this.doctorExperience = doctorExperience;
    }
}
