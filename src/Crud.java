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
    

}
