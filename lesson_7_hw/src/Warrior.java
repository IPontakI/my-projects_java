public class Warrior extends Hero {
    private String name;
    private int damage = 100;
    public Warrior(){}
    public Warrior(String n) {
        name = n;
    }
    @Override
    public String GetName() {
        return name;
    }
    @Override
    public void attackEnemy(Enemy a) {
        System.out.println("Warrior is attacking!");
        System.out.println("Enemy health is " + a.takeDamage(this.damage) + "\n");
    }

}
