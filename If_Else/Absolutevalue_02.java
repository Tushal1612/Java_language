package If_Else;

import java.util.Scanner;

public class Absolutevalue_02 {
    static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print(" Enter a number : ");
        int n = sc.nextInt();
        if (n >= 0){
            System.out.print(n);
        }
        else {
            System.out.print(-n);
        }
    }
}
