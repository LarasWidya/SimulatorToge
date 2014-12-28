import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kecambah2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kecambah2 extends Actor
{
    /**
     * Act - do whatever the Kecambah2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor Air;
        Air=getOneObjectAtOffset(0,0,Air.class);
        if(Air !=null)
        {
            World world;
            world=getWorld();
            world.removeObject(Air);
        }
        Actor Kecambah;
        Kecambah=getOneObjectAtOffset(0,0,Kecambah.class);
        if(Kecambah !=null)
        {
            World world;
            world=getWorld();
            world.removeObject(Kecambah);
        }
       
        if(Greenfoot.isKeyDown("d")){
        getWorld().addObject(new Kecambah3(),474, 268);
        }
    }    
}
