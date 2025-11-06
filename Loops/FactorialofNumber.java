package Loops;

import java.util.Scanner;

public class FactorialofNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i=1;i<=n;i++){
            fact = fact *i;
        }
        System.out.println("factorial of Number is : "+fact);
    }
}
