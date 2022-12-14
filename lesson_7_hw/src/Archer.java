public class Archer extends Hero {
    private String name;
    private int damage = 80;
    public Archer(){}
    public Archer(String n) {
        name = n;
    }
    @Override
    public String GetName() {
        return name;
    }
    @Override
    public void attackEnemy(Enemy a) {
        System.out.println("Archer is attacking!");
        System.out.println("Enemy health is " + a.takeDamage(this.damage) + "\n");
    }
}
