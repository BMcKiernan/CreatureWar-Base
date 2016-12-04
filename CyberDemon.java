
/**
 * Write a description of class CyberDemon here.
 * 
 * @author Brian McKiernan 
 * @version (a version number or a date)
 */
public class CyberDemon extends Demon
{
    private static int MIN_HP = 25;
    private static int MAX_HP = 100;
    private static int MIN_STR = 20;
    private static int MAX_STR = 40;

    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon(int hp, int str)
    {
        super(Randomizer.nextInt(MAX_HP-MIN_HP)+MIN_HP,
              Randomizer.nextInt(MAX_STR-MIN_STR)+MIN_STR);
    }
}
