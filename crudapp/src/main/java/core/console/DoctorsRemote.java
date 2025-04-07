package core.console;

import java.util.List;

public interface DoctorsRemote {
    public void recruit(Doctor doctor);
    public List<Doctor> viewAllDoctors();
    public List<Doctor> viewAllByQualification(String qualif);
    public List<Doctor> viewAllByDeaprtment(String department);
    public void upgradeProfile(Doctor doctor);
    public void terminate(String name);
}
