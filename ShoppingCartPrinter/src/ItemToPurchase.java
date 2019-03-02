public class ItemToPurchase {
        private int itemPrice;
        private int itemQuantity;
        private String itemName;
        private String itemDescription;
        
    
    public void setName(String n){
        itemName = n;
}
    public String getName(){
        return itemName;
}

    public void setPrice(int p){
        itemPrice = p;
}
    public int getPrice (){
        return itemPrice;
}

    public void setQuantity(int q){
        itemQuantity = q;
}
    public int getQuantity(){
        return itemQuantity;
}
    
    public void setDescription(String s){
        itemDescription = s;
}
    public String getDescription(){
        return itemDescription;
}
    public void printItemCost(){
        int totalCost = itemQuantity * itemPrice;
        System.out.println(itemName +" " +itemQuantity +" @ $" +itemPrice +" = $" +totalCost);
}
    public void printDescription(){
        System.out.println(itemName +": " +itemDescription);
    }
public ItemToPurchase() {
        itemPrice = 0;
        itemQuantity = 0;
        itemName = "none";
        itemDescription = "none";
    }
public ItemToPurchase (String n, String desc, int p, int q){
    p=0;
    q=0;
    itemName = n;
    itemDescription = desc;
    itemPrice = p;
    itemQuantity  = q;
}
    
}