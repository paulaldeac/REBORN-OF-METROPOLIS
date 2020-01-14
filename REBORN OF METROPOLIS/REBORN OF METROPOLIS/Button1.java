import greenfoot.*;

/**
 * Write a description of class Button1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button1 extends Menuads
{
    /**
     * Act - do whatever the Button1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Story());
        }
    }    
}
