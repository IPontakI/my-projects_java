public abstract class Hero {
    private String name;
    public Hero() {
    }

    public Hero(String n) {
        name = n;
    }

    public String GetName() {
        return name;
    }

    public abstract void attackEnemy(Enemy a);
}



