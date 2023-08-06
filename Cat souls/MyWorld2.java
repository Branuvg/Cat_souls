import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{

    /**
     * Constructor for objects of class MyWorld2.
     * 
     */
    public int objetosEliminados;
    private rata protagonista;
    
    public rata getProtagonista(){
        return protagonista;
    }
    
    public MyWorld2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
    
        protagonista = new rata();
        
        addObject(protagonista, 50, 350);
        addObject(new gato1(), 300, 200);
        addObject(new gato2(), 300, 200);
        addObject(new queso2(), 550, 50);
        
        objetosEliminados = 0;
    
    }
 
    public void incrementarObjetosEliminados(){
        objetosEliminados++;
    }
    
    public void ponerquesos(){
        if (objetosEliminados == 1) {
            addObject (new queso2(), 50, 350);
        }
        if (objetosEliminados == 2) {
            addObject (new queso2(), 300, 200);
        }
        if (objetosEliminados == 3) {
            Greenfoot.setWorld (new MyWorld3());
        }
    }
}
