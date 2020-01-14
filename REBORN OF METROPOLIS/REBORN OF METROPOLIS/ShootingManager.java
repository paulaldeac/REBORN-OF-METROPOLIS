import greenfoot.*;

/**
 * Write a description of class ShootingManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShootingManager extends WorldTexture
{
    /**
     * Act - do whatever the ShootingManager wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       //KillGuys;
       killBadGuys();
    }  
    
    public void remove()
    {
        Actor walls = getOneIntersectingObject(Platform.class);
        if(getX()<=1 || getY() >= getWorld().getWidth() -1)
        {
            getWorld().removeObject(this);
        }
        else if(walls != null)
        {
            getWorld().removeObject(this);
        }
    }
    
    public boolean amIshot(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0,0,clss);
        return actor !=null;
    }
    
    public void kill(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0,0,clss);
        if(actor!= null)
        {
            getWorld().removeObject(actor);
        }
    }
    
    public void killBadGuys()
    {
        if(amIshot(BadGuys.class))
        {
            kill(BadGuys.class);
            
            getWorld().removeObject(this);
        }
        else
        {
            remove();
        }
    }
}
