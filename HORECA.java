
import java.util.ArrayList;
import java.util.Scanner;

public abstract class HORECA{

    // States

    ArrayList<Products> system_Wines = new ArrayList<Products>();
    ArrayList<Products> system_Drinks = new ArrayList<Products>();
    ArrayList<Products> system_Food = new ArrayList<Products>();
    
    public boolean Menu(){

        boolean exit = false;

        // Console Menu

        System.out.println(" Welcome to the HORECA System Console Menu!");
        System.out.println("    -To add a new product, press 1.");
        System.out.println("    -To remove a product, press 2.");
        System.out.println("    -To save all the information in a file, press 4.");
        System.out.println("    -To exit the application, press 0.");

        // Scanners

        Scanner s = new Scanner(System.in);
        int optionMenu = s.nextInt();
        int optionProduct;
        String nameProduct;

        s.close();
        // Functionalities

        switch (optionMenu){
            
            // Add or Remove a Product

            case 1 & 2:     
                System.out.println("Please choose from one of the following: ");
                System.out.println("    1. Wines");
                System.out.println("    2. Drinks");
                System.out.println("    3. Food");
                optionProduct = s.nextInt();

                // Type of Product

                switch (optionProduct){

                    // Wine
                    case 1: 

                        System.out.println("Please enter the name of the product: ");
                        nameProduct = s.nextLine();

                        // Add
                        if (optionMenu == 1){
                            Wines wine = new Wines(nameProduct);
                            system_Wines.add(wine);
                            System.out.println(nameProduct + "was added.");
                        }
                        // Remove
                        else{
                            system_Wines.remove(String.valueOf(nameProduct));
                            System.out.println(nameProduct + "was removed.");
                        }
                    
                    // Drink
                    case 2: 

                        System.out.println("Please enter the name of the product: ");
                        nameProduct = s.nextLine();

                        // Add
                        if (optionMenu == 2){
                            Drinks drink = new Drinks(nameProduct);
                            system_Drinks.add(drink);
                            System.out.println(nameProduct + "was added.");
                        }
                        // Remove
                        else{
                            system_Drinks.remove(String.valueOf(nameProduct));
                            System.out.println(nameProduct + "was removed.");
                        }

                    // Food
                    case 3: 

                        System.out.println("Please enter the name of the product: ");
                        nameProduct = s.nextLine();

                        // Add
                        if (optionMenu == 3){
                            Food food = new Food(nameProduct);
                            system_Wines.add(food);
                            System.out.println(nameProduct + "was added.");
                        }
                        // Remove
                        else{
                            system_Food.remove(String.valueOf(nameProduct));
                            System.out.println(nameProduct + "was removed.");
                        }
                }
            
        }

        return true;
    }
    
    
    
    public static void main(String args[]){
        
    }
}