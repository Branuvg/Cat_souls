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
        addObject(new queso(), 450, 120);
        
        objetosEliminados = 0;
    
        mostrarEtiqueta();
    }
 
    public void incrementarObjetosEliminados(){
        objetosEliminados++;
        mostrarEtiqueta();
    }
    
    public void mostrarEtiqueta(){
        showText("Quesos comidos 3 / " + objetosEliminados, 110,25);
    }

    public void ponerquesos(){
        if (objetosEliminados == 1) {
            addObject (new queso(), 50, 120);
        }
        if (objetosEliminados == 2) {
            addObject (new queso(), 480, 350);
        }
        if (objetosEliminados == 3) {
            Greenfoot.setWorld (new MyWorld2());
        }
    }
}
