import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kecambah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kecambah extends Actor
{
    /**
     * Act - do whatever the Kecambah wants to do. This method is called whenever
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
        Actor Biji1;
        Biji1=getOneObjectAtOffset(0,0,Biji1.class);
        if(Biji1 !=null)
        {
            World world;
            world=getWorld();
            world.removeObject(Biji1);
        }
       
        if(Greenfoot.isKeyDown("s")){
        getWorld().addObject(new Kecambah2(),474, 270);
        }
    }    
}
