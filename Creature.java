import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author Brian McKiernan 
 * @version Version 0.1
 */
public abstract class Creature{
   private int hp;
   private int str;
   
   Random randomDamage;
  
  
   public Creature(){
      hp = 10;
      str = 10;
   }
   
   public Creature(int hp, int minHp, int maxHp, int str, int minStr, int maxStr){
       if(hp > 4){
           if(hp > minHp && hp < maxHp){
               this.hp = hp;
           }
        }

       if(str > 4){
           if(str > minStr && str < maxStr){
               this.str = str;
           }
       }
       randomDamage = new Random();
   }
   
   protected int damage(){
       int damage = randomDamage.nextInt(str)+1;
       return damage;
   }
   
   protected void takeDamage(int damage){
       hp -= damage;
   }
    
   protected boolean isAlive(){
        boolean dead;
        if(hp <= 0){
            dead = true;
        }
        else
            dead = false;
        return dead;
   }
    
}
