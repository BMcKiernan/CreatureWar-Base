
/**
 * Write a description of class Orc here.
 * 
 * @author Brian McKiernan 
 * @version Version 0.1
 */
public class Orc extends Creature
{
    private static final int MIN_HP = 10;
    private static final int MAX_HP = 33;
    private static final int MIN_STR = 5;
    private static final int MAX_STR = 22;
    
    /**
     * Constructor for Human Objects
     */
    public Orc()
    {
        super(Randomizer.nextInt(MAX_HP-MIN_HP)+MIN_HP,
              Randomizer.nextInt(MAX_STR-MIN_STR)+MIN_STR);
    }
}
