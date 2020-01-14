import greenfoot.*;

/**
 * Write a description of class ShootLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShootLeft extends ShootingManager
{
      private int shootingSpeed = 10;
    /**
     * Act - do whatever the ShootRight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       fly();
       killBadGuys(); 
    }    
    public void fly()
    {
        setLocation(getX() - shootingSpeed, getY());
    }
}
