
package carprunner;

import java.util.Scanner;

public class BattleMode {
    
    public void battle() {
        
        Scanner cmd = new Scanner(System.in);
        Values value = new Values();
        
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~BATTLE MODE~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("\t\t   " + value.enemyAdj[value.adjective] + " " + value.enemies[value.enemy]);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        while (value.battleRun == false) {

            System.out.println("\tYour HP: " + value.health);
            System.out.println("\t" + value.enemyAdj[value.adjective] + " " 
                    + value.enemies[value.enemy] + "'s HP:" + value.enemyHealth);
            System.out.println("\n\tCOMMANDS:");
            System.out.println("\t> Tail Spin");
            System.out.println("\t> Eat Algae");
            System.out.println("\t> Escape");

            System.out.println("\n\n~~~~~~~");
            String command = cmd.nextLine();
            System.out.println("~~~~~~~\n\n");


            switch (command) {
                case "Tail Spin":
                case "tail spin":
                case "TAIL SPIN":
                    int damageDealt = value.minAttackDamage + (int)(Math.random() * value.maxAttackDamage);

                    value.enemyHealth -= damageDealt;
                    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("             You spin with all your might!");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    System.out.println("\t The " + value.enemyAdj[value.adjective] + " "
                            + value.enemies[value.enemy] + " is hit for " + damageDealt);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

                    if(value.enemyHealth > 0) {
                    System.out.println("\t       The " + value.enemies[value.enemy] + " retaliates!");
                    System.out.println("\t          You are hit for " + value.damageTaken);
                    value.health -= value.damageTaken;
                    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
                    }
                    
                    else {
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
                        value.battleRun = true;

                    }
                    break;
                case "Eat Algae":
                case "eat algae":
                case "EAT ALGAE":
                    if(value.numAlgae > 0) {
                        if (value.health < value.maxPlayerHealth) {
                            value.health += value.algaeHealAmt;
                            value.numAlgae--;
                            
                            if (value.health > value.maxPlayerHealth) {
                                value.health = value.maxPlayerHealth;
                                System.out.println("\n\tHealth restored to full");
                                System.out.println("\tYour Hp: " + value.health);
                                System.out.println("\tYou have " + value.numAlgae + " algae left!");
                            }
                            else {
                                System.out.println("\tYour HP is restored by " + value.algaeHealAmt);
                                System.out.println("\tYour HP is now " + value.health);
                            System.out.println("\tYou have " + value.numAlgae + " algae left");
                            }
                        }
                        else{
                            System.out.println("\tYou cannot heal any more HP!");
                        }
                    }
                    else{
                        System.out.println("\n\tNo algae left!");

                    }   
                    break;
                case "Escape":
                case "escape":
                case "ESCAPE":
                    int chance = (int)(Math.random()*100);
                    if(chance < value.escapePerc){
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");                    
                        System.out.println("\nYou frantically smack the " + value.enemies[value.enemy] + 
                            " with your fin and swim away.");
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");


                    value.battleRun = true;
                    break;
                    }
                    else {
                        System.out.println("\tYou try to swim away, but the " + value.enemyAdj[value.adjective] +
                                " " + value.enemies[value.enemy] + " chases you down and attacks!");

                        value.damageTaken = (int)(Math.random() * value.maxEnemyAttack);
                        value.health -= value.damageTaken;

                        System.out.println("\t " + value.enemyAdj[value.adjective] + " " + value.enemies[value.enemy] + 
                                " hits you for " + value.damageTaken + "\n\tYour HP is now " + value.health);
                        break;
                    }
                default: {
                    System.out.println("\t " + value.invalidCmd);

                }


            }
        }

        if(value.health < 1) {
            System.out.println("Your limp body, bruised and battered, "
                    + "\nsinks to the deep dark depths of the Sea");
            value.battleRun = true;
            value.gameRunning = true;
        }

        if(value.enemyHealth <= 0) {
            System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t> ## " + value.enemies[value.enemy] + " was defeated! ##");
            System.out.println("\t> ##   You have " + value.health + " HP.   ##");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");

            if((int)(Math.random()*100) < value.algaeDropPerc) {
                value.numAlgae++;
                System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\t> ## Picked up Algae! ##");
                System.out.print("\t> ## Total Algae: " + value.numAlgae + " ##");
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
            }
        }
        value.battleRun = true;


    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~EXITING BATTLE MODE~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        
    }
}
