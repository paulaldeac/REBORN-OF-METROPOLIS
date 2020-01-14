// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class John extends Players
{
    private int speed = 4;
    private int vSpeed = 0;
    //Shooting
    private int direction = 1;
    private int shootingCounter = 50;
   //Right
    private GreenfootImage run3= new GreenfootImage("bro3_run0001.png");
    private GreenfootImage run4= new GreenfootImage("bro3_run0002.png");
    private GreenfootImage run5= new GreenfootImage("bro3_run0003.png");
    private GreenfootImage run6= new GreenfootImage("bro3_run0004.png");
    private GreenfootImage run7= new GreenfootImage("bro3_run0005.png");
    private GreenfootImage run8= new GreenfootImage("bro3_run0006.png");
    private GreenfootImage run9= new GreenfootImage("bro3_run0007.png");
   //Left
    private GreenfootImage run10= new GreenfootImage("bro3_run0001r.png");
    private GreenfootImage run11= new GreenfootImage("bro3_run0002r.png");
    private GreenfootImage run12= new GreenfootImage("bro3_run0003r.png");
    private GreenfootImage run13= new GreenfootImage("bro3_run0004r.png");
    private GreenfootImage run14= new GreenfootImage("bro3_run0005r.png");
    private GreenfootImage run15= new GreenfootImage("bro3_run0006r.png");
    private GreenfootImage run16= new GreenfootImage("bro3_run0007r.png");
    //shoot
    private GreenfootImage runi1= new GreenfootImage("bro3_fire0001.png");
    private GreenfootImage runi2= new GreenfootImage("bro3_fire0002.png");
    private GreenfootImage runi3= new GreenfootImage("bro3_fire0003.png");
    private GreenfootImage runi4= new GreenfootImage("bro3_fire0004.png");
    private GreenfootImage runi5= new GreenfootImage("bro3_fire0005.png");
    private GreenfootImage runi6= new GreenfootImage("bro3_fire0001r.png");
    private GreenfootImage runi7= new GreenfootImage("bro3_fire0002r.png");
    private GreenfootImage runi8= new GreenfootImage("bro3_fire0003r.png");
    private GreenfootImage runi9= new GreenfootImage("bro3_fire0004r.png");
    private GreenfootImage runi10= new GreenfootImage("bro3_fire0005r.png");
    
    
         
     //Frame miscare
    private int frame3 = 1;
    private int frame2 =1;
    private int frame = 3;
    private int frame1 = 10;
    private int frame3i = 5;
    private int animationCounter = 0;
    /**
     * Act - do whatever the John wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animationCounter++;
        checkKey();
        checkFall();
        checkPlatformAbove();
        checkWalls();
        shootingCounter --; 
        shooting();
        check();
        nextlevel();
        check2();
        intraincladire();
        trece3();
        contincladire();
        intrainlift();
        intrainsubs();
        detecteaza();
        check3();
        map5intrare();
        detecteazaKey();
        edge();
        check5();
        map6intrare();
        check6();
        map7intrare();
        detecteaza1cufar();
        check7();
        map8intrare();
        check8();
        map9intrare();
        rapundelaintrebari();
    }
   //move
    public void checkKey()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            direction= 1;
            moveRight();
        }
        if(Greenfoot.isKeyDown("left"))
        {
            direction = 0;
            moveLeft();
        }
          if (Greenfoot.isKeyDown("up"))
        {
            if (isOnGround())
            {
                jump();//from the Mover class
            }
        }
    }
    //Shoot
    public boolean shooting()
    {
        if(Greenfoot.isKeyDown("space") && shootingCounter <=0 &&direction ==1)
        {
            if(frame3 ==1)
            {
                setImage(runi1);
            }
            else if(frame3 ==1)
            {
                setImage(runi2);
            }
            else if(frame3 ==2)
            {
                setImage(runi3);
            }
            else if(frame3 ==3)
            {
                setImage(runi4);
            }
            else if(frame3 ==4)
            {
                setImage(runi5);
                frame3=1;               
            }
            frame3++;
            getWorld().addObject(new ShootRight(), getX(), getY());
            shootingCounter =50;
            return true;
        }
        else if(Greenfoot.isKeyDown("space") && shootingCounter <=0 &&direction ==0)
        {
             if(frame3i==5)
            {
                setImage(runi5);
            }
            else if(frame3i ==6)
            {
                setImage(runi6);
            }
            else if(frame3i ==7)
            {
                setImage(runi7);
            }
            else if(frame3i ==8)
            {
                setImage(runi8);
            }
            else if(frame3i ==9)
            {
                setImage(runi9);
                frame3i=5;               
            }
            frame3i++;
            getWorld().addObject(new ShootLeft(), getX(), getY());
            shootingCounter =50;
            return true;
           
        }
        return false;
    }
   //move
       public void moveRight()
    {
        setLocation(getX() + speed, getY());
        if(animationCounter % 4==0)
        animateRight();
    }
   //move
    private void moveLeft()
    {
         setLocation(getX() - speed, getY());
        if(animationCounter % 4==0)
        animateLeft();
    }
    //move
    public void animateRight()
    {
        if(frame == 3)
    {
        setImage(run3);
    }
      else if(frame == 4)
    {
        setImage(run4);
    }
      else if(frame == 5)
    {
        setImage(run5);
    }  else if(frame == 6)
    {
        setImage(run6);
    }
    else if(frame == 7)
    {
        setImage(run7);
    }
    else if(frame == 8)
    {
        setImage(run8);
    }
    else if(frame == 9)
    {
        setImage(run9);
        frame=3;
        return;
    }
    frame++;
    }
    //move
    public void animateLeft()
    {
       if(frame1 == 10)
    {
        setImage(run10);
    }
      else if(frame1 == 11)
    {
        setImage(run11);
    }
      else if(frame1 == 12)
    {
        setImage(run12);
    }  else if(frame1 == 13)
    {
        setImage(run13);
    }
    else if(frame1 == 14)
    {
        setImage(run14);
    }
    else if(frame1 == 15)
    {
        setImage(run15);
    }
    else if(frame1 == 16)
    {
        setImage(run16);
        frame1=10;
        return;
    }
    frame1++;
    }
    //Public.
    private static final int ACCELERATION = 1;        //down (gravity)
    private static final int HORIZONTAL_SPEED = 4;    //running speed (sideways)
    private static final int JUMP_STRENGTH = 16;      //determines how high we can jump
    private static final int MAX_VERTICAL_SPEED = 9;  //we can not faster than this
    private int verticalSpeed = 0;                    //current vertical speed. 0 = on ground. >0 = jumping up. <0 = falling down
     GameOver GameOver = new GameOver();
     Back1 Back1 = new Back1();
     //margine GameOVer
    public void edge()
    {
        if (getY() >= getWorld().getHeight() - 15)
        {
             this.getWorld().addObject(GameOver, 683,384);
             this.getWorld().addObject(Back1,140,655);
        }
       
    }
    //jump
      public void jump()
    {
        verticalSpeed = -JUMP_STRENGTH;
        fall();
    }    
         ///////////////////////Platforma
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
    //////////////////
    
    //Intra in cladire
    public boolean check2()
    {
        Actor intra = getOneObjectAtOffset(0,getImage().getHeight()/2, Building.class);
        return intra!=null;
    }
    public void intraincladire()
    {
        if(check2()==true)
        {
            Greenfoot.setWorld(new Intrare());
        }
    }
    //Next map
     public boolean trece3()
    {
        Actor intra1 = getOneObjectAtOffset(0,getImage().getHeight()/4, intersect1.class);
        return intra1!=null;
    }
    public void contincladire()
    {
        if(trece3()==true)
        {
            Greenfoot.setWorld(new MyWorld3());
        }
    }
    //Intra in lift
    public boolean intrainlift()
    {
         Actor intra2 = getOneObjectAtOffset(0,getImage().getHeight()/3, door.class);
        return intra2!=null;
    }
     public void intrainsubs()
    {
        if(intrainlift()==true)
        {
            Greenfoot.setWorld(new MyWorld4());
        }
    }
    //Detecteaza banii 
    public Counter counter;
    //Ia bani din cufar
     public John(Counter pointCounter)
    {
        counter = pointCounter;
    }
    public void detecteaza1cufar()
    {
        Actor actor = getOneIntersectingObject(Money.class);
        if(actor!=null)
        {
         getWorld().removeObject(actor);
         counter.add(100);
        }
    }
    
    public void rapundelaintrebari()
    {   Actor actor = getOneIntersectingObject(rasp1.class);
        Actor actor1 = getOneIntersectingObject(rasp2.class);
        Actor actor2 = getOneIntersectingObject(rasp3.class);
        
        if(actor!=null){
            counter.add(100);
            getWorld().removeObject(actor);
            //Correctbtn Correctbtn = new Correctbtn();
            getWorld().addObject(new Correctbtn(),981,682 );
        }
        if(actor1!=null)
        {
            counter.add(-100);
            getWorld().removeObject(actor1);
            getWorld().addObject(new Wrongbtn(),981,682 );
        }
        if(actor2!=null)
        {
            counter.add(-100);
            getWorld().removeObject(actor2);
            getWorld().addObject(new Wrongbtn(),981,682 );
        }
    }
    //ia bani normali
    public void detecteaza()
    {Actor actor = getOneIntersectingObject(coins.class);
    if (actor != null) {
         getWorld().removeObject(actor);
         counter.add(10);
    }
    }
    //NextMap5
       public boolean check3()
    {
        Actor intra = getOneObjectAtOffset(0,getImage().getHeight()/4, intersect2.class);
        return intra!=null;
    }
    public void map5intrare()
    {
        if(check3()==true)
        {
            Greenfoot.setWorld(new MyWorld5());
        }
    }
    //Take key
     public void detecteazaKey()
    {Actor actor = getOneIntersectingObject(Key.class);
    if (actor != null) {
        getWorld().removeObject(actor);
    }
    } 
    //intrare map 7
           public boolean check6()
    {
        Actor intra = getOneObjectAtOffset(0,getImage().getHeight()/4, door1.class);
        return intra!=null;
    }
     public void map7intrare()
    {
        if(check6()==true)  {
            Greenfoot.setWorld(new MyWorld7());
        }
    }
    //Intrare map 6
       public boolean check5()
    {
        Actor intra = getOneObjectAtOffset(0,getImage().getHeight()/4, intersect3.class);
        return intra!=null;
    }
    public void map6intrare()
    {
        if(check5()==true)
        {
            Greenfoot.setWorld(new MyWorld6Gasirea());
        }
    }
    //Intrare map Final2k18
             public boolean check7()
    {
        Actor intra = getOneObjectAtOffset(0,getImage().getHeight()/4, door2.class);
        return intra!=null;
    }
     public void map8intrare()
    {
        if(check7()==true)  {
            Greenfoot.setWorld(new Final2k18());
        }
    }
    //Final
        public boolean check8()
    {
        Actor intra = getOneObjectAtOffset(0,getImage().getHeight()/4, intersect4.class);
        return intra!=null;
    }
    public void map9intrare()
    {
        if(check8()==true)
        {
            Greenfoot.setWorld(new WorldFinal());
        }
    }
}