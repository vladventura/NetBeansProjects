
import java.util.Scanner;

public class CalculatorTester {
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);
      Calculator calc = new Calculator();
      boolean progress = false;
      int menuSelect;
      double a;
      double b;
      double c;
      
    while (progress == false){  
    selectionMenu();
    menuSelect = read.nextInt();
    
    switch (menuSelect){
        case 1:
            System.out.println("Enter an integer");
            a = read.nextInt();
            System.out.println(calc.factorial((int)a));
            break;
        case 2:
            System.out.println("Enter a low integer and a high integer");
            a = read.nextInt();
            b = read.nextInt();
            System.out.println(calc.sumRange((int)a, (int)b));
            break;
        case 3:
            System.out.println("Enter 3 doubles");
            a = read.nextDouble();
            b = read.nextDouble();
            c = read.nextDouble();
            System.out.println(calc.findGreatest(a, b, c));
            break;
        case 4: 
            progress = true;
            break;
        default:
            System.out.println("ERROR");
            break;

       }
    }
 }
    public static void selectionMenu(){
        System.out.println("Enter your selection:");
        System.out.println("1: Factorial");
        System.out.println("2: Sum Range");
        System.out.println("3: Find Greatest");
        System.out.println("4: Quit");
    }
   }
    
    

