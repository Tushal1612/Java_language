package If_Else;
import java.util.Scanner;
public class digitnumber_06 {
    static void main(String[] args) {
        System.out.print(" enter a four digit Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>999 &&  n<10000) System.out.print("4 digit Number");
        else System.out.println("Not a 4 digit Number");


    }
}
