import greenfoot.*;

/**
 * Write a description of class Doorsimple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Doorsimple extends Menuads
{
     private GreenfootImage d1= new GreenfootImage("door_opening0001.png");
     private GreenfootImage d2= new GreenfootImage("door_opening0002.png");
     private GreenfootImage d3= new GreenfootImage("door_opening0003.png");
     private GreenfootImage d4= new GreenfootImage("door_opening0004.png");
     private GreenfootImage d5= new GreenfootImage("door_opening0005.png");
     private GreenfootImage d6= new GreenfootImage("door_opening0006.png");
     private GreenfootImage d7= new GreenfootImage("door_opening0007.png");
     private GreenfootImage d8= new GreenfootImage("door_opening0008.png");
    public void act() 
    {
        animate();
    }   
    //Deschiderea usii;
    private int frame=1;
    public void animate()
    {
        if(frame==1)
        {
            setImage(d1);
        }
        else if(frame==2)
        {
            setImage(d2);
        }
        else if(frame==4)
        {
            setImage(d3);
        }
        else if(frame==6)
        {
            setImage(d4);
        }
        else if(frame==8)
        {
            setImage(d5);
        }
        else if(frame==10)
        {
            setImage(d6);
        }
        else if(frame==12)
        {
            setImage(d7);
        }
        else if(frame==14)
        {
            setImage(d8);
        }
        frame++;
    }   
}
