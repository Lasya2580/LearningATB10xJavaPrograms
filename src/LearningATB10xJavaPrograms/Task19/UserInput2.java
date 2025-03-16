package LearningATB10xJavaPrograms.Task19;
import java.util.Scanner;
public class UserInput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value1: ");
        int value1 = scanner.nextInt();
        System.out.println("Enter the value2: ");
        int value2 = scanner.nextInt();
        int MaximumNumber = value1 > value2 ? value1 : value2;
        System.out.println("The maximun number is: "+MaximumNumber);


    }
}
