package battlecode;
public class BattleCode {
    public static void main(String[] args) {
        BattleManager vlad = new BattleManager();
        
        Hero lugia = vlad.setupHero("Lugia");
        Hero entei = vlad.setupHero("Entei");
        
        lugia.printStats();
        entei.printStats();
        
        vlad.round(lugia, entei);
        lugia.printStats();
        entei.printStats();
        vlad.round(entei, lugia);
        lugia.printStats();
        entei.printStats();
        
        vlad.compareHealth(lugia, entei);
        
    }
    
}
