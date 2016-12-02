
/**
 * Write a description of class Balrog here.
 * 
 * @author Brian McKiernan 
 * @version Version 0.1
 */
public class Balrog extends Demon
{
    int str;
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog(int hp, int str)
    {
        super(hp,80,200,str,50,100);
        this.str = str;
    }
    
    protected int damage(){
       int damage;
       demonMagic = magic.nextInt(100)+1;
       damage = randomDamage.nextInt(str)+1;
       if(demonMagic<=5)
           damage += randomDamage.nextInt(str)+1;
           
       return damage;
    }

}

