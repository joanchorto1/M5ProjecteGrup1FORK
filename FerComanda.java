package org.example;
import java.util.Arrays;
import java.util.Scanner;

import static com.iesebre.dam1.library.Data.diaSeguent;

public class FerComanda {

    public static int[] comanda(  int[] nomProductes, int[] quantitatProductes,  int[] nomAsso, int[] dataComanda) {
        Scanner ent = new Scanner(System.in);
        int[] producteComanda = new int[3];
        int indexProducte=0;

        System.out.println("Quin producte necessites?");
        producteComanda[0]=ent.nextInt();
        System.out.println("Quant en vols?");
        producteComanda[1]=ent.nextInt();
        System.out.println("A quina associació s'ha de enviar?");
        producteComanda[2]=ent.nextInt();

        for (int i = 0; i < nomProductes.length; i++) {
            if (nomProductes[i]==producteComanda[0]){
                indexProducte=i;
            }
        }

        if (producteComanda[1]>quantitatProductes[indexProducte]){

            dataComanda=diaSeguent(dataComanda[0],dataComanda[1],dataComanda[2]);

            System.out.println("La seva comanda de "+producteComanda[1]+"kg de"+producteComanda[0]+" sera entregada els dia "+ Arrays.toString(dataComanda));
            return producteComanda;

        }else return null;

        //Fara falta sumar el comanda[1] al producte de la associació
    }

}
