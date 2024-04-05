
public class Wines extends Products {
    
    // States
    private String type;
    private String country;
    private String name;

    // Constructors
    public Wines(String name){
        this.name = name;
    }

    // Set Methods
    public void set_type(String type){
        this.type = type;
    }
    public void set_country(String country){
        this.country = country;
    }

    // Get Methods
    public void get_type(){
        System.out.println("Type of the wine: " + type);
    }
    public void get_country(){
        System.out.println("country of the product: " + country);
    }
}
