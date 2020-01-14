import greenfoot.*;

/**
 * Write a description of class Switchoff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Switchoff extends WorldTexture
{
    private GreenfootImage d1= new GreenfootImage("switch_on@2x.png");
    /**
     * Act - do whatever the Switchoff wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animation();
    }    
    //animatie
    Text Text = new Text();
    rasp1 rasp1 = new rasp1();
    rasp2 rasp2 = new rasp2();
    rasp3 rasp3 = new rasp3();
    Correctbtn Correctbtn = new Correctbtn();
    private void animation()
    {
         if(Greenfoot.isKeyDown("v"))
         {
             setImage(d1);
             this.getWorld().addObject(Text,1000,421);
             this.getWorld().addObject(rasp1,760,524);
             this.getWorld().addObject(rasp2,955,524);
             this.getWorld().addObject(rasp3,1152,524);
             apasa();
         }
    }
    public boolean apasa()
    {
        return true;
    }
}
