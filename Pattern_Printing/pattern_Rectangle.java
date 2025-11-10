package Pattern_Printing;

import java.util.Scanner;

public class pattern_Rectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr a row Number : ");
        int row = sc.nextInt();
        System.out.print("Enter a colum Number : ");
        int col = sc.nextInt();

        for (int i = 1; i<=row; i++){
            for (int j = 1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
