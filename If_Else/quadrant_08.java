package If_Else;

import java.util.Scanner;

public class quadrant_09 {
    static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a x cordinate : ");
            int x = sc.nextInt();
            System.out.print("Enter a y cordinate : ");
            int y = sc.nextInt();
            if (x==0 && y==0) {
                System.out.print("Point is lies on the origin");
            }

            else if(x == 0 ) System.out.print("Point is lies  on the Y-axis.");

            else if(y == 0 ) System.out.print("Point is lies  on the X-axis.");

            else if(x > 0 && y > 0 ) System.out.print("Point is lies  on the 1St quadrant");

            else if(x < 0 && y > 0 ) System.out.println("Point is lies  on the 2nd quadrant");

            else if(x < 0 && y < 0 ) System.out.println("Point is lies  on the 3rd quadrant");

            else System.out.println("Point is lies on the 4th quadrant");

            sc.close();
        }

    }

