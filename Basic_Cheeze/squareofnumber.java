package Basic_Cheeze;

import java.util.Scanner;

public class squareofnumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a interger number");
        int number = sc.nextInt();
        int son = number * number;
        System.out.print("number of square is :  ");
        System.out.println(son);
    }
}
