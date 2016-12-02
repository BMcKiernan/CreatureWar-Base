import java.util.Random;
/**
 * Write a description of class Wizard here.
 * 
 * @author Brian McKiernan 
 * @version (a version number or a date)
 */
public class Wizard extends Human
{
    Random magic;
    int wizardMagic;
    private int  str;
    /**
     * Constructor for objects of class Wizard
     */
    public Wizard(int hp, int str)
    {
        super(hp,12,25,str,10,30);
        this.str = str;
    }

    protected int damage(){
       wizardMagic = magic.nextInt(100)+1;
       int damage = randomDamage.nextInt(str)+1;
       if(wizardMagic<=10)
           damage += 40;
          
       if(wizardMagic<=2)
            damage +=120;
           
       return damage;
    }
}
