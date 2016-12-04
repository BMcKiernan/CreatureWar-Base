import java.util.ArrayList;
/**
 * Write a description of class War here.
 * 
 * @author Brian McKiernan 
 * @version Version 0.1
 */
public class War extends Creature
{
    ArrayList<Creature> evilArmy = new ArrayList<Creature>();
    ArrayList<Creature> goodArmy = new ArrayList<Creature>();

    /**
     * Constructor for objects of class War
     */
    public War(int goodArmySize,int evilArmySize)
    {
        Create_goodArmy(goodArmySize);
        Create_evilArmy(evilArmySize);
    }
    
    private void Create_goodArmy(int goodArmySize){
        for(int i = 0; i<goodArmySize; i++){
            int percent = Randomizer.nextInt(100)+1;
            if(percent<61)
                goodArmy.add(new Human());
            else if(percent<95)
                goodArmy.add(new Elf());
            else
                goodArmy.add(new Wizard());
        }
    }
    
    private void Create_evilArmy(int evilArmySize){
        for(int i = 0; i<evilArmySize; i++){
            int percent = Randomizer.nextInt(100)+1;
            if(percent<75)
                evilArmy.add(new Orc());
            else if(percent<97)
                evilArmy.add(new CyberDemon());
            else
                evilArmy.add(new Balrog());
        }
    }
    
    private void Fight(){
        Creature goodWarrior = null;
        Creature evilWarrior = null;
        do{
            if(goodWarrior==null)
                goodWarrior = goodArmy.remove(0);
            if(evilWarrior==null)
                evilWarrior = evilArmy.remove(0);
            while(goodWarrior.isAlive() && evilWarrior.isAlive()){
                goodWarrior.takeDamage(evilWarrior.damage());
                evilWarrior.takeDamage(goodWarrior.damage());
                String s = "\t";
                s += goodWarrior.getClass();
                s +=  (goodWarrior.isAlive()? " is still standing." : " has died.");
                s += "\t::\t";
                s += evilWarrior.getClass();
                s += (evilWarrior.isAlive()? " is still standing." : " has died.");
                System.out.println(s);
            }
            if(!goodWarrior.isAlive())
                goodWarrior = null;
            if(!evilWarrior.isAlive())
                evilWarrior = null;
        }
        while(!(goodArmy.size()==0 && evilArmy.size()==0));
        
        if(goodArmy.size()==0)
            System.out.println("'Good has triumphed!'");
        if(evilArmy.size()==0)
            System.out.println("'Sauron has triumphed.'");
    }
}
