package Loops;

import java.util.Scanner;

public class CountNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n =sc.nextInt();
        if(n==0)n = 7;
        int Count = 0;
        while(n !=0){
            n = n/10;
            Count++;
        }
        System.out.println(Count);
    }
}
