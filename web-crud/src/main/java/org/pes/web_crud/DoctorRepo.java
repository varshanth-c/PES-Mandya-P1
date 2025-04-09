package org.pes.web_crud;

import java.util.List;

public interface DoctorRepo {
    String insert(Doctor doctor);
    String terminate(int doctorId);
    List<Doctor> readAll();
    String update(Doctor doctor);
}
