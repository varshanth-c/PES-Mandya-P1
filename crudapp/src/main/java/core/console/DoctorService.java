package core.console;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DoctorService implements DoctorsRemote{

    // data logic
    List<Doctor> dmsHospital = new ArrayList<>();
    // factory

    @Override
    public void recruit(Doctor doctor) {
        dmsHospital.add(doctor);
        System.out.println(doctor.getDoctorName()+" has recruited ");
    }

    @Override
    public List<Doctor> viewAllDoctors() {
        return dmsHospital;
    }

    @Override
    public List<Doctor> viewAllByQualification(String qualif) {
        return dmsHospital.stream().filter(tempDoc->{
            return tempDoc.getDoctorQualification().equals(qualif);
        }).collect(Collectors.toList());
    }

    @Override
    public List<Doctor> viewAllByDeaprtment(String department) {
        return dmsHospital.stream().filter(tempDoc->{
            return tempDoc.getDoctorDepartment().equals(department);
        }).collect(Collectors.toList());
    }

    @Override
    public void upgradeProfile(Doctor doctor) {
        for(int index = 0; index < dmsHospital.size(); index++){
            if(dmsHospital.get(index).getDoctorName().
            equals(doctor.getDoctorName())){
                dmsHospital.set(index, doctor);
            }
        }
    }

    @Override
    public void terminate(String name) {
        // overwrite
        dmsHospital = dmsHospital.stream().filter(temp->{
            return !temp.getDoctorName().equals(name);
        }).collect(Collectors.toList());
    }
    
}
