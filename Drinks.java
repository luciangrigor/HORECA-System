
public class Drinks extends Products {
    
    // States
    private String type;
    private String name;

    // Constructors
    public Drinks(String name){
        this.name = name;
    }

    // Set Methods
    public void set_type(String type){
        this.type = type;
    }

    // Get Methods
    public void get_type(){
        System.out.println("Tyoe of drink: " + type);
    }
}
