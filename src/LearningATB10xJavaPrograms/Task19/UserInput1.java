package LearningATB10xJavaPrograms.Task19;
import java.util.Scanner;
public class UserInput1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String Name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.println(Name);
        System.out.println(age);
        System.out.println(salary);
    }
}
