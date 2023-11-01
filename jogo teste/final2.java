import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class final2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class final2 extends World
{

    /**
     * Constructor for objects of class final2.
     * 
     */
    public final2()
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
