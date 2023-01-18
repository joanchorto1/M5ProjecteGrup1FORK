package org.example;

public class restarStock {
    public static double stockAliments[]=new double[10];
    public static String nomAliments[]=new String[10];

public static void restar(int quantitat, String nom){
    for (int i = 0; i < nomAliments.length; i++) {
        if (nom == nomAliments[i]){
            stockAliments[i]=stockAliments[i]-quantitat;
        }
    }
}

    public static void main(String[] args) {
    nomAliments[1]="arroz";
    stockAliments[1]=100;
        System.out.println(stockAliments[1]);
        restar(10,"arroz");
        System.out.println(stockAliments[1]);
    }
}
