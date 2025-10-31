package Basic_Cheeze;

import java.util.Scanner;

public class Volumeofsphere {
    static void main(String[] args) {
        System.out.print("Enter a radius :");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double pi = 3.141592;
        double Vos = (4 * pi * radius * radius *radius)/3;
        System.out.print("Your Volume of sphere is :");
        System.out.println(Vos);
    }
}
