import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class seguidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class seguidor extends Actor
{
    /**
     * Act - do whatever the seguidor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MyWorld3 miMundo = (MyWorld3)this.getWorld();
        perseguirAlPersonaje(miMundo.getProtagonista()); 
    }
    
    private void perseguirAlPersonaje(rata prota){
        int posXprotagonista = prota.getX();
        int posYprotagonista = prota.getY();
        
        if (this.getX() < posXprotagonista){
            this.setLocation(this.getX() + 2, this.getY());
        } else if (this.getX() > posXprotagonista){
            this.setLocation(this.getX() - 2, this.getY());
        }
        
        if (this.getY() < posYprotagonista){
            this.setLocation(this.getX(), this.getY() + 2);
        } else {
            this.setLocation(this.getX(), this.getY() - 2);
        }
    }
}
