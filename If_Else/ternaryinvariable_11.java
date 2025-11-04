package If_Else;

import java.util.Scanner;

public class ternaryinvariable_12 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a Number : ");
        int n = sc.nextInt();

        int tushal = (n>= 0) ? 100 : 0;

//        int tushal ;
//        if (n>= 0) tushal = 100;
//        else tushal = 0;

        System.out.println(tushal);
    }
}
