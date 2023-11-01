import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class balao_vermelho here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balao_vermelho extends Actor
{
    /**
     * Act - do whatever the balao_vermelho wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
          public int sTimer = 0;
          GreenfootSound pop = new GreenfootSound("pop.mp3");

        public int cont = 0;
        public int timer = 0;
    public void act()
    {
    
        movimento();
        
        acertarAlvo();
        
            if (cont == 3){
            getWorld().removeObject(this);
            final1 mundo = new final1();
            Greenfoot.setWorld(mundo);
    }
    
}
    public void movimento(){
        int speed = 5;
    if(Greenfoot.isKeyDown("w")){
        this.setLocation(this.getX(), this.getY() - speed);
    }
    if(Greenfoot.isKeyDown("s")){
        this.setLocation(this.getX(), this.getY() + speed);
    }
        if(Greenfoot.isKeyDown("a")){
        this.setLocation(this.getX() - speed, this.getY());
    }
        if(Greenfoot.isKeyDown("d")){
        this.setLocation(this.getX() + speed, this.getY());
    }
    else if(Greenfoot.isKeyDown("g")&& (sTimer ==0)){
        sTimer++;
        getWorld().addObject(new helio(), getX() - 125, getY());
        pop.play();
    }
    else{
        if(!Greenfoot.isKeyDown("g")){
            sTimer = 0;
        }
    }
}
    public void acertarAlvo(){
    Actor b = getOneIntersectingObject(banana.class);
    if (b != null){
    getWorld().removeObject(b);

    cont ++;
    b = null;
    }
}
}


