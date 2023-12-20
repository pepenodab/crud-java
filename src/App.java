import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        final Crud[] OBJECTLIST = new Crud[10];
        int counter = 0;
        String userOption = "xD";
        while (userOption != ":)") {
            System.out.println("           MENU           ");
            System.out.println(" Occupation of the array " + counter + "/10");
            System.out.println("1.- Creation of an object");
            System.out.println("2.- Read attributs from an object");
            System.out.println("3.- Update date of an object");
            System.out.println("4.- Delete an object");
            System.out.println("5.- Exit");
            userOption = scanner.nextLine();
            switch (userOption) {
                case "1":
                    Crud object = new Crud();
                    object.create();
                    counter++;
                    for (int i = 0; i < OBJECTLIST.length; i++) {
                        if(OBJECTLIST[i] == null){
                            OBJECTLIST[i]= object;
                            System.out.println("The object " + object.getName() + " got index : " + i );
                            break;
                        }
                    }
                    break;
                case "2":
                    System.out.println("Insert index of the object you want to read");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    OBJECTLIST[index].read();
                    break;
                case "3":
                    System.out.println("Insert index of the object you want to modify ");
                    index = scanner.nextInt();
                    scanner.nextLine();
                    OBJECTLIST[index].update();
                    break;
                case "4":
                    System.out.println("Insert index of the object you want to modify ");
                    index = scanner.nextInt();
                    scanner.nextLine();
                    OBJECTLIST[index].delete();
                    counter--;
                    break;
                case "5":
                    System.out.println("Goodbye :)");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select a valid option");
                    break;
            }
        }
    scanner.close();
    }
}
// Cuando presiones enter al modificar, si esta vacio dejar el anterior valor 