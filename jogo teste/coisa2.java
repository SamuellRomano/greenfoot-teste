import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class coisa2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coisa2 extends Actor
{
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
            creditos creditos = new creditos();
            getWorld().addObject(creditos,413,266);
            
        }
        
    }
}
