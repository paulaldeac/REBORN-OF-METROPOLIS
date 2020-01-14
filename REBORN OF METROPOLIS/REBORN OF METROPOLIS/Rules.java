import greenfoot.*;

/**
 * Write a description of class Rules here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rules extends World
{

    /**
     * Constructor for objects of class Rules.
     * 
     */
    public Rules()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1366, 768, 1); 

        prepare();
    }

    /**
    * Prepare the world for the start of the program. That is: create the initial
    * objects and add them to the world.
    */
    private void prepare()
    {

            Back back = new Back();
        addObject(back, 162, 725);
        back.setLocation(154, 725);
}
}
