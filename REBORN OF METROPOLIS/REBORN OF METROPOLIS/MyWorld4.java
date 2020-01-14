import greenfoot.*;

/**
 * Write a description of class MyWorld4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld4 extends World
{
    
    GameOver GameOver = new GameOver();
    /**
     * Constructor for objects of class MyWorld4.
     * 
     */
    public MyWorld4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1366, 768, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Platform1 platform1 = new Platform1();
        addObject(platform1, 416, 719);
        platform1.setLocation(385, 713);
        platform1.setLocation(211, 611);
        platform1.setLocation(214, 611);
        Platform1 platform12 = new Platform1();
        addObject(platform12, 610, 618);
        platform12.setLocation(646, 611);
        Platform1 platform13 = new Platform1();
        addObject(platform13, 1127, 591);
        platform13.setLocation(1190, 609);
        Doorsimple door = new Doorsimple();
        addObject(door, 59, 531);
        door.setLocation(88, 530);
        Counter counter = new Counter();
        addObject(counter,58,26);
        John john = new John(counter);
        addObject(john, 139, 523);

        BadGuys badguys = new BadGuys();
        addObject(badguys, 651, 532);
        BadGuys badguys2 = new BadGuys();
        addObject(badguys2, 749, 516);
        badguys2.setLocation(747, 524);
        coins coins = new coins();
        addObject(coins, 378, 541);
        coins coins2 = new coins();
        addObject(coins2, 1065, 558);
        coins2.setLocation(1067, 545);
        coins2.setLocation(1069, 542);
        coins coins3 = new coins();
        addObject(coins3, 1250, 544);
        coins3.setLocation(1248, 540);
        badguys2.setLocation(730, 527);
        intersect2 intersect2 = new intersect2();
        addObject(intersect2, 1365,  540);
    }
     public GameOver getGameOver()
    {
        return GameOver;
    }
}
