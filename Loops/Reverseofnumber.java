package Loops;

import java.util.Scanner;

public class Reverseofnumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int n = sc.nextInt();
        int r = 0;
        while (n != 0){
            r = r*10;
            r = r + (n%10);
            n = n/10;
        }
        System.out.println(r);

    }
}
