import greenfoot.*;

/**
 * Write a description of class MyWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld3 extends World
{
    GameOver GameOver = new GameOver();
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld3()
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
        addObject(platform, 156, 523);
        platform.setLocation(155, 516);
        Platform platform2 = new Platform();
        addObject(platform2, 504, 461);
        platform2.setLocation(515, 434);
        Platform platform3 = new Platform();
        addObject(platform3, 788, 539);
        platform3.setLocation(873, 515);
        Platform platform4 = new Platform();
        addObject(platform4, 1129, 531);
        platform4.setLocation(1233, 516);
        Counter counter = new Counter();
        addObject(counter,58,26);
        John john = new John(counter);
        addObject(john, 56, 414);
        BadGuys badguys = new BadGuys();
        addObject(badguys, 1236, 424);
        BadGuys badguys2 = new BadGuys();
        addObject(badguys2, 1179, 430);
        BadGuys badguys3 = new BadGuys();
        addObject(badguys3, 1114, 427);
        badguys3.setLocation(1333, 417);
        badguys2.setLocation(1290, 421);
        removeObject(badguys2);
        badguys.setLocation(655, 338);
        badguys3.setLocation(1361, 420);
        platform2.setLocation(514, 463);
        badguys.setLocation(635, 368);
        BadGuys badguys4 = new BadGuys();
        addObject(badguys4, 1060, 424);
        BadGuys badguys5 = new BadGuys();
        addObject(badguys5, 1216, 423);
        badguys3.setLocation(1289, 418);
        door door = new door();
        addObject(door, 1316, 428);
        door.setLocation(1316, 420);
        door.setLocation(1305, 421);
        badguys3.setLocation(1133, 423);
        Platform2 platform22 = new Platform2();
        addObject(platform22, 150, 529);
        platform22.setLocation(143, 521);
        platform22.setLocation(144, 518);
        platform22.setLocation(159, 441);
        platform.setLocation(585, 574);
        removeObject(platform);
        platform22.setLocation(143, 525);
        platform22.setLocation(143, 525);
        platform2.setLocation(569, 570);
        removeObject(platform2);
        Platform2 platform23 = new Platform2();
        addObject(platform23, 533, 533);
        platform23.setLocation(526, 525);
        removeObject(platform3);
        removeObject(platform4);
        Platform2 platform24 = new Platform2();
        addObject(platform24, 915, 531);
        platform24.setLocation(908, 524);
        platform23.setLocation(526, 490);
        Platform2 platform25 = new Platform2();
        addObject(platform25, 1298, 530);
        platform25.setLocation(1291, 525);
        platform25.setLocation(1291, 521);
        platform25.setLocation(1292, 524);
        badguys.setLocation(634, 386);
        door.setLocation(1313, 421);
        coins coins = new coins();
        addObject(coins, 184, 440);
        coins coins2 = new coins();
        addObject(coins2, 433, 413);
        coins coins3 = new coins();
        addObject(coins3, 535, 420);
        coins3.setLocation(535, 413);
        coins coins4 = new coins();
        addObject(coins4, 827, 442);
        coins4.setLocation(837, 443);
        coins coins5 = new coins();
        addObject(coins5, 940, 443);
        coins5.setLocation(939, 443);
    }
    public GameOver getGameOver()
    {
        return GameOver;
    }
}
