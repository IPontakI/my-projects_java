package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = num.nextInt();

        if (is_prime(n)){
            System.out.println("Your num " + n + " is a prime number");
        }else{
            System.out.println("Your num " + n + " is not a prime number");
        }
    }
    public static boolean is_prime(final int n){
        if (n <= 3){
            return n > 1;
        } else if (n % 2 == 0 || n % 3 == 0){
            return false;
        } else{
            for (int i = 5; i * i <= n; i += 6){
                if (n % i == 0 || n % (i + 2) == 0){
                    return false;
                }
            }
            return true;
        }
    }
}