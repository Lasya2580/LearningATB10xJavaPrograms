package LearningATB10xJavaPrograms.Task19;

public class LargestNumber {
    public static void main(String[] args) {
        int a=30,b=20,c=10;
        int Largest = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("The Largest Number among 3 numbers is: "+Largest);
    }
}
