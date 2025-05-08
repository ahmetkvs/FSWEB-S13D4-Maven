package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon){
        if(healthPercentage > 100){
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int healthRemaining(){
        return this.healthPercentage;
    }

    public void setHealthPercentage(int healthPercentage){
        this.healthPercentage = healthPercentage;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        if(this.healthPercentage - damage < 0) {
            this.healthPercentage = 0;
            System.out.println(this.name + " player has been knocked out of game");
        } else{
            this.healthPercentage -= damage;
        }
    }

    public void restoreHealth(int healthPotion){
        if(this.healthPercentage + healthPotion > 100) {
            this.healthPercentage = 100;
        } else{
            this.healthPercentage += healthPotion;
        }
    }
}
