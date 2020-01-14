import greenfoot.*;

/**
 * Write a description of class ShootLeftB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShootLeftB extends ShootingManagerBadGuys
{
   private int shootingSpeed = 10;
    public void act() 
    {
       fly();
       killJohn();     
    }    
    public void fly()
    {
        setLocation(getX() - shootingSpeed, getY());
    } 
}
