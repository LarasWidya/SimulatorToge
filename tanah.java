import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tanah extends Actor
{
    public static final int MAX = 1;
    int bijiCounter = 0;
    private Counter counter;
    
    private boolean SoundPlayed;
    boolean SoundPagiPlayed = false;
    boolean SoundMalamPlayed = false;
    /**
     * Act - do whatever the pot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        tanamBiji(); // kegiatan menanam biji
        getbijiCounter();
        menyiram(); // setiap air menyentuh tanah akan menambah grow poin
        progress(); // memantau kondisi poin untuk memenuhi kriteria proses tumbuh

    }

    public int getbijiCounter()
    {
        return bijiCounter;
    }

    public tanah(Counter pointCounter)
    {
        counter = pointCounter;
    }

    public void tanamBiji()
    {
        Actor tanam = getOneObjectAtOffset(0,0,Biji.class);
        if(tanam != null)
        {
            getWorld().removeObject(tanam);
            Greenfoot.playSound("dig.wav");
          
            bijiCounter++;
            if(bijiCounter > 1)
            {
                bijiCounter = MAX;
            }
        }
    }


    public void menyiram()
    {
        Actor tanah = getOneObjectAtOffset(0, 0, Air.class);  
        if(tanah != null) 
        {   
            getWorld().removeObject(tanah);  
            Greenfoot.playSound("water.mp3");
            if(bijiCounter == MAX)
            {
                counter.add(10);
                // untuk score
            }
        } 
    }   

    public void progress()
    {
       
        if(counter.getValue() >= 30)
        {
            counter.add(1);
            Biji1 newBiji1;
            newBiji1 = new Biji1();
            World world;
            world = getWorld();
            world.addObject(newBiji1, 496, 319);

            
            if(counter.getValue() >= 40)
            {
                getWorld().removeObjects(getWorld().getObjects(Biji1.class));
            }
        }
        
        if(counter.getValue() >= 40)
        
        {
          
           Kecambah newKecambah;
            newKecambah = new Kecambah();
            World world;
            world = getWorld();
            world.addObject(newKecambah, 496, 319);

          
            if(counter.getValue() >= 60)
            {
                getWorld().removeObjects(getWorld().getObjects(Kecambah.class));
            }
        }
        
        if(counter.getValue() >= 60)
        
        {
          
           Kecambah2 newKecambah2;
            newKecambah2 = new Kecambah2();
            World world;
            world = getWorld();
            world.addObject(newKecambah2,496,319);

          
            if(counter.getValue() >= 70)
            {
                getWorld().removeObjects(getWorld().getObjects(Kecambah2.class));
            }
        }
        
         if(counter.getValue() >= 70)
        
        {
          
           Kecambah3 newKecambah3;
            newKecambah3 = new Kecambah3();
            World world;
            world = getWorld();
            world.addObject(newKecambah3, 496, 319);

          
            if(counter.getValue() >= 80)
            {
                getWorld().removeObjects(getWorld().getObjects(Kecambah3.class));
            }
        }
        
        
        if(counter.getValue() >= 120)
        {
           ((Dunia)getWorld()).setBackground("tanah2.png");
           getWorld().removeObjects(getWorld().getObjects(Matahari.class));
            bulan newbulan;
            World world;
            newbulan = new bulan();
            getWorld().addObject(newbulan, 172, 57);
            if(!SoundMalamPlayed)
            {
              
            }

            
            Kecambah3 newKecambah3;
            newKecambah3 = new Kecambah3();
            
            world = getWorld();
            world.addObject(newKecambah3, 496,319);

            
            if(counter.getValue() >= 100)
            {
                getWorld().removeObjects(getWorld().getObjects(Kecambah3.class));
            }
        }
        
         if(counter.getValue() >= 160)
        
        {
          
            mati newmati;
            newmati = new mati();
            World world;
            world = getWorld();
            world.addObject(newmati, 496, 319);

            
            if(counter.getValue() >= 160)
            {
                getWorld().removeObjects(getWorld().getObjects(mati.class));
            }
        }
        
        if(counter.getValue() >= 150)
        {
            // replace Tunas2
            kecambah4 newkecambah4;
            newkecambah4 = new kecambah4();
            World world;
            world = getWorld();
            world.addObject(newkecambah4,496,319);

            // ganti background & bulan
            ((Dunia)getWorld()).setBackground("tanah.png");
            getWorld().removeObjects(getWorld().getObjects(bulan.class));
            Matahari newMatahari;
            newMatahari = new Matahari();
            getWorld().addObject(newMatahari, 172, 57);
            if(!SoundPagiPlayed)
            {
                playSoundPagi();
                SoundPagiPlayed = true;
            }
            setImage("akhir.png");
           
        }
    }

    public void playSoundPagi()
    {
        Greenfoot.playSound("pitik.mp3");
    }

    
}