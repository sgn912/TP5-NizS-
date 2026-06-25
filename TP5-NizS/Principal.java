package resol.NizS;

import java.util.Scanner;

import resol.NizS.ejercicio1.Ejercicio1;
import resol.NizS.ejercicio2.Ejercicio2;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione ejercicio:");
        System.out.println("1 - Tienda de ropa");
        System.out.println("2 - Agenda");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Ejercicio1.ejecutar();
                break;

            case 2:
                Ejercicio2.ejecutar();
                break;

            default:
                System.out.println("Opcion erronea");
        }

        sc.close();
    }
}
