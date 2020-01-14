import greenfoot.*;

/**
 * Write a description of class WorldFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldFinal extends World
{

    /**
     * Constructor for objects of class WorldFinal.
     * 
     */
    public WorldFinal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1366, 768, 1); 

        prepare();
    }
    GameWin GameWin = new GameWin();
    Back1 Back1 = new Back1();
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        addObject(GameWin, 683,384);
        Platform platform = new Platform();
        addObject(platform, 178, 646);
        platform.setLocation(144, 641);
        Platform platform2 = new Platform();
        addObject(platform2, 512, 644);
        platform2.setLocation(504, 641);
        Platform platform3 = new Platform();
        addObject(platform3, 880, 651);
        platform3.setLocation(863, 642);
        Platform platform4 = new Platform();
        addObject(platform4, 1199, 654);
        platform4.setLocation(1223, 642);
        Counter counter = new Counter();
        addObject(counter,58,26);
        John john = new John(counter);
        addObject(john, 58, 139);
        john.setLocation(69, 535);
        addObject(Back1,140,655);
        Back1.setLocation(123, 702);
    }
}
