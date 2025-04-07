package core.console;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        // factroy  pattern
        DoctorsRemote remote = new DoctorService();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("1. Recruite Docktor\n2.Terminate\n3.View All\n4.View By Qualification\n5.View By Depqartment\n6. Upgrade");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:System.out.println("Enter the doctor details such as name, deaprtment, qualification, shft, age"); 
                    Doctor myDoctor = new Doctor();
                    myDoctor.setDoctorName(scanner.next());
                    myDoctor.setDoctorDepartment(scanner.next());
                    myDoctor.setDoctorQualification(scanner.next());
                    myDoctor.setShiftTiming(scanner.nextDouble());
                    myDoctor.setAge(scanner.nextInt());
                    remote.recruit(myDoctor);
                    break;
            case 2: System.out.println("Tell us name of doctor to terminate ");
                    remote.terminate(scanner.next());
                    break;
            case 3: System.out.println(remote.viewAllDoctors());
                    break;
            default:
                return;
            }
        }while(true);
    }
}
