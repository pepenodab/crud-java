import java.util.Scanner;

public class Crud {
    Scanner scanner = new Scanner(System.in);
    // Atributos
    private String name;
    private String description ;
    private boolean made;
    // Builders
    public Crud () {
    }

    public Crud (String name, String description, boolean made) {
        this.name = name;
        this.description = description;
        this.made = made;
    }
    // function and procedures
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMade() {
        return made;
    }

    public void setMade(boolean made) {
        this.made = made;
    }
    // Methods
    public void create() {
        System.out.println("Please insert the name, that u will like to put");
        String name = scanner.nextLine();
        this.setName(name);
        System.out.println("Give a brief description");
        String description = scanner.nextLine();
        this.setDescription(description);
        this.setMade(true);
    }
    
    public void read(){
        System.out.println("Object name: " + this.name + ", Object description: " + this.description + " Its made?: " + made);
    }

    /*@Override
    public String toString() {
        return "Crud [name=" + name + ", description=" + description + ", made=" + made + "]";
    }*/
    
    public void update(){
        System.out.println("Write a new description: ");
        description = scanner.nextLine();
        this.setDescription(description);
    }

    public void delete(){
        this.setName(null);
        this.setDescription(null);
        this.setMade(false);
    }
}
