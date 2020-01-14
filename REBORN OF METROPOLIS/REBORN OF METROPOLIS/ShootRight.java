import greenfoot.*;

/**
 * Write a description of class ShootRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShootRight extends ShootingManager
{
    private int shootingSpeed = 10;
    public void act() 
    {
       fly();
       killBadGuys(); 
    }    
    public void fly()
    {
        setLocation(getX() + shootingSpeed, getY());
    }
}
