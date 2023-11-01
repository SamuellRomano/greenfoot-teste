import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    GreenfootSound tema = new GreenfootSound("theme.mp3");

    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(826, 532, 1); 
        prepare();
        tema.play();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        balao_vermelho balao_vermelho = new balao_vermelho();
        addObject(balao_vermelho,189,183);
        balao_vermelho.setLocation(196,230);
        macaco macaco = new macaco();
        addObject(macaco,661,238);
        balao_vermelho.setLocation(251,243);
        macaco.setLocation(108,259);
        balao_vermelho.setLocation(312,248);
        balao_vermelho.setLocation(288,234);
        balao_vermelho.setLocation(223,239);
        balao_vermelho.setLocation(214,233);
        balao_vermelho.setLocation(219,330);
        balao_vermelho.setLocation(702,299);
        macaco.setLocation(184,291);
    }
}
