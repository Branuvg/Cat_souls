import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld3 extends World
{

    /**
     * Constructor for objects of class MyWorld3.
     * 
     */
    public int objetosEliminados;
    private rata protagonista;
    private seguidor miEnemigo;
    
    public rata getProtagonista(){
        return protagonista;
    }
    
    public MyWorld3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
    
        protagonista = new rata();
        
        addObject(protagonista, 50, 350);
        addObject(new gato1(), 300, 200);
        addObject(new gato2(), 300, 200);
        addObject(new queso3(), 450, 50);
        
        miEnemigo = new seguidor();
        addObject(miEnemigo, 300, 200);
        
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
            addObject (new queso3(), 50, 350);
        }
        if (objetosEliminados == 2) {
            addObject (new queso3(), 300, 200);
        }
        if (objetosEliminados == 3) {
            Greenfoot.stop();
        }
    }
}
