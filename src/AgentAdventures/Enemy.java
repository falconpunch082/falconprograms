/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentAdventures;

/**
 *
 * @author Toshiba
 */
public class Enemy {
    
    private String name;
    private int health;
    private int initialHealth;
    private int attack;
    private int defense;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getInitialHealth() {
        return initialHealth;
    }

    public void setInitialHealth(int initialHealth) {
        this.initialHealth = initialHealth;
    }
    

    public Enemy(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.initialHealth = health;
    }
    
    public static Enemy encounterEnemy(int enemyType) {
        int enemyType1 = enemyType;
        if (enemyType == 0) {
            return new Enemy("Soldier", 100, 13, 10);
        } else if (enemyType == 1) {
            return new Enemy("Heavy", 200, 15, 12);
        } else if (enemyType == 2) {
            return new Enemy("FutureSoldier", 300, 17, 13);
        } else if (enemyType == 3) {
            return new Enemy("DRUG MECH", 400, 19, 14);
        }
        return null;
    }
    
}
