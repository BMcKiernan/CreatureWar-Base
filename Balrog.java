
/**
 * Write a description of class Balrog here.
 * 
 * @author Brian McKiernan 
 * @version Version 0.1
 */
public class Balrog extends Demon
{
    public static int MIN_HP = 80;
    public static int MAX_HP = 200;
    public static int MIN_STR = 50;
    public static int MAX_STR = 100;
    
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(Randomizer.nextInt(MAX_HP-MIN_HP)+MIN_HP,
              Randomizer.nextInt(MAX_STR-MIN_STR)+MAX_STR);
    }
    
    protected int damage(){
        return super.damage()+super.damage();
    }

}

