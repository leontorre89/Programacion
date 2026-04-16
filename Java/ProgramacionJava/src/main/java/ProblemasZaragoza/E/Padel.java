package ProblemasZaragoza.E;

import java.util.Scanner;

public class Padel {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porcenaje de culpa del compañero: ");
        int companero = sc.nextInt();
        System.out.println("Pista: ");
        int pista = sc.nextInt();
        System.out.println("Pala");
        int pala = sc.nextInt();
        System.out.println("Pelota");
        int pelota = sc.nextInt();

        int suma = companero + pista + pala + pelota;
        int culpa = 100 - suma;
        System.out.println("Tu tienes un " + culpa + "% de culpa");
    }
}
