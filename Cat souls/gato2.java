import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gato2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gato2 extends Actor
{
        public gato2(){
    }
    /**
     * Act - do whatever the gato2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(9);
        if (isAtEdge()){
            turn(180);
        }
    }
}
