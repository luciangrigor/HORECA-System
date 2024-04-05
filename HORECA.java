
import java.util.ArrayList;
import java.util.Scanner;


public class HORECA implements HORECAInterface{

    // States

    private int num_Products = 0;
    private ArrayList<Products> system_Products;

    protected ArrayList<Products> system_Wines;
    protected ArrayList<Products> system_Drinks;
    protected ArrayList<Products> system_Food;
    
    Scanner s = new Scanner(System.in);
    String name_Product;

    public HORECA(int length){
        this.num_Products = length;
        system_Products = new ArrayList<Products>();
    }

    // Add Product

    public void addProduct(int type){

        if (system_Products.size() >= num_Products)
            System.out.println("No more space in the list");

        else{
            System.out.println("Please enter the name of the product: ");
            name_Product = s.nextLine();
            switch (type){
                // Food
                case 1: Food food = new Food(name_Product);
                        system_Food.add(food);
                        system_Products.add(food);
                        System.out.println(food + " was added succesfully.");
                        break;

                // Drinks
                case 2: Drinks drink = new Drinks(name_Product);
                        system_Drinks.add(drink);
                        system_Products.add(drink);
                        System.out.println(drink + " was added succesfully.");
                        break;

                // Wines        
                case 3: Wines wine = new Wines(name_Product);
                        system_Wines.add(wine);
                        system_Products.add(wine);
                        System.out.println(wine + " was added succesfully.");
                        break;
                
            }
        }
    }

    // Remove Product

    public void removeProduct(int type){
        System.out.println("Please enter the name of the product: ");
        name_Product = s.nextLine();
        
    }

    // Menu
    
    public boolean runMenu(){

        boolean exit = false;

        // Display

        System.out.println(" Welcome to the HORECA System Console Menu!");
        System.out.println("    -To add a new product, press 1.");
        System.out.println("    -To remove a product, press 2.");
        System.out.println("    -To save all the information in a file, press 3.");
        System.out.println("    -To exit the application, press 4.");
        
        int optionMenu = s.nextInt();

        // Functionalities

        switch (optionMenu){
            
            // Add or Remove a Product

            case 1:     
                System.out.println("Please choose one from the following: ");
                System.out.println("    1. Food");
                System.out.println("    2. Drinks");
                System.out.println("    3. Wines");
                optionMenu = s.nextInt();
                addProduct(optionMenu);
                break;
            case 2:
                System.out.println("Please choose one from the following: ");
                System.out.println("    1. Food");
                System.out.println("    2. Drinks");
                System.out.println("    3. Wines");
                optionMenu = s.nextInt();
                
            case 4:
                s.close();
                exit = true;
                break;
        }
        return exit;
    }
    
    public static void main(String args[]){

        HORECAInterface sys = new HORECA(10);
        boolean exit = false;

        while (!exit){
            exit = sys.runMenu();
        }

        
    }


   
}