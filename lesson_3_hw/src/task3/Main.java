package task3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c, disk, x1, x2;
        Scanner num = new Scanner(System.in);
        System.out.print("Enter value a: ");
        a = num.nextDouble();
        System.out.print("Enter value b: ");
        b = num.nextDouble();
        System.out.print("Enter value c: ");
        c = num.nextDouble();

        disk = Math.pow(b, 2) - 4 * a * c;
        if (Math.sqrt(disk) > 0){
            x1 = (-b + Math.sqrt(disk)) / 2 * a;
            System.out.println("First root = " + x1);
            x2 = (-b - Math.sqrt(disk)) / 2 * a;
            System.out.println("Second root = " + x2);
        }else if (Math.sqrt(disk) == 0){
            x1 = (-b) / 2 * a;
            System.out.println("First root and second root = " + x1);
        }
        else{
            System.out.println("sqrt(Discriminant) < 0");
        }
    }
}