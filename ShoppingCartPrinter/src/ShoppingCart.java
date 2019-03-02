import java.util.ArrayList;
public class ShoppingCart {
    private String customerName;
    private String currentDate;
    ArrayList<String> cartItems = new ArrayList<>();

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }
    public void addItem(String i){
        cartItems.add(i);
    }
    public void removeItem(String i){
        if(cartItems.remove(i) == false){
            System.out.println("Item not found in cart. Nothing removed.");
        }
    }
    public void modifyItem(){
        
    }
    
    
    
    
    
}
