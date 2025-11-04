package If_Else;

import java.util.Scanner;

public class triangleornot_07 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Side : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Side : ");
        int b = sc.nextInt();
        System.out.print("Enter Third Side : ");
        int c = sc.nextInt();

        if(a+b>c && b+c >a && c+a >b ){
            System.out.println("Valid Triangle");}
        else System.out.println("Invalid Triangle");

    }
}
