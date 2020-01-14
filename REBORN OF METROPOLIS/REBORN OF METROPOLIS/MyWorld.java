// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
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
        addObject(platform, 142, 639);
        platform.setLocation(178, 641);
        platform.setLocation(178, 640);
        Platform platform2 = new Platform();
        addObject(platform2, 551, 649);
        platform2.setLocation(537, 640);
        platform.setLocation(167, 639);
        platform2.setLocation(527, 639);
        Platform platform3 = new Platform();
        addObject(platform3, 901, 645);
        platform3.setLocation(886, 639);
        Platform platform4 = new Platform();
        addObject(platform4, 1225, 647);
        platform4.setLocation(1246, 639);
        Counter counter = new Counter();
        addObject(counter,58,26);
        John john = new John(counter);
        addObject(john, 60, 533);
        BadGuys badguys = new BadGuys();
        addObject(badguys, 1076, 539);
        badguys.setLocation(1076, 539);
        badguys.setLocation(1076, 539);
        badguys.setLocation(1041, 539);
        removeObject(badguys);

        intersect intersect = new intersect();
        addObject(intersect, 1370, 570);
    }
}
