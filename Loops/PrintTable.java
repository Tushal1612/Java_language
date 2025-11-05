package Loops;

import java.util.Scanner;

public class PrintTable {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Table Number : ");
        int n = sc.nextInt();



        for (int i= n;i<=n*10;i=i+n){
            System.out.print(i+" ");
        }
//
//        for (int i = 1;i<=10;i++){
//            System.out.print(i*n+" ");
//        }
    }
}
