package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        float average = 0f;
        System.out.print(n0+" "+n1+" ");
        for(int i = 3; i <= 20; i++){
            n2=n0+n1;
            average += (float)n2;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }

        System.out.println("\nThe average is is " + average/20);
    }
}