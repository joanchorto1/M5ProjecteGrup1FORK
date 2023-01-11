import java.util.Arrays;
import java.util.Scanner;

public class AfegirProducte2 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);


        System.out.println("Quants aliments vols posar?");
        int numAliments= ent.nextInt();

        String[]aliments=new String[numAliments];
        for (int i = 0; i < numAliments; i++) {
            System.out.println("Introdueix el nom de l'aliment:");
            aliments[i]= ent.nextLine();
        }
        System.out.println(Arrays.toString(aliments));



    }
}
