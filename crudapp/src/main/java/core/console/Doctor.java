package core.console;

public class Doctor {
    private String doctorName;
    private String doctorDepartment;
    private String doctorQualification;
    private double shiftTiming;
    private int age;
    @Override
    public String toString() {
        return "Doctor [doctorName=" + doctorName + ", doctorDepartment=" + doctorDepartment + ", doctorQualification="
                + doctorQualification + ", shiftTiming=" + shiftTiming + ", age=" + age + "]";
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
    public String getDoctorQualification() {
        return doctorQualification;
    }
    public void setDoctorQualification(String doctorQualification) {
        this.doctorQualification = doctorQualification;
    }
    public double getShiftTiming() {
        return shiftTiming;
    }
    public void setShiftTiming(double shiftTiming) {
        this.shiftTiming = shiftTiming;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
