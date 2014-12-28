import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dunia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dunia extends World
{   
    public Dunia()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        Matahari Matahari = new Matahari();
        addObject(Matahari, 172, 57);
        awan awan = new awan();
        addObject(awan, 496, 20);
        Counter counter = new Counter();
        addObject(counter, 589, 600);
        tanah tanah = new tanah(counter);
        addObject(tanah, 316, 439);
        tanah.setLocation(496, 319);
        Papan papan = new Papan();
        addObject(papan, 409, 597);

        Biji biji = new Biji();
        addObject(biji, 572, 594);

        iklan iklan = new iklan();
        addObject(iklan, 308, 310);

    }
}
