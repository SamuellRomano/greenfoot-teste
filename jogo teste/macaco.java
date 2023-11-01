import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class macaco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class macaco extends Actor
{
    /**
     * Act - do whatever the macaco wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
              public int sTimer = 0;
          GreenfootSound monkey = new GreenfootSound("monkey.mp3");
    
           public int cont = 0;
    public void act()
    {
        movimento();
        acertarAlvo();
        
            if (cont == 3){
            getWorld().removeObject(this);
            final2 mundo = new final2();
            Greenfoot.setWorld(mundo);
    }
    }
    
    public void movimento(){
        int speed = 10;
    if(Greenfoot.isKeyDown("up")){
        this.setLocation(this.getX(), this.getY() - speed);
    }
    if(Greenfoot.isKeyDown("down")){
        this.setLocation(this.getX(), this.getY() + speed);
    }
        if(Greenfoot.isKeyDown("left")){
        this.setLocation(this.getX() - speed, this.getY());
    }
        if(Greenfoot.isKeyDown("right")){
        this.setLocation(this.getX() + speed, this.getY());
    }
     else if(Greenfoot.isKeyDown("space")&& (sTimer ==0)){
        sTimer++;
         getWorld().addObject(new banana(), getX() + 125, getY());
        monkey.play();

    }
    

    else{
        if(!Greenfoot.isKeyDown("space")){
            sTimer = 0;
        }
}
}
    public void acertarAlvo(){
    Actor b = getOneIntersectingObject(helio.class);
    if (b != null){
    getWorld().removeObject(b);

    cont ++;
    b = null;
    }
    }
}

