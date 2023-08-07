import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gato1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gato1 extends Actor
{
        public gato1(){
        setRotation(90);
    }
    /**
     * Act - do whatever the gato1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(8);
        if (isAtEdge()){
            turn(180);
        }
    }
}
