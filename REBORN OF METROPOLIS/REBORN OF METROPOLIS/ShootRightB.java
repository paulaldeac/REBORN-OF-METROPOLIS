import greenfoot.*;

/**
 * Write a description of class ShootRightB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShootRightB extends ShootingManagerBadGuys
{
   private int shootingSpeed = 5;
    public void act() 
    {
       fly();
       killJohn(); 
    }    
    public void fly()
    {
        setLocation(getX() + shootingSpeed, getY());
    } 
}
