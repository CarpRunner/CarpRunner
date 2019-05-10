
package carprunner;

public class CarpRunner {
    
    public static void main(String[] args) {

        Values value = new Values();
        
        while (value.gameRunning == false) {
            if(value.begin == false) {
                GameBegin begin = new GameBegin();
                begin.begin();
            }

///////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////LOAD GAME LOCATIONS//////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////
        
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
                
            }
        } 
    System.out.println("\n\n\n\n\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~GAME OVER~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n\n\n");
        
    }
}

    

