import greenfoot.*;

/**
 * Write a description of class Intrare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intrare extends World
{

    /**
     * Constructor for objects of class Intrare.
     * 
     */
    public Intrare()
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
        Platform platform = new Platform();
        addObject(platform, 188, 522);
        platform.setLocation(173, 513);
        Platform platform2 = new Platform();
        addObject(platform2, 466, 520);
        platform2.setLocation(532, 513);
        Platform platform3 = new Platform();
        addObject(platform3, 878, 535);
        platform3.setLocation(893, 513);
        Platform platform4 = new Platform();
        addObject(platform4, 1206, 538);
        platform4.setLocation(1253, 512);
        platform4.setLocation(1253, 513);
        Counter counter = new Counter();
        addObject(counter,58,26);
        John john = new John(counter);
        addObject(john, 64, 412);
        BadGuys badguys = new BadGuys();
        addObject(badguys, 1123, 423);
        BadGuys badguys2 = new BadGuys();
        addObject(badguys2, 1209, 424);
        platform2.getX();
        intersect1 intersect1 = new intersect1();
        addObject(intersect1, 1365, 437);
        Platform2 platform22 = new Platform2();
        addObject(platform22, 196, 528);
        platform22.setLocation(187, 519);
        removeObject(platform22);
        Platform2 platform23 = new Platform2();
        addObject(platform23, 187, 525);
        platform23.setLocation(192, 466);
        removeObject(platform23);
        removeObject(platform);
        Platform2 platform24 = new Platform2();
        addObject(platform24, 166, 524);
        platform24.setLocation(162, 523);
        removeObject(platform2);
        removeObject(platform3);
        removeObject(platform4);
        Platform2 platform25 = new Platform2();
        addObject(platform25, 552, 530);
        platform25.setLocation(545, 523);
        Platform2 platform26 = new Platform2();
        addObject(platform26, 998, 520);
        platform26.setLocation(926, 522);
        platform26.setLocation(926, 523);
        Platform2 platform27 = new Platform2();
        addObject(platform27, 1236, 509);
        platform27.setLocation(1306, 523);
        coins coins11 = new coins();
        addObject(coins11, 435, 444);
        coins coins12 = new coins();
        addObject(coins12, 233, 447);
        coins12.setLocation(233, 444);
        coins coins13 = new coins();
        addObject(coins13, 831, 451);
        coins13.setLocation(831, 444);
    }
}
