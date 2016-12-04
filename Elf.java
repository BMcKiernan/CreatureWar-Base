
/**
 * Write a description of class Elf here.
 * 
 * @author Brian McKiernan
 * @version Version 0.1
 */
public class Elf extends Creature
{
    private static final int MIN_HP = 8;
    private static final int MAX_HP = 25;
    private static final int MIN_STR = 5;
    private static final int MAX_STR = 18;
    
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
       super(Randomizer.nextInt(MAX_HP-MIN_HP)+MIN_HP,
             Randomizer.nextInt(MAX_STR-MIN_STR)+MIN_STR);
    }
    
    public int damage(){
        int damage;
        damage = super.damage();
        
        if (Randomizer.nextInt(100)+1<=10){
            System.err.println("Magic!");
            damage *=2;
        }
        return damage;
   }
}
