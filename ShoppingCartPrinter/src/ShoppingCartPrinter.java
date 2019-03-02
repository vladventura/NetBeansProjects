import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
ItemToPurchase first = new ItemToPurchase();
ItemToPurchase sec = new ItemToPurchase();
Scanner barcode = new Scanner (System.in);
String firstName, secName = "null";
int firstCost = 0;
int secCost = 0;
int totalCost = 0;

        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        first.setName(barcode.nextLine());
        System.out.println("Enter the item price:");
        first.setPrice(barcode.nextInt());
        System.out.println("Enter the item quantity:");
        first.setQuantity(barcode.nextInt());
        System.out.println("");
        barcode.nextLine();
        
        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        sec.setName(barcode.nextLine());
        System.out.println("Enter the item price:");
        sec.setPrice(barcode.nextInt());
        System.out.println("Enter the item quantity:");
        sec.setQuantity(barcode.nextInt());
        System.out.println("");
        firstCost = first.getPrice() * first.getQuantity();
        secCost = sec.getPrice() * sec.getQuantity();
        totalCost = firstCost + secCost;

        
        System.out.println("TOTAL COST");
        System.out.println(first.getName() +" " +first.getQuantity() +" @ $" +first.getPrice() +" = $" +firstCost);
        System.out.println(sec.getName() +" " +sec.getQuantity() +" @ $" +sec.getPrice() +" = $" +secCost);
        System.out.println("");
        System.out.println("Total: $" +totalCost);






    }
    
}
