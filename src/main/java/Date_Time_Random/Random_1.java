package Date_Time_Random;

import java.util.Random;

public class Random_1 {
    public static void main(String[] args) {

        int minimum = 0;
        int maximum = 100;

        int randomNum_1 = minimum + (int)(Math.random() * maximum);     //Bug: randomNum can be bigger than maximum.
        System.out.println("Random 1 =>"+randomNum_1);

        Random rn = new Random();
        int n = maximum - minimum + 1;
        int i = rn.nextInt() % n;
        int randomNum_2 =  minimum + i;                                  //Bug: randomNum can be smaller than minimum.
        System.out.println("Random 2 =>"+randomNum_2);

    }
}
