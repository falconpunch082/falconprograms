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
public class SystemBackBone {
    
    static Player player = null;
    static Enemy enemy = null;
    
    public static void attack(Player p, Enemy e) {
        player = p;
        enemy = e;
        
        int attackPts = player.getAttack() - enemy.getDefense();
        enemy.setHealth(enemy.getHealth() - attackPts);
        
        int enemyAttackPts = enemy.getAttack() - player.getDefense();
        player.setHealth(player.getHealth() - enemyAttackPts);
    }
    
    public static void defense(Player p, Enemy e) {
        player = p;
        enemy = e;
        
        int enhancedDefense = player.getDefense() * 2;
        
        int enemyAttackPts = enemy.getAttack() - enhancedDefense;
        player.setHealth(player.getHealth() - enemyAttackPts);
        
        if (player.getHealth() >= 125) {
            player.setHealth(125);
        }
    }
}
