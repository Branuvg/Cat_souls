import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class portada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class portada extends Actor
{
    /**
     * Act - do whatever the portada wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeyPress();
    }
    
    public void checkKeyPress(){
        if (Greenfoot.isKeyDown("space")) {
            World mundo = getWorld();
            mundo.removeObject(this);
        }
    }
}
