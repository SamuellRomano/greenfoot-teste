import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cachorro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cachorro extends Actor
{

        GifImage myGif = new GifImage("cachorroretardado.gif");
    /**
     * Act - do whatever the cachorro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(myGif.getCurrentImage());
    }
}
