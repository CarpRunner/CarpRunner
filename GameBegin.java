
package carprunner;

import java.util.Scanner;

public class GameBegin {
     
    public static void begin() {
        Values value = new Values();
        Scanner cmd = new Scanner(System.in);
        
        //DEFAULT VALUES
        value.minEnemyAttack = 5;
        value.minEnemyHealth = 10;
        value.maxEnemyHealth = 10;
        value.maxEnemyAttack = 10;
        
        value.maxPlayerHealth = 200;
        value.playerLevel = 1;
        value.location = 1;
        value.health = 200;
        value.minAttackDamage = 5;
        value.maxAttackDamage = 10;
        value.numAlgae = 3;
        value.algaeHealAmt = 50;
        value.algaeDropPerc = 20;
        value.escapePerc = 100;
        
        value.enemyDiffNum = 3;
        
        value.begin = true;
        value.battleRun = false;
        value.gameRunning = false;
        
                
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tLife as a small river fish is very monotonous.\n\t"
                + "You dream of once leaving the day to day\n\tto find a new "
                + "life in the vast ocean!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        

    }
}
