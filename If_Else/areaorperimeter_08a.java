package If_Else;

import java.util.Scanner;

public class areaorperimeter_08a {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lenth : ");
        int l = sc.nextInt();
        System.out.print("Enter a breth : ");
        int b = sc.nextInt();

        if(l*b > 2*l + 2*b) {System.out.println("ANS : Area is greter than perimeter");}
        else System.out.println("  ANS : perimeter is grater than area");
    }
}
