package fractionreducer;
import java.util.Scanner;
public class FractionReducer {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println(asFraction(s.nextInt(), s.nextInt()));
    }
    
    
    static public long greaterCommonDenominator(long a, long b){
        if (b == 0) return a;
        return greaterCommonDenominator(b, a % b);
    }
    static public String asFraction(long a, long b){
        long gcd = greaterCommonDenominator(a, b);
        return (a / gcd) + "/" + (b / gcd);
    }
}
