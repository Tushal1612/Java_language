package Basic_Cheeze;
import java.util.Scanner;

public class Simpleinterest {
    static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a principle :");
        double principle = sc.nextDouble();
        System.out.print("Enter a rate :");
        double rate = sc.nextDouble();
        System.out.print("Enter a time:");
        double time = sc.nextDouble();

        double simpleinterest = (principle * rate * time )/100; //p*r*t/100.0

        System.out.print("Yout simpleinterest is : ");

        System.out.println(simpleinterest);
    }
}
