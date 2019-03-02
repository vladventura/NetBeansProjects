package battlecode;
import java.util.Scanner;
public class BattleManager {
    Scanner input = new Scanner(System.in);
    String action;
    boolean end, end2, atk, def, atk2, def2 = false;
    
    public Hero setupHero (String s){
        Hero player = new Hero(s);
        return player;
    }
    
    public void round(Hero p1, Hero p2){
        System.out.println(p1.getHeroName() +", select your move!");
        while (end == false){
        action = input.nextLine();
        switch  (action){
            case "Attack" : atk = true;
                            end = true;
            break;
            case "Defend" : def = true;
                            end = true;
            break;
            case "Stats" : p1.printStats();
                           end = true;
            break;
            default : System.out.println("Please type Attack, Defend or Stats");
            break;
        }
    }
        System.out.println(p2.getHeroName() +", its your turn!");
        while (end2 == false){
        action = input.nextLine();
        switch  (action){
            case "Attack" : atk2 = true;
                            end2 = true;
            break;
            case "Defend" : def2 = true;
                            end2 = true;
            break;
            case "Stats" : p2.printStats();
                           end2 = true;
            break;
            default : System.out.println("Please type Attack, Defend or Stats");
            break;
        }
    }
        damageCalculation(p1, p2);
        resetBoolean();
}
    public void damageCalculation(Hero p1, Hero p2){        
        if(atk == true){
            System.out.println(p1.getHeroName() +" attacks!");
            if (def2 == true ){
                System.out.println("But " +p2.getHeroName() +" defends!");
                int difference = p2.defend() - p1.attack();
                if (difference <=0){
                    System.out.println("Damage is taken!");
                    p2.removeHealth(Math.abs(difference));
                }
            } else {
                System.out.println(p2.getHeroName() +" is open wide!");
                p2.removeHealth(p1.attack());
            }
        }
        if(atk2 == true){
            System.out.println(p2.getHeroName() +" attacks!");
            if (def == true ){
                System.out.println("But " +p1.getHeroName() +" defends!");
                int difference = p1.defend() - p2.attack();
                if (difference <=0){
                    System.out.println("Damage is taken!");
                    p1.removeHealth(Math.abs(difference));
                }
            } else {
                System.out.println(p1.getHeroName() +" is open wide!");
                p1.removeHealth(p2.attack());
            }
        }
        else if (def == true && def2 == true) {
            System.out.println("Two defenses huh?");
        }
    }
    private void resetBoolean(){
    end = false;
    end2 = false;
    atk = false;
    atk2 = false;
    def = false;
    def2 = false;
        
    }
    
    public void compareHealth(Hero p1, Hero p2){
        if (p1.getHealth() > p2.getHealth()){
            System.out.println(p1.getHeroName() +" wins the fight!");
        } else if (p2.getHealth() > p1.getHealth()){
            System.out.println(p2.getHeroName() +" wins the fight!"); 
    }
        else System.out.println("Tied match!");
    }
}