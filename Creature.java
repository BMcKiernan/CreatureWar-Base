
/**
 * Write a description of class Creature here.
 * 
 * @author Brian McKiernan 
 * @version Version 0.1
 */
public abstract class Creature{
   private int hp;
   private int str;

  
  
   public Creature(){
      hp = 10;
      str = 10;
   }
   
   public Creature (int hp, int str){
       if(str>4)
           this.str = str;
       else
            System.err.print("Error: Minimum strength is 5.");
            
       if(hp>4)
           this.hp = hp;
       else
            System.err.print("Error: Minimum strength is 5.");
    }
   
   protected int damage(){
       return Randomizer.nextInt(str)+1;
   }
   
   protected void takeDamage(int damage){
       hp -= damage;
   }
    
   protected boolean isAlive(){
        if(hp <= 0){
            return true;
        }
        else
            return false;
   }
}
