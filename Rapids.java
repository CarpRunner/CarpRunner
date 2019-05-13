
package carprunner;

import java.util.Random;
import java.util.Scanner;


public class Rapids {
    public static void rapids() {
        Values value = new Values();
        Scanner cmd = new Scanner(System.in);
        Random rand = new Random();

        if(value.battleRun == false) {
            value.enemy = rand.nextInt(3);
                                
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~         The river begins to pick up speed as           ~~");
            System.out.println("~~                   you swim downstream                  ~~");
            System.out.println("~~        A dark figure is looming in the distance        ~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");


            value.enemy = rand.nextInt(value.enemyDiffNum);
            value.adjective = rand.nextInt(7);
            value.enemyHealth = value.minEnemyHealth + (int)(Math.random() 
                    * value.maxEnemyHealth);
            value.damageTaken = value.minEnemyAttack + (int)(Math.random() 
                    * value.maxEnemyHealth);

            BattleMode battle = new BattleMode();
            battle.battle();
        }



        if(value.health > 0) {

            System.out.println("\tCOMMANDS:\n\t >STATUS\n\t >LOOK\n\t >SWIM\n\t >RESET\t");
            
            System.out.println("~~~~~~");
            String command = cmd.nextLine();
            System.out.println("~~~~~~");

            switch(command) {
                case "status":
                case "Status":
                case "STATUS":
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("##  HP: " + value.health);
                    System.out.println("##  Level: " + value.playerLevel);
                    System.out.println("##  Location: Rapids");
                    System.out.println("##  Algae: " + value.numAlgae);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                break;

                case "look":
                case "Look":
                case "LOOK":
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("You are happy to have gotten away, but the river is getting");
                    System.out.println("rocky. You are beginning to lose control of your swimming.");
                    System.out.println("You turn around to go back to the grass, but the current");
                    System.out.println("is too strong.");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");                    

                break;

                case "swim":
                case "Swim":
                case "SWIM":
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Your body flops down the river. You now realize that this is");
                    System.out.println("not your river. How did you get here? Where is this river");
                    System.out.println("heading? You have no choice but to go with the flow.");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    value.location++;
                    value.battleRun = false;
                break;

                case "reset":
                case "Reset":
                case "RESET":
                    System.out.println("Are you sure you want to RESET your game?"
                            + "\n\tENTER 1 FOR YES\n\tENTER 2 FOR NO");
                    int reset = cmd.nextInt();
                    if(reset == 1) {
                        System.out.println("************************************************************");
                        System.out.println("************************************************************");
                        System.out.println("************************************************************");
                        System.out.println("***********************GAME RESETTING***********************");
                        System.out.println("************************************************************");
                        System.out.println("************************************************************");
                        System.out.println("************************************************************\n\n\n\n\n\n\n");
                        value.begin = false;
                        value.gameRunning = false;
                        break;
                    }
                else
                    System.out.println("\n~~INVALID COMMAND~~\n");
            }        
        }

    }
}
