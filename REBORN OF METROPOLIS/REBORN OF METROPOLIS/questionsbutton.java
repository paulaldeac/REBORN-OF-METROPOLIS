import greenfoot.*;

/**
 * Write a description of class questionsbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class questionsbutton extends Menuads
{
    /**
     * Act - do whatever the questionsbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
          if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Rules());
        }
    }    
}
