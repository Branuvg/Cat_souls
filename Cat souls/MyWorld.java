import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int objetosEliminados;
    private rata protagonista;
    
    public rata getProtagonista(){
        return protagonista;
    }
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
    
        protagonista = new rata();
        
        addObject(protagonista, 50, 350);
        addObject(new gato1(), 300, 200);
        addObject(new queso(), 450, 50);
        
        objetosEliminados = 0;
    
    }
 
    public void incrementarObjetosEliminados(){
        objetosEliminados++;
    }
    
    public void ponerquesos(){
        if (objetosEliminados == 1) {
            addObject (new queso(), 50, 50);
        }
        if (objetosEliminados == 2) {
            addObject (new queso(), 550, 350);
        }
        if (objetosEliminados == 3) {
            Greenfoot.stop();
        }
    }
}
