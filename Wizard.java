
/**
 * Write a description of class Wizard here.
 * 
 * @author Brian McKiernan 
 * @version (a version number or a date)
 */
public class Wizard extends Human
{
    private static int MIN_HP = 12;
    private static int MAX_HP = 25;
    private static int MIN_STR = 12;
    private static int MAX_STR = 30;

      /**
     * Constructor for objects of class Wizard
     */
    public Wizard()
    {
        super(Randomizer.nextInt(MAX_HP-MIN_HP)+MIN_HP,
              Randomizer.nextInt(MAX_STR-MIN_STR)+MIN_STR);
    }

    protected int damage(){
       int damage = super.damage();
       int magic = Randomizer.nextInt(100)+1;

       if(magic<=25 && magic>10){
            damage += 10;
            System.err.println("Critical");
        }
                 
       if(magic<=10 && magic>2){
           damage += 40;
           System.err.println("Wizard-Magic");
       }
          
       if(magic<=2){
            damage +=120;
            System.err.println("You shall not, PASS!!!");
        }
       return damage;
    }
    
    
}
