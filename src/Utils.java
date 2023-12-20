import java.util.Scanner;

public class Utils {
    // METODOS ESTATICOS (TuTuTuTuTuTu) no need builders and objects;
    final static Scanner scanner = new Scanner(System.in);  // poner final static para crear atributos para los metodos static
    public static void menu(int counter) {
        System.out.println("           MENU           ");
            System.out.println(" Occupation of the array " + counter + "/10");
            System.out.println("1.- Creation of an object");
            System.out.println("2.- Read attributs from an object");
            System.out.println("3.- Update date of an object");
            System.out.println("4.- Delete an object");
            System.out.println("5.- Exit");
    }

    public static Crud[] add(Crud[] OBJECTLIST){
        Crud object = new Crud();
        object.create();
        for (int i = 0; i < OBJECTLIST.length; i++) {
            if(OBJECTLIST[i].getName() == "mate"){
                OBJECTLIST[i]= object;
                System.out.println("The object " + object.getName() + " got index : " + i );
                break;
            }
        }
        return OBJECTLIST;
    }

    public static void peruse(Crud[] OBJECTLIST){
        System.out.println("Insert index of the object you want to read");
        int index = scanner.nextInt();
        scanner.nextLine();
        OBJECTLIST[index].read();
    }

    public static Crud[] change(Crud[] OBJECTLIST){
        System.out.println("Insert index of the object you want to modify ");
        int index = scanner.nextInt();
        scanner.nextLine();
        OBJECTLIST[index].update();
        return OBJECTLIST;
    }

    public static Crud[] remove(Crud[] OBJECTLIST, int index){
        if(OBJECTLIST[index] != null){
            OBJECTLIST[index].delete();
        }else {
            System.out.println("You dont have nothing there, fking monk**");
        }
        return OBJECTLIST;
    }
}
