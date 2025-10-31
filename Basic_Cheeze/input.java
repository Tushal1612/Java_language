package Basic_Cheeze;
import java.util.Scanner;

public class input {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Radius : ");
      double  radius = sc.nextDouble();

        double pi = 3.141592;
        double Area = pi * radius * radius;
        System.out.print("Your Area is : ");
        System.out.println(Area);


    }
}
