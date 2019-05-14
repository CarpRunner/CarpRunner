// CarpRunner
// Author Dan Baker
// Copyright 2019

package carprunner;

import java.util.Random;
import java.util.Scanner;

public class TallGrass {
    public static void tallgrass() {
        Values value = new Values();
        Scanner cmd = new Scanner(System.in);
        Random rand = new Random();

        if(value.battleRun == false) {
            value.enemy = rand.nextInt(3);
                                
            System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~You find yourself in a patch of tall grass near the bank~~");
            System.out.println("~~     of a raging river. An enemy quickly approaches!    ~~");
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

            System.out.println("\tCOMMANDS:\n\t >STATUS\n\t >LOOK\n\t >SWIM\n\t >RESET");
            
            System.out.println("\n\n~~~~~~");
            String command = cmd.nextLine();
            System.out.println("~~~~~~\n\n");

            switch(command) {
                case "status":
                case "Status":
                case "STATUS": {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("##  HP: " + value.health);
                    System.out.println("##  Level: " + value.playerLevel);
                    System.out.println("##  Location: Tall Grass");
                    System.out.println("##  Algae: " + value.numAlgae);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                }
                break;

                case "look":
                case "Look":
                case "LOOK": {
                    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("\tThe water is raging. Who "
                            + "knows where these currents\n\t"
                            + "will bring you or if you will survive!"
                            + "\n\tOnly one direction to SWIM!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                }
                break;

                case "swim":
                case "Swim":
                case "SWIM": {
                    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("\t You leave the safety of the grass and\n\timmediately, "
                            + "the current sweeps you away!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
                    value.location++;
                    value.battleRun = false;
                }
                break;

                case "reset":
                case "Reset":
                case "RESET": {
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
                    }                        
                    break;
                
                }        
                default: {
                    System.out.println("\n~~INVALID COMMAND~~\n");
                }
            }
        }
        
    }
    
}

