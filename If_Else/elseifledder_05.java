package If_Else;

import java.util.Scanner;

public class elseifledder_05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter cost price : ");
        int cp = sc.nextInt();
        System.out.print(" Enter  selling price : ");
        int sp = sc.nextInt();

        
        if(sp > cp) System.out.print( (sp - cp)+ " " + "RS."+"Profit");
        else if (cp > sp ) System.out.print( (cp - sp) + " " + "RS."+"Loss");
        else System.out.println ("No profit No loss");
    }
}
