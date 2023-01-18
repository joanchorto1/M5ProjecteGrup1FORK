package ProjecteMP05;
import java.util.ArrayList;
import java.util.Scanner;
public class Associacions {
    static ArrayList<Associacions> associacions = new ArrayList<Associacions>();
    static Scanner scanner = new Scanner(System.in);
    String name;
    String distance;
    String phoneNumber;
    public Associacions(String name, String distance, String phoneNumber) {
        this.name = name;
        this.distance = distance;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Nom: " + name + ", Distancia: " + distance + ", Numero de telefon: " + phoneNumber;
    }
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Crear associació");
            System.out.println("2. Canviar el nom d'associació");
            System.out.println("3. Eliminar associació");
            System.out.println("4. Mostrar informació d'una associació");
            System.out.println("5. Exit");
            System.out.print("Posa la teva resposta: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createGroup();
                    break;
                case 2:
                    changeGroupName();
                    break;
                case 3:
                    deleteGroup();
                    break;
                case 4:
                    displayGroupInformation();
                    break;
                case 5:
                    System.out.println("Sortint...");
                    break;
                default:
                    System.out.println("Numero no valid.");
            }
        } while (choice != 5);
    }
    public static void createGroup() {
        System.out.print("Nom de l'associació: ");
        String name = scanner.next();
        System.out.print("Distància a l'associació: ");
        String distance = scanner.next();
        System.out.print("Número de telèfon de l'associació: ");
        String phoneNumber = scanner.next();
        associacions.add(new Associacions(name, distance, phoneNumber));
        System.out.println("Associació creat correctament.");
    }
    public static void changeGroupName() {
        System.out.print("Nom de l'associació: ");
        String oldName = scanner.next();
        int index = getGroupIndex(oldName);
        if (index == -1) {
            System.out.println("Associació no trobada.");
            return;
        }
        System.out.print("Nou nom de l'associació: ");
        String newName = scanner.next();
        associacions.get(index).setName(newName);
        System.out.println("Nom de l'associacio canviat.");
    }
    public static void deleteGroup() {
        System.out.print("Posa el nom de l'associació que vols borrar: ");
        String name = scanner.next();
        int index = getGroupIndex(name);
        if (index == -1) {
            System.out.println("Associació no trobada");
            return;
        }
        associacions.remove(index);
        System.out.println("Associació borrada correctament.");
    }
    public static void displayGroupInformation() {
        for (int i = 0; i < associacions.size(); i++) {
            System.out.println(associacions.get(i));
        }
    }
    public static int getGroupIndex(String name) {
        for (int i = 0; i < associacions.size(); i++) {
            if (associacions.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
