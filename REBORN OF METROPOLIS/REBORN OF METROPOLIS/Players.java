import greenfoot.*;

/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players extends Actor
{
    /**
     * Act - do whatever the Players wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        check();
        nextlevel();
        detecteaza();
    }    
    //nextLevel
        public boolean check()
    {
        Actor intersectie = getOneObjectAtOffset(0,getImage().getHeight()/4, intersect.class);
        return intersectie!=null;
    }
    public void nextlevel()
    {
        if(check()==true)
        {
            Greenfoot.setWorld(new MyWorld2());
        }
    }
    //detect money
    public void detecteaza()
    {
      Actor actor = getOneIntersectingObject(coins.class);
    if (actor != null) {
        getWorld().removeObject(actor);
    }
   }
}
