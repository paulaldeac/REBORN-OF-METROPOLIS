import greenfoot.*;

/**
 * Write a description of class Final2k18 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Final2k18 extends World
{

    /**
     * Constructor for objects of class Final2k18.
     * 
     */
    public Final2k18()
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
        Platform2 platform2 = new Platform2();
        addObject(platform2, 186, 530);
        platform2.setLocation(175, 523);
        Platform2 platform22 = new Platform2();
        addObject(platform22, 562, 527);
        platform22.setLocation(555, 522);
        Platform2 platform23 = new Platform2();
        addObject(platform23, 953, 524);
        platform23.setLocation(937, 522);
        Platform2 platform24 = new Platform2();
        addObject(platform24, 1288, 524);
        platform24.setLocation(1319, 522);
        Counter counter = new Counter();
        addObject(counter,58,26);
        John john = new John(counter);
        addObject(john, 55, 540);
        john.setLocation(64, 413);
        coins coins = new coins();
        addObject(coins, 363, 435);
        coins coins2 = new coins();
        addObject(coins2, 699, 436);
        coins2.setLocation(707, 436);
        coins coins3 = new coins();
        addObject(coins3, 1030, 444);
        coins coins4 = new coins();
        addObject(coins4, 1237, 443);
        coins3.setLocation(1029, 439);
        coins4.setLocation(1237, 441);
        intersect4 intersect4 = new intersect4();
        addObject(intersect4, 1366, 439);
        john.setLocation(123, 410);
        Doorsimple doorsimple = new Doorsimple();
        addObject(doorsimple, 38, 426);
        doorsimple.setLocation(47, 421);
        john.setLocation(159, 410);
    }
}
