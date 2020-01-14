import greenfoot.*;

/**
 * Write a description of class MyWorld6Gasirea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld6Gasirea extends World
{

    /**
     * Constructor for objects of class MyWorld6Gasirea.
     * 
     */
    public MyWorld6Gasirea()
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
        addObject(platform1, 214, 620);
        platform1.setLocation(217, 620);
        Platform1 platform12 = new Platform1();
        addObject(platform12, 667, 625);
        platform12.setLocation(631, 617);
        Platform1 platform13 = new Platform1();
        addObject(platform13, 1052, 618);
        platform13.setLocation(1044, 617);
        Platform1 platform14 = new Platform1();
        addObject(platform14, 1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(1122, 581);
        platform14.setLocation(855, 579);
        platform14.setLocation(947, 575);
        platform14.setLocation(999, 573);
        removeObject(platform14);
        door1 door1 = new door1();
        addObject(door1, 798, 527);
        door1.setLocation(798, 532);
        usekey usekey = new usekey();
        addObject(usekey, 711, 496);
        usekey.setLocation(710, 489);
        usekey.setLocation(706, 524);
        coins coins = new coins();
        addObject(coins, 236, 537);
        coins.setLocation(236, 544);
        coins coins2 = new coins();
        addObject(coins2, 483, 550);
        coins2.setLocation(485, 541);
        coins2.setLocation(485, 535);
        Counter counter = new Counter();
        addObject(counter,58,26);
        John john = new John(counter);
        addObject(john, 58, 139);
        john.setLocation(76, 517);
        john.setLocation(73, 523);
    }
}
