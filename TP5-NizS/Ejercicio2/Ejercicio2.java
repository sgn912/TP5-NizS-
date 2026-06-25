package resol.NizS.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void ejecutar() {

        Scanner sc =
                new Scanner(System.in);

        System.out.print(
                "Capacidad agenda (0=10): "
        );

        int tam =
                sc.nextInt();

        Agenda agenda;

        if (tam == 0) {
            agenda =
                    new Agenda();
        } else {
            agenda =
                    new Agenda(tam);
        }

        int opcion;

        do {

            System.out.println(
                    "\n=== AGENDA ==="
            );

            System.out.println(
                    "1 Agregar contacto"
            );

            System.out.println(
                    "2 Buscar contacto"
            );

            System.out.println(
                    "3 Eliminar contacto"
            );

            System.out.println(
                    "4 Listar contactos"
            );

            System.out.println(
                    "5 Agenda llena"
            );

            System.out.println(
                    "6 Espacio libre"
            );

            System.out.println(
                    "0 Salir"
            );

            opcion =
                    sc.nextInt();

            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print(
                            "Nombre: "
                    );

                    String nombre =
                            sc.nextLine();

                    System.out.print(
                            "Teléfono: "
                    );

                    String telefono =
                            sc.nextLine();

                    agenda.agregarContacto(
                            new Contacto(
                                    nombre,
                                    telefono
                            )
                    );

                    break;

                case 2:

                    System.out.print(
                            "Nombre: "
                    );

                    agenda.buscaContacto(
                            sc.nextLine()
                    );

                    break;

                case 3:

                    System.out.print(
                            "Teléfono: "
                    );

                    agenda.eliminarContacto(
                            new Contacto(
                                    "",
                                    sc.nextLine()
                            )
                    );

                    break;

                case 4:

                    agenda.listarContactos();

                    break;

                case 5:

                    if (
                            agenda.agendaLlena()
                    ) {

                        System.out.println(
                                "Agenda llena"
                        );

                    } else {

                        System.out.println(
                                "Hay espacio"
                        );
                    }

                    break;

                case 6:

                    System.out.println(
                            "Espacios libres: "
                                    +
                                    agenda.espacioLibre()
                    );

                    break;

                case 0:

                    System.out.println(
                            "Saliendo..."
                    );

                    break;

                default:

                    System.out.println(
                            "Opción inválida"
                    );
            }

        } while (
                opcion != 0
        );

    }
}
