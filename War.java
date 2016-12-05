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
    Randomizer r = new Randomizer();
    /**
     * Constructor for objects of class War
     */
    public War()
    {
        Create_goodArmy(100);
        Create_evilArmy(75);
        Fight();
    }
    
    private void Create_goodArmy(int goodArmySize){
        int i;
        for( i = 0; i<goodArmySize; i++){
            int percent = Randomizer.nextInt(100)+1;
            if(percent<46)
                goodArmy.add(new Human());
            else if(percent<76)
                goodArmy.add(new Elf());
            else
                goodArmy.add(new Wizard());
        }
    }
    
    private void Create_evilArmy(int evilArmySize){
        int i;
        for(i = 0; i<evilArmySize; i++){
            int percent = Randomizer.nextInt(100)+1;
            if(percent<85)
                evilArmy.add(new Orc());
            else if(percent<98)
                evilArmy.add(new CyberDemon());
            else{
                evilArmy.add(new Balrog());
            }
        }
    }
    
    private void Fight(){
        System.out.print("\u000C");
        Creature goodWarrior = null;
        Creature evilWarrior = null;
        do{
            if(goodWarrior==null)
                goodWarrior = goodArmy.remove(0);
            if(evilWarrior==null){
                evilWarrior = evilArmy.remove(0);
            }

            while(goodWarrior.isAlive() && evilWarrior.isAlive()){
                evilWarrior.takeDamage(goodWarrior.damage());
                if(evilWarrior.isAlive())
                    goodWarrior.takeDamage(evilWarrior.damage());
                String s = " ";
                s += goodWarrior.getClass();
                s +=  (goodWarrior.isAlive()? " is still standing." : " has died.");
                s += "\t::\t";
                s += evilWarrior.getClass();
                s += (evilWarrior.isAlive()? " is still standing." : " has died.");
                System.out.printf("\n%s",s);
            }
            if(!goodWarrior.isAlive())
                goodWarrior = null;
            if(!evilWarrior.isAlive())
                evilWarrior = null;
        }
        while(goodArmy.size()!=0 && evilArmy.size()!=0);
        System.out.println("\nGA: "+goodArmy.size() +", EA: "+evilArmy.size());
        if(goodArmy.size()>0)
            System.out.println("\n'Good has triumphed!'");
        else if(evilArmy.size()>0)
            System.out.println("\n'Sauron has triumphed.'");
        else
            System.out.println("-chirp chip-");
    }
}
