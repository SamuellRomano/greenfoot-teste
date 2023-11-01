import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class final1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class final1 extends World
{

    /**
     * Constructor for objects of class final1.
     * 
     */
    public final1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(826, 532, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        coisa2 coisa2 = new coisa2();
        addObject(coisa2,0,0);
    }
}
