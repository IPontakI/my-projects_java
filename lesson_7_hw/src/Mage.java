
public class Mage extends Hero {
    private String name;
    private int damage = 75;
    public Mage(){}
    public Mage(String n) {
        name = n;
    }
    @Override
    public String GetName() {
        return name;
    }
    @Override
    public void attackEnemy(Enemy a) {
        System.out.println("Mage is attacking!");
        System.out.println("Enemy health is " + a.takeDamage(this.damage) + "\n");
    }
}
