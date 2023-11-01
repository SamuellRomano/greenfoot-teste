import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class helio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class helio extends balao_vermelho
{
    /**
     * Act - do whatever the helio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    

    public void act()
    {

        int speed = 5;

        this.setLocation(this.getX() - speed, this.getY());
    
        
    }
    
    public void acertarAlvo(){
    Actor b = getOneIntersectingObject(macaco.class);
    if (b != null){
    getWorld().removeObject(this);
    
    }
    }
}
