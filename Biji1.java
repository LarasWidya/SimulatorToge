import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Biji1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Biji1 extends Actor
{
    /**
     * Act - do whatever the Biji1 wants to do. This method is called whenever
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
        Actor Biji;
        Biji=getOneObjectAtOffset(0,0,Biji.class);
        if(Biji !=null)
        {
            World world;
            world=getWorld();
            world.removeObject(Biji);
        }
        
        if(Greenfoot.isKeyDown("a")){
        getWorld().addObject(new Kecambah(),486, 291);
        }
    }    
}
