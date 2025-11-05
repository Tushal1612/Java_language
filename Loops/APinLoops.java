package Loops;

import java.util.Scanner;

public class APinLoops {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a terms : ");
        int n = sc.nextInt();
        // 2,5,8,11,14.....
//        for (int i = 2; i<=3*n-1; i=i+3){
//            System.out.println(i);
//        }

        int a = 2 , d = 2 ;
        for (int i = 1 ; i<=n ; i++){
            System.out.print(a+" ");
            a += d;

//            int a = 99 , d = 4 ;
//            for (int i = 1 ; i>0 ; i++){
//                System.out.print(a+" ");
//                a -= d;
        }
    }
}
