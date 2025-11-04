package If_Else;

import java.util.Scanner;

public class oddeven_01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();

        if (n%2 == 0){
            System.out.print("Even Number");
        }
        else {
            System.out.print("Odd Number");
        }

    }
}

