package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = num.nextInt();
        int sum = 0;

        for (int i = 0, b = 1; i < n; i++){
            System.out.println(b);
            sum += b;
            b += 2;
        }
        System.out.println("Result: " + sum);
    }
}