import java.util.Random;
/**
 * Write a description of class Demon here.
 * 
 * @author Brian McKiernan 
 * @version Version 0.1
 */
public abstract class Demon extends Creature
{
    /**
     * Constructor for objects of class Demon
     */
    public Demon(int hp, int str)
    {
        super(hp,str);
    }

    protected int damage(){
       int damage = super.damage();
       if(Randomizer.nextInt(100)<=5)
           damage += 50;
          
       return damage;
    }
}
