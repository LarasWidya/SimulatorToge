import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kecambah4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kecambah4 extends Actor
{
    /**
     * Act - do whatever the kecambah4 wants to do. This method is called whenever
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
      Actor Kecambah3;
      Kecambah3=getOneObjectAtOffset(0,0,Kecambah3.class);
      if(Kecambah3 !=null)
      {
            World world;
            world=getWorld();
            world.removeObject(Kecambah3);
       }
    }    
}
