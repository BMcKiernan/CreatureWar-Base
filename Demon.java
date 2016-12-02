import java.util.Random;
/**
 * Write a description of class Demon here.
 * 
 * @author Brian McKiernan 
 * @version (a version number or a date)
 */
public abstract class Demon extends Creature
{
    private int str;
    protected Random magic;
    protected int demonMagic;
    /**
     * Constructor for objects of class Demon
     */
    public Demon(int hp,int minHp,int maxHp,int str,int minStr,int maxStr)
    {
        super(hp,minHp,maxHp,str,minStr,maxStr);
        this.str = str;
        magic = new Random();
    }

    protected int damage(){
       demonMagic = magic.nextInt(100)+1;
       int damage = randomDamage.nextInt(str)+1;
       if(demonMagic<=5)
           damage += 50;
          
       return damage;
    }
}
