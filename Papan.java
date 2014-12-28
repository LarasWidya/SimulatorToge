import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Papan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Papan extends Actor
{
    public static final int MAX_BIJI = 1;
    private GreenfootImage img1=new GreenfootImage(205,100);
    private Waktu waktu = new Waktu();
    private int timer;
    private Suhu sh = new Suhu();
    private int ShUdara;
 
    public void act() 
    {
        // Add your action code here.
        img1.clear();
        buatPapanSuhu();
    }    
    
    public Papan(){
        buatPapanSuhu();
        setImage(img1);
    }
    
    
    private void buatPapanSuhu(){
        img1.setColor(java.awt.Color.BLUE);
        img1.drawRect(0,0,125,50);       
        //Suhu
        
        ShUdara++;
        if(ShUdara==17){
            ShUdara=0;
            sh.SuhuUp();
        }
        img1.setColor(java.awt.Color.WHITE);
        img1.drawString("Suhu :"+sh.toString(),2,15);
        
        
        img1.drawString("Tekanan Air :",2,30 );
        
        timer++;
        if(timer>=60){
            timer=0;
            waktu.detikUp();
        }
            
        img1.setColor(java.awt.Color.WHITE);
        img1.drawString("Waktu :" + waktu.toString(),2,45);
    }   
    
     
    
    
}
