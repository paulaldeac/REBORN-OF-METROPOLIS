import greenfoot.*;

/**
 * Write a description of class Back1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back1 extends Menuads
{
    /**
     * Act - do whatever the Back1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
               if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Meniu());
        }
    }    
}
