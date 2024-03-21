
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

                    case 1: 
                        System.out.println("Please enter the name of the product: ");
                        nameProduct = s.nextLine();

                        if (optionMenu == 1){
                            Wines wine = new Wines(nameProduct);
                            system_Wines.add(wine);
                            System.out.println(nameProduct + "was added.");
                        }
                        else{
                            for (int i = 0; i < system_Wines.size(); i++){
                                if (system_Wines.get(i).name == nameProduct){
                                    system_Wines.remove(system_Wines.get(i));
                                    System.out.println(nameProduct + "was removed.");
                                    break;
                                }
                            }
                        }
                    

                }



            
        }

        return true;
    }
    
    
    
    public static void main(String args[]){
        
    }
}