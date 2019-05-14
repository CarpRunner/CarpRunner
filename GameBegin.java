// CarpRunner
// Author Dan Baker
//  2019

package carprunner;

import java.util.Scanner;

public class GameBegin {
     
    public static void begin() {
        Values value = new Values();
        Scanner cmd = new Scanner(System.in);
        
        //DEFAULT VALUES
        
        //enemy values
        value.minEnemyAttack = 5;
        value.minEnemyHealth = 20;
        value.maxEnemyHealth = 10;
        value.maxEnemyAttack = 10;
        value.enemyDiffNum = 3;
        
        //player values
        value.maxPlayerHealth = 200;
        value.playerLevel = 1;
        value.location = 1;
        value.health = 200;
        value.minAttackDamage = 10;
        value.maxAttackDamage = 10;
        value.escapePerc = 40;
        
        //algae values
        value.numAlgae = 3;
        value.algaeHealAmt = 100;
        value.algaeDropPerc = 40;
        
        //game values
        value.gotItem = false;
        value.begin = true;
        value.battleRun = false;
        value.gameRunning = false;
        
        //OPENING GRAPHIC
        
        System.out.println("\n\n\n          ,gggg,                                  ,ggggggggggg,                                                              ");
        System.out.println("       ,88'''Y8b,                               dP'''88''''''Y8,                                                             ");
        System.out.println("      d8'     `Y8                               Yb,  88      `8b                                                             ");
        System.out.println("     d8'   8b  d8                                `'  88      ,8P                                                             ");
        System.out.println("    ,8I    'Y88P'                                    88aaaad8P'                                                              ");
        System.out.println("    I8'             ,gggg,gg   ,gggggg,  gg,gggg,    88''''Yb,    gg      gg   ,ggg,,ggg,    ,ggg,,ggg,    ,ggg,    ,gggggg, ");
        System.out.println("    d8             dP'  'Y8I   dP''''8I  I8P'  'Yb   88     '8b   I8      8I  ,8' '8P' '8,  ,8' '8P' '8,  i8' '8i   dP''''8I ");
        System.out.println("    Y8,           i8'    ,8I  ,8'    8I  I8'    ,8i  88      `8i  I8,    ,8I  I8   8I   8I  I8   8I   8I  I8, ,8I  ,8'    8I ");
        System.out.println("    `Yba,,_____, ,d8,   ,d8b,,dP     Y8,,I8 _  ,d8'  88       Yb,,d8b,  ,d8b,,dP   8I   Yb,,dP   8I   Yb, `YbadP' ,dP     Y8,");
        System.out.println("      `'Y8888888 P'Y8888P'`Y88P      `Y8PI8 YY88888P 88        Y88P''Y88P'`Y88P'   8I   `Y88P'   8I   `Y8888P'Y8888P      `Y8");
        System.out.println("                             I8                                                                                              ");
        System.out.println("                             I8                                                                                              ");
        System.out.println("                             I8                                                                                              \n\n");
        
                
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tLife as a small river fish is very monotonous.\n\t"
                + "You dream of once leaving the day to day\n\tto find a new "
                + "life in the vast ocean!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        

    }
}
