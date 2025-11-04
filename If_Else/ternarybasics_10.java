package If_Else;

import java.util.Scanner;

public class ternarybasics_11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

//        if (n%2 == 0) System.out.println("Even");
//        else System.out.println("odd");
            // copndition ? such : jhoot;

        System.out.println(n+ " "+(n%2 == 0 ? "Even" : "odd"));
    }
}
