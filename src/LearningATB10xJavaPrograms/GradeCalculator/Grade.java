package LearningATB10xJavaPrograms.GradeCalculator;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int i = sc.nextInt();
        if (i > 100) {
            System.out.println("Invalid Score");
        }
            else if(i >= 90) {
            System.out.println("A");
        }
            else if(i >= 80 )
        {
            System.out.println("B");

        }
            else if(i >= 70)
        {
            System.out.println("C");
        }
            else if(i >= 60 )
        {
            System.out.println("D");
        }
            else{
            System.out.println("F");
        }

    }
}
