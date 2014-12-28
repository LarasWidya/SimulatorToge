import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kecambah3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kecambah3 extends Actor
{
    /**
     * Act - do whatever the Kecambah3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      Actor Kecambah2;
      Kecambah2=getOneObjectAtOffset(0,0,Kecambah2.class);
      if(Kecambah2 !=null)
      {
            World world;
            world=getWorld();
            world.removeObject(Kecambah2);
       }
      Actor Air;
      Air=getOneObjectAtOffset(0,0,Air.class);
      if(Air !=null)
      {
         World world;
         world=getWorld();
         world.removeObject(Air);
      }
  
      if(Greenfoot.isKeyDown("f")){
      getWorld().addObject(new kecambah4(),474, 240);
      }
    } 
}
