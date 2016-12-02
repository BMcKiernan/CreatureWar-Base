
/**
 * Write a description of class Human here.
 * 
 * @author Brian McKiernan
 * @version Version 0.1
 */
public class Human extends Creature
{
    /**
     * Constructor for Human Objects
     */
    public Human(int hp, int str)
    {
        super(hp,10,30,str,5,18);
    }

    public Human(int hp,int minHp,int maxHp,int str,int minStr,int maxStr){
        super(hp,minHp,maxHp,str,minStr,maxStr);
    }
}