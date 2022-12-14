public class TrainingGround {
    public static void main(String[] args) {
        Enemy Maks = new Enemy(300);
        //Hero Kolya = new Hero("Kolya");
        Warrior SpiderMan = new Warrior("SpiderMan");
        Mage Bob = new Mage("Bob");
        Archer Linda = new Archer("Linda");

        System.out.println("Warrior name is " + SpiderMan.GetName());
        SpiderMan.attackEnemy(Maks);

        System.out.println("Mage name is " + Bob.GetName());
        Bob.attackEnemy(Maks);

        System.out.println("Archer name is " + Linda.GetName());
        Linda.attackEnemy(Maks);





    }
}
