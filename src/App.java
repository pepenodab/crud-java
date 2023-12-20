import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        final Crud[] OBJECTLIST = new Crud[10];
        int counter = 1;
        String userOption = "xD";
        while (userOption != ":)") {
            System.out.println("           MENU           ");
            for (int i = 0; i < OBJECTLIST.length; i++) {
                if (OBJECTLIST[i] != null){
                    counter += 1;
                }
            }
            System.out.println(" Occupation of the array " + (counter-1) + "/10");
            System.out.println("1.- Creation of a object");
            System.out.println("2.- Read attributs from a object");
            System.out.println("3.- Update date of a object");
            System.out.println("4.- Delete a object");
            System.out.println("5.- Exit");
            userOption = scanner.nextLine();
            switch (userOption) {
                case "1":
                    Crud object = new Crud();
                    object.create();
                    for (int i = 0; i < OBJECTLIST.length; i++) {
                        if(OBJECTLIST[i] == null){
                            OBJECTLIST[i]= object;
                            System.out.println("The object " + object.getName() + " got index : " + i );
                            break;
                        }
                    }
                    break;
                case "2":
                    
                    break;
                case "3":
                    
                    break;
                case "4":
                    
                    break;
                case "5":
                    
                    break;
                default:
                    System.out.println("Please select a valid option");
                    break;
            }
        }
    scanner.close();
    }
}
