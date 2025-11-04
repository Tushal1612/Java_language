package If_Else;

import java.util.Scanner;

public class gretestofthree_10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int a = sc.nextInt();
        System.out.print("Enter B Number : ");
        int b = sc.nextInt();
        System.out.print("Enter C rd Number : ");
        int c = sc.nextInt();

//        if (a >= b){
//            if (a >= c) System.out.println("A is gratest");
//            else System.out.println(" C is gratest");
//           System.out.println((a >= c) ? "A is gretest" : "C is grstest");
//        }
//        else {
//            if (b >= c) System.out.println("B is gratest");
//            else System.out.println("C is gratest");
//            System.out.println((b >= c) ? "B is gretest" : "C is grstest");

            System.out.println((a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c));



    }
}
