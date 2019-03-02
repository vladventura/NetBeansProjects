package battlecode;
import java.util.Random;

public class Die {
    private int value;
    final private int sides;
    Random rolled = new Random();
    
    public int getValue(){
        return value;
    }
    public int getSides(){
        return sides;
    }
    
    public void roll(){
        value = rolled.nextInt(sides);
    }
    
    public Die (int numberOfSides){
        sides = numberOfSides;
    }
}
