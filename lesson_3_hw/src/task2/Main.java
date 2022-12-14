package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter value between 0 to 10: ");
        int a = num.nextInt();

        switch (a){
            case 1: {
                System.out.println(a + " гривня");
                break;
             }
            case 2: case 3: case 4:{
                System.out.println(a + " гривні");
                break;
            }
            case 0: case 5: case 6: case 7: case 8: case 9: case 10:{
                System.out.println(a + " гривень");
                break;
            }
            default: {
                System.out.println("Ви ввели невірне значення");
                break;
            }
        }
    }
}