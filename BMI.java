import java.util.Scanner;

public class BMI{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name="", gender="", cause="";
        int age=0; double height=0.0, weight=0.0, bmi = 0.0;
        
        System.out.println("Tell us your name");
        name=scanner.nextLine();
        System.out.println("Tell us your gender ");
        gender=scanner.nextLine();
        System.out.println("Tell us cause you visit the hospital ");
        cause = scanner.nextLine();
        System.out.println("Tell us your age ");
        age = scanner.nextInt();
        System.out.println("Height and Weight ");
        height = scanner.nextDouble();
        weight = scanner.nextDouble();

        // find BMI
        height = height/100;
        bmi = weight/(height*height);

        System.out.println(name+ " your bmi is "+bmi);

        scanner.close();
    }
}