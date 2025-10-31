package Basic_Cheeze;

public class IncrementDecrement {
    static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        x++; //x = x + 1  // post increment
        System.out.println(x);

        x--;  // x = x - 1  // post Decrement
        System.out.println(x);

        ++x;         // pre increment
        System.out.println(x);

        --x;         // pre Decrement
        System.out.println(x);

        int a = 10;
        int b = a++;
        System.out.println(a+" "+b);


        int c = 10;
        int d = --c;
        System.out.println(c+" "+d);
    }

    }


