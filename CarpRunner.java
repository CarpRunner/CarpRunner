// CarpRunner
// Author Dan Baker
//  2019
package carprunner;

public class CarpRunner {
    
    public static void main(String[] args) {

        Values value = new Values();
        
        //Keeps the game running and asks for inputs until the game is shut off
        while (value.gameRunning == false) {
            if(value.begin == false) {
                GameBegin begin = new GameBegin();
                begin.begin();
            }

///////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////LOAD GAME LOCATIONS//////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
        
            //determines which location your player is in
            switch(value.location) {
                
                
                case 1:{ 
                   //TALL GRASS
                   TallGrass grass = new TallGrass();
                   grass.tallgrass();
                   break;
                   
                }
                case 2: {
                    //RAPIDS
                    Rapids rap = new Rapids();
                    rap.rapids();
                     break;
                }
                
                case 3: {
                    //Waterfall (1st BOSS)
                    Waterfall water = new Waterfall();
                    water.waterfall();
                    break;
                }
                
            }
        } 
        
    //GAME OVER screen once the game has ended
    System.out.println("\n\n\n\n\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~GAME OVER~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n\n\n");
        
    }
}

    
