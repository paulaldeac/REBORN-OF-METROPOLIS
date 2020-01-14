import greenfoot.*;

/**
 * Write a description of class Story here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story extends World
{

    /**
     * Constructor for objects of class Story.
     * 
     */
    public Story()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1366, 768, 1); 
        prepare();
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Button2 button2 = new Button2();
        addObject(button2, 659, 720);
        button2.setLocation(669, 711);
        button2.setLocation(668, 706);
        button2.setLocation(664, 690);
        button2.setLocation(667, 696);
    }
}
