
public class Food extends Products {
    
    // States 
    private String type;
    private String name;
    
    // Constructors
    public Food(String name){
        this.name = name;
    }

    // Set Methods
    public void set_type(String type){
        this.type = type;
    }

    // Get Methods
    public void get_type(){
        System.out.println("Type of food: " + type);
    }

}
