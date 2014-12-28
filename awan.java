import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class penyiram here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class awan extends Actor
{
    private boolean isGrabbed;
  
    /**
     * Act - do whatever the penyiram wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
        siram();
    }    


    public void siram()
    {  
        if("space".equals(Greenfoot.getKey())) 
        {  
            getWorld().addObject(new Air(), getX(), getY());  
        }  
    }
}

