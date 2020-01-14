import greenfoot.*;

/**
 * Write a description of class BadGuys here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadGuys extends WorldTexture
{
        private GreenfootImage run1= new GreenfootImage("jughead_walking0001.png");
        private GreenfootImage run2= new GreenfootImage("jughead_walking0002.png");
        private GreenfootImage run3= new GreenfootImage("jughead_walking0003.png");
        private GreenfootImage run4= new GreenfootImage("jughead_walking0004.png");
        private GreenfootImage run5= new GreenfootImage("jughead_walking0005.png");
        private GreenfootImage run6= new GreenfootImage("jughead_walking0006.png");
        private GreenfootImage run7= new GreenfootImage("jughead_walking0007.png");
        private GreenfootImage run8= new GreenfootImage("jughead_walking0008.png");
        private GreenfootImage run9= new GreenfootImage("jughead_walking0009.png");
        private int shootingCounter = 200;
        private int direction =1;
    public void act() 
    {
        // Add your action code here.
        checkFall();
        checkPlatformAbove();
        checkWalls();
        animateRight();
        //follow();
        move1();
        shootingCounter --;
        kill();
        atWorldEdge();
        Moartedacasaredpm();
    }    
    //Move
    public void move1()
    {
        move(-2);
        direction=1;
    }
      //Public.
    private static final int ACCELERATION = 1;        //down (gravity)
    private static final int HORIZONTAL_SPEED = 4;    //running speed (sideways)
    private static final int JUMP_STRENGTH = 16;      //determines how high we can jump
    private static final int MAX_VERTICAL_SPEED = 9;  //we can not faster than this
    private int verticalSpeed = 0;                    //current vertical speed. 0 = on ground. >0 = jumping up. <0 = falling down
    
    
      public void jump()
    {
        verticalSpeed = -JUMP_STRENGTH;
        fall();
    }    
         
    
    public boolean isOnGround()
    {
        boolean onGround = false;
                   
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2 , Platform.class);
         
        if(ground != null)       
        {
            moveOutOfGround(ground);
            onGround = true;              
        }        
        return onGround;
    }
     
 
    private void checkWalls()
    {        
        Actor rightWall = getOneObjectAtOffset(getImage().getWidth() / 1, 0, Platform.class);
        Actor leftWall = getOneObjectAtOffset(getImage().getWidth() / -1, 0, Platform.class);
        
        if(rightWall != null)
        {
            moveOutOfRightWall(rightWall);
        }
        else if(leftWall != null)
        {
            moveOutOfLeftWall(leftWall);            
        }                                
    }
     

    private void moveOutOfLeftWall(Actor wall)
    {
        int wallWidth = wall.getImage().getWidth();
        int newX = wall.getX() + (wallWidth + getImage().getWidth())/2;
        setLocation(newX + HORIZONTAL_SPEED, getY());           
    }
     
 
    private void moveOutOfRightWall(Actor wall)
    {
        int wallWidth = wall.getImage().getWidth();
        int newX = wall.getX() - (wallWidth + getImage().getWidth())/2;
        setLocation(newX - HORIZONTAL_SPEED, getY());                
    }

    private void checkPlatformAbove()
    {        
        Actor ceiling = getOneObjectAtOffset(0, getImage().getHeight() / -2, Platform.class);
        if(ceiling != null)
        {
            verticalSpeed = 1;            
            moveOutOfCeiling(ceiling);            
        }        
    }

    private void moveOutOfCeiling(Actor ceiling)
    {
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getY() + (ceilingHeight + getImage().getHeight()) / 2;
        setLocation(getX(), newY);        
    }

    private void checkFall()
    {
        if (isOnGround()) {
            verticalSpeed = 0;
        }
        else {
            fall();
        }
    }
             

    private void fall()
    {
        setLocation (getX(), getY() + verticalSpeed);
        verticalSpeed = verticalSpeed + ACCELERATION;
         
        if(verticalSpeed > MAX_VERTICAL_SPEED)
        {
            verticalSpeed = MAX_VERTICAL_SPEED;
        }
    }

    private void moveOutOfGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);              


    }
    //Move     
     private int frame=1; 
   public void animateRight()
    {
       if(frame == 1)
            {
                setImage(run1);
            }
            else if(frame == 2)
            {
                setImage(run2);
            }
              else if(frame == 4)
            {
                setImage(run3);
            }
              else if(frame == 6)
            {
                setImage(run4);
            }
              else if(frame == 8)
            {
                setImage(run5);
            }
              else if(frame == 10)
            {
                setImage(run6);
            }
              else if(frame == 12)
            {
                setImage(run7);
            }
              else if(frame == 14)
            {
                setImage(run8);
            }
              else if(frame == 16)
            {
                setImage(run9);
                frame=1;
                return;
            }
           frame++;
        }
        GameOver GameOver = new GameOver();
         Back1 Back1 = new Back1();
   public void Moartedacasaredpm()
   {
       if (getY() >= getWorld().getHeight() - 15)
        {
            getWorld().removeObject(this);
        }
   }
   public boolean kill()
   {
     Actor John;
     John= getOneObjectAtOffset( 150,50, John.class);
     if(John!=null&&shootingCounter<=0)
     {
            getWorld().addObject(new ShootLeftB(), getX() , getY());
            this.getWorld().addObject(GameOver, 683,384);
            this.getWorld().addObject(Back1,140,655);
            shootingCounter =200;
            return true;
            
      }
     return false;
    }
    //Follow code;
    public void follow()
    {
        direction=1;
        int dist = 100;
    Actor closest = null;
    if(!getObjectsInRange(dist, John.class).isEmpty())
    {
        for (Object obj: getObjectsInRange(dist, John.class))
        {
            Actor BadGuys = (Actor) obj;
            int guyDist = (int) Math.hypot(BadGuys.getX() - getX(), BadGuys.getY() - getY());
            if (closest == null || guyDist< dist)
            {
                closest = BadGuys;
                dist = guyDist;
            }
        }
        turnTowards(closest.getX(),closest.getY());
    }   
    } 
    public boolean atWorldEdge() 
     { if(getX() < 20 || getX() > getWorld().getWidth() - 20) {
         return true;
        } 
       if(getY() < 20 || getY() > getWorld().getHeight() - 20) 
        {
             return true;
        }
         else 
         {
             return false;
         }
        }
    }
