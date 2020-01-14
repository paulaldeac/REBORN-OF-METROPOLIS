import greenfoot.*;

/**
 * Write a description of class coins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coins extends WorldTexture
{
     private GreenfootImage d1= new GreenfootImage("cc_coins_gold_0.png");
     private GreenfootImage d2= new GreenfootImage("cc_coins_gold_1.png");
     private GreenfootImage d3= new GreenfootImage("cc_coins_gold_2.png");
     private GreenfootImage d4= new GreenfootImage("cc_coins_gold_3.png");
     private GreenfootImage d5= new GreenfootImage("cc_coins_gold_4.png");
     private GreenfootImage d6= new GreenfootImage("cc_coins_gold_5.png");
     private GreenfootImage d7= new GreenfootImage("cc_coins_gold_6.png");
      private GreenfootImage d8= new GreenfootImage("cc_coins_gold_7.png");
    public void act() 
    {
        animate();
    }   
    //Animatie ban;
    private int frame=1;
    public void animate()
    {  
        if(frame==1)
        {
            setImage(d1);
        }
        else if(frame==3)
        {
            setImage(d2);
        }
        else if(frame==5)
        {
            setImage(d3);
        }
        else if(frame==7)
        {
            setImage(d4);
        }
        else if(frame==10)
        {
            setImage(d5);
        }
        else if(frame==13)
        {
            setImage(d6);
        }
        else if(frame==16)
        {
            setImage(d7);
        }
        else if(frame==19)
        {
            setImage(d8);
            frame=1;
            return;
        }
        frame++;
    }
    
}
