
/**
 * Write a description of class Human here.
 * 
 * @author Brian McKiernan
 * @version Version 0.1
 */
public class Human extends Creature
{
    private static final int MIN_HP = 10;
    private static final int MAX_HP = 30;
    private static final int MIN_STR = 5;
    private static final int MAX_STR = 18;
    
    /**
     * Constructor for Human Objects
     */
    public Human()
    {
        super(Randomizer.nextInt(MAX_HP-MIN_HP)+MIN_HP,
              Randomizer.nextInt(MAX_STR-MIN_STR)+MIN_STR);
    }
    
    public Human(int hp, int str){
        super(hp,str);
    }
}