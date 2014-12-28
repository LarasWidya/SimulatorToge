import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Biji here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Biji extends Actor
{
    private boolean isGrabbed;
    public static MouseInfo mi;
    /**
     * Act - do whatever the Biji wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        DragDropbiji();
        Actor Air;
        Air=getOneObjectAtOffset(0,0,Air.class);
        if(Air !=null)
        {
            World world;
            world=getWorld();
            world.removeObject(Air);
        }
        if(Greenfoot.isKeyDown("UP")){
        getWorld().addObject(new Biji1(),486, 291);
        }
    }
    
    public void DragDropbiji()
    {
        // menekan mouse  
        if (Greenfoot.mousePressed(this) && !isGrabbed)  
        {  
            // ambil objek  
            isGrabbed = true;  
            // Agar objek yg ditarik melewati depan objek lain
            World world = getWorld();  
            mi = Greenfoot.getMouseInfo();  
            world.removeObject(this);  
            world.addObject(this, mi.getX(), mi.getY());  
            return;  
        }  

        // menarik objek  
        if ((Greenfoot.mouseDragged(this)) && isGrabbed)  
        {  
            // objek mengikuti mouse
            mi = Greenfoot.getMouseInfo();  
            setLocation(mi.getX(), mi.getY());  
            return;  
        }  

        // button mouse dilepas 
        if (Greenfoot.mouseDragEnded(this) && isGrabbed)  
        { 
            // lepas objek  
            isGrabbed = false;
            // kembalikan objek ke tempat semula
            setLocation(553, 58);
            return;  
        }  
    }
}
