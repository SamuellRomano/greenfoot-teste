import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class coisa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coisa extends Actor
{
    /**
     * Act - do whatever the coisa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public int timer =0;
        public int entercounter=0;
        public boolean diag11 = true;
        public boolean diag22 = true;
    
    public void act()
    {
                if(Greenfoot.isKeyDown("enter") && timer == 0){
            timer = 2;
            entercounter++;

        }
        else{
        if(!Greenfoot.isKeyDown("enter")){
            timer = 0;
        }
        }
        if(entercounter==1 && diag11){
            diag11 = false;
            diag1 diag1 = new diag1();
            getWorld().addObject(diag1,413,266);
            
        }

        if(entercounter==2 && diag22){
            diag22 = false;
         diag2 diag2 = new diag2();
         getWorld().addObject(diag2,413,266);
        }

            if(entercounter==3){
            Mundo mundo = new Mundo();
            Greenfoot.setWorld(mundo);
        }
        
    }
}
