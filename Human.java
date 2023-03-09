
import java.util.Random;

public abstract class Human {
    
    public Random rand = new Random();
    
    private String name;
    private boolean alive = true;
    private int sobriety = 10;
    private int luck = 2 + rand.nextInt(9); // 2 - 10
    private int strength = 5;
    private int speed = 5;
    private int intelligence = 5;
    private int stamina = 10;
    private int health = 10;
    private int satietyThirst = 10;
    private int satietyHunger = 10;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean getAlive() {
        return this.alive;
    }
    
    public int setSobriety(int sobriety) {
        if(sobriety > 10){
            this.sobriety = 10;
            return 1;   
        }else if(sobriety <= 0){
            this.sobriety = 0;
            return -1;
        }
        
        this.sobriety = sobriety;
        return 0;
    }

    public int getSobriety() {
        return this.sobriety;
    }
    
    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getLuck() {
        return this.luck;
    }
    
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return this.strength;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }
    
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return this.intelligence;
    }
    
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return this.stamina;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }
    
    public int setSatietyThirst(int satietyThirst) {
        if(satietyThirst > 10){
            this.satietyThirst = 10;
            return 1;   
        }else if(satietyThirst <= 0){
            this.satietyThirst = 0;
            return -1;
        }
        
        this.satietyThirst = satietyThirst;
        return 0;
    }

    public int getSatietyThirst() {
        return this.satietyThirst;
    }
    
    public int setSatietyHunger(int satietyHunger) {
        if(satietyHunger > 10){
            this.satietyHunger = 10;
            return 1;
        }else if(satietyHunger <= 0){
            this.satietyHunger = 0;
            return -1;
        }
        
        this.satietyHunger = satietyHunger;
        return 0;
    }

    public int getSatietyHunger() {
        return this.satietyHunger;
    }

}