import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tela here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tela extends World
{

    
    public int entercounter = 0;
    public int timer =0;
    public boolean diag11 = true;
    public boolean diag22 = true;

    /**
     * Constructor for objects of class tela.
     * 
     */
    public tela()
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

        coisa coisa = new coisa();
        addObject(coisa,0,532);
        coisa.setLocation(0,0);
    }
}
