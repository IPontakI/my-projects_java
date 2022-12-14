import java.util.Scanner;

public class BattleGround {
    public static void main(String[] args) {
        Enemy Vasya = new Enemy(150);
        Mage Valentin = new Mage("Valentin");

        Scanner num = new Scanner(System.in);
        System.out.print("Enter number of hits: ");
        int N  = num.nextInt();

        for (int i = 0; i < N; i++){
            Valentin.attackEnemy(Vasya);
            if (Vasya.GetHealth() <= 0){
                System.out.println("Vasya is dead");
                break;
            }
        }

        if(Vasya.isAlive()){
            System.out.println("Vasya stay alive");
        }
    }
}
