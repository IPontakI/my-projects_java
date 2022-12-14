

public class Enemy implements Mortal {
    private int health = 0;
    private int damage = 20;

    public Enemy(int h){
        health = h;
    }
    public int SetHealth(int h){
        return health = h;
    }
    public int GetHealth(){
        return health;
    }
    public int takeDamage(int damage){
        return health = health - damage;
    }

    public boolean isAlive(){
        if(health > 0){
            return true;
        }else
            return false;

    }

}
