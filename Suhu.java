import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Suhu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Suhu extends Actor
{
    public static final int MAX_SUHU=20;
    public static final int MIN_SUHU=16;
    private int suhuUdara;
    public void act() 
    {
        // Add your action code here.
    }   
    
    public Suhu()
    {
        suhuUdara = 20;
    }
    
    public Suhu(int suhuUdara){
        setSuhu(suhuUdara);
    }
    
    public void setSuhu(int suhuUdara){
       if((suhuUdara<16)||(suhuUdara>MAX_SUHU)){
           this.suhuUdara = 20;
       }
       else{
           this.suhuUdara = suhuUdara;
       }
       
    }
    
    public int getSuhuUdara(){
        return suhuUdara;
    }
    
    public void SuhuUp(){
        if(suhuUdara==MAX_SUHU){
            SuhuDown();
        }
        
    }
    
    public void SuhuDown(){
        if(suhuUdara==MIN_SUHU){
            SuhuUp();
        }
        
    }
    
    public String toString(){
        return suhuUdara+" C";
    }
}