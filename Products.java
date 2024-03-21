
public class Products {
    
    // States
    public int stock = 0;
    protected String name;
    private float price = 0.00f;

    // Set Methods
    public void set_Name(String name){
        this.name = name;
    }
    public void set_Price(float price){
        this.price = price;
    }

    // Get Methods
    public void get_Name(){
        System.out.println("Name of the product: " + name);
    }
    public void get_Price(){
        System.out.println("Price of the product: " + price);
    }
}
