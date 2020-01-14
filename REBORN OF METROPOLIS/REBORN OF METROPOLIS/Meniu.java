import greenfoot.*;

/**
 * Write a description of class Meniu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meniu extends World
{

    /**
     * Constructor for objects of class Meniu.
     * 
     */
    public Meniu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1366, 768, 1); 
        prepare();
        act();
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Story());
        }
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Button1 button1 = new Button1();
        addObject(button1, 674, 727);
        button1.setLocation(661, 708);
        button1.setLocation(652, 690);
        button1.setLocation(654, 680);
        questionsbutton questionsbutton = new questionsbutton();
        addObject(questionsbutton, 1299, 48);
        questionsbutton.setLocation(1291, 50);
    }
}
