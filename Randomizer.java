import java.util.Random;
/**
 * Write a description of class Randomizer here.
 * 
 * @author Brian McKiernan 
 * @version Version 0.1
 */
public class Randomizer
{
    
    private static Random randomInt;
    /**
     * Constructor for objects of class Randomizer
     */
    public Randomizer()
    {
        randomInt = new Random();
    }

    public static int nextInt(int integer){
        return randomInt.nextInt(integer);
    }
}
