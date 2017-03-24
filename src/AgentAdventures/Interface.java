/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentAdventures;

import java.awt.Component;
import java.awt.Dialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class Interface extends javax.swing.JFrame {

    int textCounter = 0;
    int enemyType = 0;

    public Interface() {
        initComponents();

        setResizable(false);
        setSize(778, 480);
    }

    public void changeMainLayout(Component comp) {
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.revalidate();

        jPanel1.add(comp);
        jPanel1.repaint();
        jPanel1.revalidate();
    }

    Player player = new Player("Agent", 125, 17, 13);
    Enemy enemy = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dialouge = new javax.swing.JPanel();
        txtName = new javax.swing.JLabel();
        txtDialouge = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnExecute = new javax.swing.JButton();
        Background = new javax.swing.JLabel();
        fight1 = new javax.swing.JPanel();
        txtPlayerHealth = new javax.swing.JLabel();
        txtEnemyHealth = new javax.swing.JLabel();
        btnDefend = new javax.swing.JButton();
        btnAttack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fight2 = new javax.swing.JPanel();
        txtPlayerHealth1 = new javax.swing.JLabel();
        txtEnemyHealth1 = new javax.swing.JLabel();
        btnDefend1 = new javax.swing.JButton();
        btnAttack1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fight3 = new javax.swing.JPanel();
        txtPlayerHealth2 = new javax.swing.JLabel();
        txtEnemyHealth2 = new javax.swing.JLabel();
        btnDefend2 = new javax.swing.JButton();
        btnAttack2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        fight4 = new javax.swing.JPanel();
        txtPlayerHealth3 = new javax.swing.JLabel();
        txtEnemyHealth3 = new javax.swing.JLabel();
        btnDefend3 = new javax.swing.JButton();
        btnAttack3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new java.awt.CardLayout());

        dialouge.setLayout(null);

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtName.setText("Undercover Agent :");
        dialouge.add(txtName);
        txtName.setBounds(30, 360, 130, 30);

        txtDialouge.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txtDialouge.setText("Hello, Agent.");
        dialouge.add(txtDialouge);
        txtDialouge.setBounds(30, 380, 570, 50);

        btnExit.setText("Exit Game");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        dialouge.add(btnExit);
        btnExit.setBounds(610, 340, 120, 40);

        btnExecute.setText("Continue");
        btnExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecuteActionPerformed(evt);
            }
        });
        dialouge.add(btnExecute);
        btnExecute.setBounds(613, 393, 120, 40);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/20160702_101400.jpg"))); // NOI18N
        Background.setText("jLabel1");
        dialouge.add(Background);
        Background.setBounds(0, 0, 771, 460);

        jPanel1.add(dialouge, "card2");

        fight1.setLayout(null);

        txtPlayerHealth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPlayerHealth.setForeground(new java.awt.Color(0, 255, 102));
        txtPlayerHealth.setText("125/125");
        fight1.add(txtPlayerHealth);
        txtPlayerHealth.setBounds(550, 370, 70, 30);

        txtEnemyHealth.setBackground(new java.awt.Color(255, 255, 255));
        txtEnemyHealth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEnemyHealth.setForeground(new java.awt.Color(255, 0, 0));
        txtEnemyHealth.setText("100/100");
        fight1.add(txtEnemyHealth);
        txtEnemyHealth.setBounds(150, 20, 70, 30);

        btnDefend.setText("Defend and Get HP");
        btnDefend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefendActionPerformed(evt);
            }
        });
        fight1.add(btnDefend);
        btnDefend.setBounds(590, 410, 160, 40);

        btnAttack.setText("Attack");
        btnAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttackActionPerformed(evt);
            }
        });
        fight1.add(btnAttack);
        btnAttack.setBounds(630, 360, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RTR4JX5Q-1024x682.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        fight1.add(jLabel1);
        jLabel1.setBounds(0, 0, 778, 465);

        jPanel1.add(fight1, "card3");

        fight2.setLayout(null);

        txtPlayerHealth1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPlayerHealth1.setForeground(new java.awt.Color(0, 255, 102));
        txtPlayerHealth1.setText("125/125");
        fight2.add(txtPlayerHealth1);
        txtPlayerHealth1.setBounds(560, 370, 70, 30);

        txtEnemyHealth1.setBackground(new java.awt.Color(255, 255, 255));
        txtEnemyHealth1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEnemyHealth1.setForeground(new java.awt.Color(255, 0, 0));
        txtEnemyHealth1.setText("100/100");
        fight2.add(txtEnemyHealth1);
        txtEnemyHealth1.setBounds(150, 20, 70, 30);

        btnDefend1.setText("Defend and get HP");
        btnDefend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefend1ActionPerformed(evt);
            }
        });
        fight2.add(btnDefend1);
        btnDefend1.setBounds(590, 410, 160, 40);

        btnAttack1.setText("Attack");
        btnAttack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttack1ActionPerformed(evt);
            }
        });
        fight2.add(btnAttack1);
        btnAttack1.setBounds(630, 360, 120, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RTR4JX5Q-1024x682-1.jpg"))); // NOI18N
        jLabel3.setText("jLabel1");
        fight2.add(jLabel3);
        jLabel3.setBounds(0, 0, 778, 465);

        jPanel1.add(fight2, "card3");

        fight3.setLayout(null);

        txtPlayerHealth2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPlayerHealth2.setForeground(new java.awt.Color(0, 255, 102));
        txtPlayerHealth2.setText("125/125");
        fight3.add(txtPlayerHealth2);
        txtPlayerHealth2.setBounds(560, 370, 70, 30);

        txtEnemyHealth2.setBackground(new java.awt.Color(255, 255, 255));
        txtEnemyHealth2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEnemyHealth2.setForeground(new java.awt.Color(255, 0, 0));
        txtEnemyHealth2.setText("100/100");
        fight3.add(txtEnemyHealth2);
        txtEnemyHealth2.setBounds(150, 20, 70, 30);

        btnDefend2.setText("Defend and get HP");
        btnDefend2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefend2ActionPerformed(evt);
            }
        });
        fight3.add(btnDefend2);
        btnDefend2.setBounds(590, 410, 160, 40);

        btnAttack2.setText("Attack");
        btnAttack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttack2ActionPerformed(evt);
            }
        });
        fight3.add(btnAttack2);
        btnAttack2.setBounds(630, 360, 120, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RTR4JX5Q-1024x682-2.jpg"))); // NOI18N
        jLabel4.setText("jLabel1");
        fight3.add(jLabel4);
        jLabel4.setBounds(0, 0, 778, 465);

        jPanel1.add(fight3, "card3");

        fight4.setLayout(null);

        txtPlayerHealth3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPlayerHealth3.setForeground(new java.awt.Color(0, 255, 102));
        txtPlayerHealth3.setText("125/125");
        fight4.add(txtPlayerHealth3);
        txtPlayerHealth3.setBounds(550, 370, 70, 30);

        txtEnemyHealth3.setBackground(new java.awt.Color(255, 255, 255));
        txtEnemyHealth3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEnemyHealth3.setForeground(new java.awt.Color(255, 0, 0));
        txtEnemyHealth3.setText("100/100");
        fight4.add(txtEnemyHealth3);
        txtEnemyHealth3.setBounds(150, 20, 70, 30);

        btnDefend3.setText("Defend and get HP");
        btnDefend3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefend3ActionPerformed(evt);
            }
        });
        fight4.add(btnDefend3);
        btnDefend3.setBounds(590, 410, 160, 40);

        btnAttack3.setText("Attack");
        btnAttack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttack3ActionPerformed(evt);
            }
        });
        fight4.add(btnAttack3);
        btnAttack3.setBounds(630, 360, 120, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RTR4JX5Q-1024x682-3.jpg"))); // NOI18N
        jLabel5.setText("jLabel1");
        fight4.add(jLabel5);
        jLabel5.setBounds(0, 0, 778, 465);

        jPanel1.add(fight4, "card3");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 770, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecuteActionPerformed
        textCounter++;
        if (textCounter == 0) {
            txtDialouge.setText("Hello, Agent.");
        } else if (textCounter == 1) {
            txtDialouge.setText("El Diablo is here.");
        } else if (textCounter == 2) {
            txtDialouge.setText("There are guards there.");
        } else if (textCounter == 3) {
            txtDialouge.setText("Kill them all. Good luck.");
            btnExecute.setText("Execute Mission");
        } else if (textCounter == 4) {
            changeMainLayout(fight1);
            enemy = Enemy.encounterEnemy(enemyType);
        }

    }//GEN-LAST:event_btnExecuteActionPerformed

    private void btnDefendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefendActionPerformed
        SystemBackBone.defense(player, enemy);
        txtPlayerHealth.setText(player.getHealth() + "/125");
        txtEnemyHealth.setText(enemy.getHealth() + "/" + enemy.getInitialHealth());
    }//GEN-LAST:event_btnDefendActionPerformed

    private void btnAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttackActionPerformed
        SystemBackBone.attack(player, enemy);
        txtPlayerHealth.setText(player.getHealth() + "/125");
        txtEnemyHealth.setText(enemy.getHealth() + "/" + enemy.getInitialHealth());

        if (enemy.getHealth() <= 0) {
            enemyType++;
            if (enemyType == 1) {
                player.setHealth(125);
                changeMainLayout(fight2);
                enemy = Enemy.encounterEnemy(enemyType);
            }
        }

        if (player.getHealth() <= 0) {
            JOptionPane.showMessageDialog(this, "You died.");
        }
    }//GEN-LAST:event_btnAttackActionPerformed

    private void btnDefend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefend1ActionPerformed
        SystemBackBone.defense(player, enemy);
        txtPlayerHealth1.setText(player.getHealth() + "/125");
        txtEnemyHealth1.setText(enemy.getHealth() + "/" + enemy.getInitialHealth());
    }//GEN-LAST:event_btnDefend1ActionPerformed

    private void btnAttack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttack1ActionPerformed
        SystemBackBone.attack(player, enemy);
        txtPlayerHealth1.setText(player.getHealth() + "/125");
        txtEnemyHealth1.setText(enemy.getHealth() + "/" + enemy.getInitialHealth());

        if (enemy.getHealth() <= 0) {
            enemyType++;
            if (enemyType == 2) {
                player.setHealth(125);
                changeMainLayout(fight3);
                enemy = Enemy.encounterEnemy(enemyType);
            }
        }

        if (player.getHealth() <= 0) {
            JOptionPane.showMessageDialog(this, "You died.");
            System.exit(0);
        }
    }//GEN-LAST:event_btnAttack1ActionPerformed

    private void btnDefend2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefend2ActionPerformed
        SystemBackBone.defense(player, enemy);
        txtPlayerHealth2.setText(player.getHealth() + "/125");
        txtEnemyHealth2.setText(enemy.getHealth() + "/" + enemy.getInitialHealth());
    }//GEN-LAST:event_btnDefend2ActionPerformed

    private void btnAttack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttack2ActionPerformed
        SystemBackBone.attack(player, enemy);
        txtPlayerHealth2.setText(player.getHealth() + "/125");
        txtEnemyHealth2.setText(enemy.getHealth() + "/" + enemy.getInitialHealth());

        if (enemy.getHealth() <= 0) {
            enemyType++;
            if (enemyType == 3) {
                player.setHealth(125);
                changeMainLayout(fight4);
                enemy = Enemy.encounterEnemy(enemyType);
            }
        }

        if (player.getHealth() <= 0) {
            JOptionPane.showMessageDialog(this, "You died.");
            System.exit(0);
        }
    }//GEN-LAST:event_btnAttack2ActionPerformed

    private void btnDefend3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefend3ActionPerformed
        SystemBackBone.defense(player, enemy);
        txtPlayerHealth3.setText(player.getHealth() + "/125");
        txtEnemyHealth3.setText(enemy.getHealth() + "/" + enemy.getInitialHealth());
    }//GEN-LAST:event_btnDefend3ActionPerformed

    private void btnAttack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttack3ActionPerformed
        SystemBackBone.attack(player, enemy);
        txtPlayerHealth3.setText(player.getHealth() + "/125");
        txtEnemyHealth3.setText(enemy.getHealth() + "/" + enemy.getInitialHealth());

        if (enemy.getHealth() <= 0) {
            enemyType++;
            if (enemyType == 4) {

                JOptionPane.showMessageDialog(this, "You completed the mission, Agent. Well done. \n Made by FalconPunch and PhantomX");
                System.exit(0);
            }
        }

        if (player.getHealth() <= 0) {
            JOptionPane.showMessageDialog(this, "You died.");
            System.exit(0);
        }
    }//GEN-LAST:event_btnAttack3ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnAttack;
    private javax.swing.JButton btnAttack1;
    private javax.swing.JButton btnAttack2;
    private javax.swing.JButton btnAttack3;
    private javax.swing.JButton btnDefend;
    private javax.swing.JButton btnDefend1;
    private javax.swing.JButton btnDefend2;
    private javax.swing.JButton btnDefend3;
    private javax.swing.JButton btnExecute;
    private javax.swing.JButton btnExit;
    private javax.swing.JPanel dialouge;
    private javax.swing.JPanel fight1;
    private javax.swing.JPanel fight2;
    private javax.swing.JPanel fight3;
    private javax.swing.JPanel fight4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel txtDialouge;
    private javax.swing.JLabel txtEnemyHealth;
    private javax.swing.JLabel txtEnemyHealth1;
    private javax.swing.JLabel txtEnemyHealth2;
    private javax.swing.JLabel txtEnemyHealth3;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtPlayerHealth;
    private javax.swing.JLabel txtPlayerHealth1;
    private javax.swing.JLabel txtPlayerHealth2;
    private javax.swing.JLabel txtPlayerHealth3;
    // End of variables declaration//GEN-END:variables
}
