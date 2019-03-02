package battlecode;
public class Hero {
    private String heroName;
    private int health;
    private int stamina;
    private int strength;
    private int agility;
    private int defenseValue;
    private int attackValue;
    public static final int COST_ATTACK = 6;
    public static final int COST_DEFEND = 4;
    public static final int DEFAULT_HEALTH = 50;
    public static final int DEFAULT_STAMINA = 25;
    public static final int DEFAULT_STRENGTH = 5;
    public static final int DEFAULT_AGILITY = 5;
    
    Die swordShield = new Die(20);
    Die s = new Die (6);
    Die e = new Die (8);
    Die t = new Die (10);

    public String getHeroName() {
        return heroName;
    }
    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }
    
    public void addHealth(int toAdd){
        health += toAdd;
    }
    public void removeHealth(int toMinus){
        health -= toMinus;
    }
    
    public void printStats (){
        System.out.println(heroName);
        System.out.println(strength +" Strength");
        System.out.println(agility +" Agility");
        System.out.println(stamina +" Stamina");
        System.out.println(health +" Health");
    }
    
    public int defend(){
        if ((stamina - COST_DEFEND) >= COST_DEFEND){
            swordShield.roll();
            defenseValue = swordShield.getValue() + agility;
         }  else {
            rest();
        }
        return defenseValue;
    }
    
    public int attack (){
        if ((stamina - COST_ATTACK >= COST_ATTACK)){
            swordShield.roll();
            attackValue = swordShield.getValue() + strength;
        } else {
          rest();
        }
        return attackValue;
    }
    private void rest(){
        if (Math.max(s.getValue(),Math.max(e.getValue(), t.getValue())) == s.getValue()){
        health += s.getValue();
        stamina += (e.getValue() + t.getValue()); 
        } else if (Math.max(e.getValue(),Math.max(s.getValue(), t.getValue())) == e.getValue()){
            health += e.getValue();
            stamina += (s.getValue() + t.getValue());
        } else {
            health += t.getValue();
            stamina += (s.getValue() + e.getValue());
        }
    }
    
    public Hero (String s){
        heroName = s;
        health = DEFAULT_HEALTH;
        stamina = DEFAULT_STAMINA;
        strength = DEFAULT_STRENGTH;
        agility = DEFAULT_AGILITY;
    }
    public Hero (String s, int str, int agi){
        heroName = s;
        agility = agi;
        strength = str;
        stamina = DEFAULT_STAMINA;
        health = DEFAULT_HEALTH;
    }
}
