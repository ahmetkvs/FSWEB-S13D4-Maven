package org.example;

public enum Weapon {
    SWORD(50, 1.2),
    LIGHTSABER(80, 1.8),
    RAYGUN(65, 2.1),
    LONGCLAW(70, 1.5);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
