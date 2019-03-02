
public class Calculator {
    public int sumRange(int a, int b){
        int first = a;
        int sec = b;
        int result = 0;
        if ((a < 0) || (b < 0)){
            return result;
        }
    if (a < b){
        for (int i = sec; i >= first;){
            result = result + (sec - i) + first;
            i--;
            }
        }
    else {
        return result;
        }        
        return result;
    }
    public double findGreatest(double a, double b, double c){
        double first = a;
        double sec = b;
        double third = c;
        double result = 0;
        
    if (Math.max(first, sec) == first){
        result = Math.max(first, third);
    }
    else if (Math.max(first, third) == first){
        result = Math.max(first, sec);
    }
    else {
        result = Math.max(sec, third);
    }
    return result;
    }
    public long factorial (int a){
        int first = a;
        int math = 1;
        int result = 1;
        
       for (int i = 1; i <= first;){
           math = math * i;
           result = math;
           i++;
    }
       return result;
    }
}
