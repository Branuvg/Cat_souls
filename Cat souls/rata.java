import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rata extends Actor
{
    /**
     * Act - do whatever the rata wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeyPress();
        isTocandogato1();
        isTocandoqueso();
    }

    public void checkKeyPress(){
        if (Greenfoot.isKeyDown("w")) {
            setRotation(270);
            move(4);
        }
        if (Greenfoot.isKeyDown("s")) {
            setRotation(90);
            move(4);
        }
        if (Greenfoot.isKeyDown("a")) {
            setRotation(180);
            move(4);
        }
        if (Greenfoot.isKeyDown("d")) {
            setRotation(0);
            move(4);
        }
    }

    public void isTocandogato1(){
        if (isTouching(gato1.class)){
            System.out.println("Termina el juego");

            // Obtenemos la referencia al mundo
            World mundo = getWorld();

            //Eliminamos el objeto Arbol del mundo
            Actor gato1Tocado = getOneIntersectingObject(gato1.class);
            if (gato1Tocado != null) {
                Greenfoot.stop();
                mundo.addObject(new gameover(), 300, 200);
            }
        }
    }

    public void isTocandoqueso(){
        if (isTouching(queso.class)){
            // Obtenemos la referencia al mundo
            World mundo = getWorld();

            //Eliminamos el objeto Arbol del mundo
            Actor quesoTocado = getOneIntersectingObject(queso.class);
            if (quesoTocado != null) {
                mundo.removeObject(quesoTocado);
                ((MyWorld)mundo).incrementarObjetosEliminados();
                ((MyWorld)mundo).ponerquesos();
            }
        }
    }
}
