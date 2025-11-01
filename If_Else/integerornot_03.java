package If_Else;

import java.util.Scanner;

public class integerornot_03 {
    static void main(String[] args) {
        System.out.print("Enter a Real Number : ");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();  //3.1415

        int x = (int)n;                 //x =3
        if(n-x == 0) System.out.println("Is an Integer");  //3.1415 - 3 = 0.1415
        else System.out.print("Not an Integer");
    }
}
