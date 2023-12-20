import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Crud[] OBJECTLIST = new Crud[10];
        for (int i = 0; i < OBJECTLIST.length; i++) {
            Crud Sex = new Crud("mate", null, false);
            OBJECTLIST[i]= Sex;
        }
        int counter = 0;
        String userOption = "xD";
        while (userOption != ":)") {
            Utils.menu(counter);
            userOption = scanner.nextLine();
            switch (userOption) {
                case "1":
                    if (counter >= 10) {
                        System.out.println( "My masculity look fragile, so you cant create a new object");
                    } else {
                        OBJECTLIST = Utils.add(OBJECTLIST);
                        counter++;
                    }
                    break;
                case "2":
                    Utils.peruse(OBJECTLIST);
                    break;
                case "3":
                    OBJECTLIST = Utils.change(OBJECTLIST);
                    break;
                case "4":
                    System.out.println("Insert index of the object you want to delete ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (OBJECTLIST[index] == null) {
                        counter--;
                    }
                    OBJECTLIST = Utils.remove(OBJECTLIST,index);
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