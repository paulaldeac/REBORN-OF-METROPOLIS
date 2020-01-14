import greenfoot.*;

/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld2()
    {
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
        addObject(platform, 190, 643);
        platform.setLocation(168, 639);
        Platform platform2 = new Platform();
        addObject(platform2, 538, 642);
        platform2.setLocation(528, 639);
        Platform platform3 = new Platform();
        addObject(platform3, 911, 637);
        platform3.setLocation(890, 645);
        platform3.setLocation(889, 639);
        Platform platform4 = new Platform();
        addObject(platform4, 1258, 646);
        platform4.setLocation(1250, 639);
        platform.setLocation(169, 639);
        Building building = new Building();
        addObject(building, 1174, 447);
        building.setLocation(1163, 443);
        building.setLocation(1166, 442);
        Counter counter = new Counter();
        addObject(counter,58,26);
        John john = new John(counter);
        addObject(john, 55, 540);
        john.setLocation(55, 536);
        building.setLocation(1108, 585);
        building.setLocation(1101, 585);
        building.setLocation(1097, 584);
        building.setLocation(1110, 584);
        building.setLocation(1110, 544);
        building.setLocation(1165, 442);
        john.setLocation(68, 532);

    }
}
