// CarpRunner
// Author Dan Baker
//  2019

package carprunner;

import java.util.Random;
import java.util.Scanner;

public class FamishedStork {
    
    public void stork() {
        

        int storkDamage = 40;
        int storkAttack;
        int storkHealth = 100;
        
        Random rand = new Random();
        Scanner cmd = new Scanner(System.in);
        Values value = new Values();
        System.out.println("\n\n               ':;'oo");
        System.out.println("           .,oo:0000';;;..");
        System.out.println("           ..,,''''',;::clcccccccc:;;;,,''.......");
        System.out.println("                       ..;lxOOkxddollodxkkxc,;::::,'.");
        System.out.println("                    .';codxO00OOxxdoodxxxxkdc:;;,,;:;'.");
        System.out.println("                 .,okOOOOOkkkkOOOkkkxkkxxxxkdccc::,,'''''..");
        System.out.println("                'lkOOkxxxxxddxxkkkkOOOOOOOkkdcccc::;,,;:clc.");
        System.out.println("              .;dkkxddollloooooddxkOO00kdlc:::cloolc;;:cldl'");
        System.out.println("             'lxxxdoolcc::ccclodxkxol:'.      ':clll:::coo;.");
        System.out.println("           .coooooolllllc:cloddoc,.            ':::ccclloc:clc:,.");
        System.out.println("         .;dxdollolloollolc:;,.                 .:ccllodo'.'cool:.");
        System.out.println("        .lkOkxxxdoooodddl,.                      .;c:lodl.");
        System.out.println("       'lxkkxdk0kddxxdc'                          .;;;col.");
        System.out.println("      .;ldddolOOkkxo,.                             ...,cc;");
        System.out.println("       'c:co;o0dxO:                                    ...");
        System.out.println("        ..:''kk:''");
                                                  
                                                       
        System.out.println("\n\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^^^Prepare For Battle!^^^^^^^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^FAMISHED STORK^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n\n");

        while (value.battleRun == false) {

            value.damageDealt = value.minAttackDamage + rand.nextInt(value.maxAttackDamage);
            value.damageTaken = storkDamage + rand.nextInt(5);
                        
            System.out.println("\tYour HP: " + value.health);
            System.out.println("\tFAMISHED STORK's HP: " + storkHealth);
            System.out.println("\n\tCOMMANDS:");
            System.out.println("\t> Tail Spin");
            System.out.println("\t> Eat Algae");
            System.out.println("\t> Examine");

            System.out.println("\n\n~~~~~~~");
            String command = cmd.nextLine();
            System.out.println("~~~~~~~\n\n");


            switch (command) {
                case "Tail Spin":
                case "tail spin":
                case "TAIL SPIN": {
                    
                    
                    storkAttack = rand.nextInt(10);
                    //30% your shot misses, stork does 50% dmg
                    //10% your shot hits, stork does critical hit, 2x dmg
                    //40% your shot hits, his hits like normal
                    //20% LIGHTNING SURGE!!! ~~60 dmg and stuns opponent
                    switch (storkAttack) {
                        case 1:
                        case 2:
                        case 3:
                        case 4: {
                            
                            storkHealth -= value.damageDealt;
                            System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                            System.out.println("             You spin with all your might!");
                            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                            System.out.println("            The FAMISHED STORK is hit for " + value.damageDealt);
                            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

                            if(storkHealth > 0) {
                                System.out.println("             The FAMISHED STORK retaliates!");
                                System.out.println("                   You are hit for " + value.damageTaken);
                                value.health -= value.damageTaken;
                                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                                }

                            else {
                                System.out.println("************************************************************");
                                System.out.println("************************************************************");
                                System.out.println("The fowl drops like a stone. You cheer in victory before");
                                System.out.println("remembering your horrifying state of free fall. You hope there");
                                System.out.println("are no rocks at the bottom of your descent!");
                                System.out.println("************************************************************");
                                System.out.println("************************************************************");

                                value.location++;
                                value.battleRun = true;
                                
                            }
                        }
                        break;
                        case 5: {
                            
                            value.health = - (value.damageTaken * 2) + value.health;
                            storkHealth -= value.damageDealt;
                            
                            System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                            System.out.println("             You spin with all your might!");
                            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                            System.out.println("            The FAMISHED STORK is hit for " + (value.damageDealt * 2));
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

                            if(storkHealth > 0) {
                                System.out.println("\n\n////////////////////////////////////////////////////////////");
                                System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
                                System.out.println("    The FAMISHED STORK retaliates with a CLAW SWIPE");
                                System.out.println("                   You are hit for " + (value.damageTaken *2));
                                System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
                                System.out.println("////////////////////////////////////////////////////////////\n\n");
                                
                                if(value.health < 1) {

                                    System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                    System.out.println("         Your limp body, bruised and battered, sinks "
                                            + "                     to the deep dark depths of the Sea");
                                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
                                    value.battleRun = true;
                                    value.gameRunning = true;
                                }
                            }

                            else {
                            System.out.println("************************************************************");
                            System.out.println("************************************************************");
                            System.out.println("The fowl drops like a stone. You cheer in victory before");
                            System.out.println("remembering your horrifying state of free fall. You hope there");
                            System.out.println("are no rocks at the bottom of your descent!");
                            System.out.println("************************************************************");
                            System.out.println("************************************************************");

                            value.location++;
                            value.battleRun = true;
                            }
                                    
                            
                        }
                        
                        break;
                        
                        case 6:
                        case 7:
                        case 8: {
                            
                            value.health -= (value.damageTaken / 2);
                            
                            System.out.println("\n\nL'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L");
                            System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
                            System.out.println(" THE FAMISHED STORK DASHES AWAY AND YOUR ATTACK MISSES!");
                            System.out.println("         THE FAMISHED STORK HITS FOR 1/2 DAMAGE");
                            System.out.println("                     YOUR HP : " + value.health);
                            System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");          
                            System.out.println("L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L'L\n\n");
                        }                            
                        break;
                        
                        case 9:
                        case 0: {
                            
                            value.damageDealt  = 55 + rand.nextInt(10);
                            storkHealth -= value.damageDealt;
                            
                            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                            System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV");
                            System.out.println("\n              LIGHTNING SHOOTS FROM YOUR TAIL              ");
                            System.out.println("               HITS THE FAMISH STORK FOR " + value.damageDealt );
                            System.out.println("          THE BIRD IS STUNNED AND DEALS NO DAMAGE          \n");
                            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
                            
                            if (storkHealth < 1) {
                                System.out.println("************************************************************");
                                System.out.println("************************************************************");
                                System.out.println("The fowl drops like a stone. You cheer in victory before");
                                System.out.println("remembering your horrifying state of free fall. You hope there");
                                System.out.println("are no rocks at the bottom of your descent!");
                                System.out.println("************************************************************");
                                System.out.println("************************************************************\n");
                                
                                value.battleRun = true;
                            }
                            
                            if (value.begin == true) {
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                                System.out.println("    You wonder where this newly found power came from.");
                                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");


                                value.damageDealt = value.minAttackDamage + (int)(Math.random() * value.maxAttackDamage);
                            }
                        }    
                        break;
                    }
                }
                break;
                    
                   
                case "Eat Algae":
                case "eat algae":
                case "EAT ALGAE": {
                    if(value.numAlgae > 0) {
                        if (value.health < value.maxPlayerHealth) {
                            value.health += value.algaeHealAmt;
                            value.numAlgae--;
                            
                            if (value.health >= value.maxPlayerHealth) {
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
                }    
                break;
                
                case "Examine":
                case "examine":
                case "EXAMINE": {

                    if(value.gotItem == false){
                    
                        value.numAlgae++;
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("The FAMISHED STORK is going for the kill! You look around and");
                        System.out.println("find some ALGAE falling near you. Just as you grab the ALGAE,");
                        System.out.println("the FAMISHED STORK swoops around for an attack! Fight for your");
                        System.out.println("life, because there is no escape!\n");
                        System.out.println("                     ALGAE : " + value.numAlgae);
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                        value.gotItem = true;
                    }
                    else {
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("\nThe FAMISHED STORK is going for the kill! You look around,");
                        System.out.println("but there is no more algae. You need to get away from this");
                        System.out.println("with what you have! You begin to feel a tingle in your fins.");
                        System.out.println("You are filled with a sense of determination!\n");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    }
                    break;

                    
                    }
                default: 
                    System.out.println("\n~~INVALID COMMAND~~\n");

            }

        }
        

        if (value.health < 1) {
            System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Your limp body, bruised and battered, "
                    + "sinks to the deep dark depths of the Sea.");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
            value.battleRun = true;
            value.gameRunning = true;
        }

        if(storkHealth < 1 && value.health > 0) {
            System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t ## The FAMISHED STORK was defeated! ##");
            System.out.println("\t ##   You have " + value.health + " HP.   ##");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");

            
            value.numAlgae = (value.numAlgae + 3);
            System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("                  ## Picked up 3 Algae! ##");
            System.out.print("                      ## Total Algae: " + value.numAlgae + " ##");
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
            value.battleRun = true;
            
            if (value.begin == false){
                System.out.println("The power left as quickly as it came. No matter how hard you");
                System.out.println("try, you cannot reproduce the shocking maneuver you pulled off\n\n");
            }   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            value.begin = true;
        }
        
        value.begin = false;
        value.gotItem = false;
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~EXITING BATTLE MODE~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
    
    }
}

