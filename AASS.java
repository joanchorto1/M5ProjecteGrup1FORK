package ProjecteMP05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AASS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> vectorAssociacions = new ArrayList<String>();
        vectorAssociacions.add("Associacio Pepe");
        vectorAssociacions.add("Associacio Josep");
        vectorAssociacions.add("Associacio Taula");

        String[] AASS1 = {vectorAssociacions.get(0), "640475123", "150km"};
        String[] AASS2 = {vectorAssociacions.get(1), "632571159", "250km"};
        String[] AASS3 = {vectorAssociacions.get(2), "668475923", "50km"};
        while (true) {
            System.out.println("Elegeix una opció vàlida per a la AASS\n ");
            System.out.println("1. Afegir AASS");
            System.out.println("2. Eliminar AASS");
            System.out.println("3. Modificar nom de AASS");
            System.out.println("4. Veure informació de una AASS (nom, telef, distancia");
            int opcio = scanner.nextInt();
            if (opcio == 1) {
                int contador = 0;
                System.out.println(vectorAssociacions);
                System.out.println("Digues en ordre la seguent informació, (nom, telef, distancia) ");
                String nomAASS = scanner.skip("[\r\n]*").nextLine();
                String telfAASS = scanner.skip("[\r\n]*").nextLine();
                String distAASS = scanner.skip("[\r\n]*").nextLine();
                System.out.println("Associacio creada correctament! ");
                vectorAssociacions.add(nomAASS);
                String[] AASSnova = {nomAASS, telfAASS, distAASS};
            }
            if (opcio == 2) {
                System.out.println("Quina associacio vols eliminar de la llista?: ");
                System.out.println(vectorAssociacions);
                int eliminar = scanner.nextInt();
                System.out.println("Associacio eliminada correctament! ");
                if(eliminar < vectorAssociacions.size() && eliminar == 1){
                    vectorAssociacions.remove(eliminar-1);
                }
                if(eliminar < vectorAssociacions.size() && eliminar == 2){
                    vectorAssociacions.remove(eliminar-1);
                }
                if(eliminar < vectorAssociacions.size() && eliminar == 3){
                    vectorAssociacions.remove(eliminar-1);
                }
                if(eliminar < vectorAssociacions.size() && eliminar == 4){
                    vectorAssociacions.remove(eliminar-1);
                }
            }
            if (opcio == 3) {
                System.out.println("Quina es la associacio que vols modificar? ");
                System.out.println(vectorAssociacions);
                int modificacio = scanner.nextInt();
                System.out.println("Quina es la informació que vols modificar? (nom, telf, distancia) ");
                String informacio = scanner.skip("[\r\n]*").nextLine();

                    if(informacio.equals("nom")){
                        System.out.println("Indica el nom per a reemplaçar-lo. ");
                        String newNOM = scanner.nextLine();
                        vectorAssociacions.set(modificacio-1, newNOM);
                        System.out.println("Nom canviat correctament! ");
                    }
                    if(informacio.equals("telf")){
                        System.out.println("Indica el telèfon per a reemplaçar. ");
                        String newTELF = scanner.nextLine();
                        vectorAssociacions.set(modificacio-1, newTELF);
                        System.out.println("Telèfon canviat correctament! ");
                    }
                    if(informacio.equals("distancia")){
                        System.out.println("Indica la distància per reemplaçar-lo. ");
                        String newDIST = scanner.nextLine();
                        AASS1[2] = newDIST;
                        System.out.println("Distància canviada correctament! ");
                    }

            }
            if (opcio == 4) {
                System.out.println("De quina associació vols consultar informació?: ");

                System.out.println(vectorAssociacions);
                int veureInfo = scanner.nextInt();
                if (veureInfo == 1 && vectorAssociacions.size() >= 1) {
                    System.out.println(Arrays.toString(AASS1));
                }
                if (veureInfo == 2 && vectorAssociacions.size() >= 2) {
                    System.out.println(Arrays.toString(AASS2));
                }
                if (veureInfo == 3 && vectorAssociacions.size() >= 3) {
                    System.out.println(Arrays.toString(AASS3));
                }
                System.out.println("Vols continuar fent operacions? (SI / NO)  ");
                String resposta = scanner.skip("[\r\n]*").nextLine();
                if(resposta.equals("NO")){
                    break;
                }

            }
        }
    }
}
