package Pattern_Printing;

import java.util.Scanner;

public class pattern_StarTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  Number n : ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();

//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter a  Number n : ");
//            int n = sc.nextInt();
//
//            for (int i = 1; i<=n; i++) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print((char)(i+64)+" ");
//                }
//                System.out.println();
        }
    }
}
