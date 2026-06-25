package resol.NizS.ejercicio2;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> contactos;
    private int capacidad;

    public Agenda() {
        this(10);
    }

    public Agenda(int capacidad) {
        this.capacidad = capacidad;
        contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto c) {

        if (agendaLlena()) {
            System.out.println("La agenda está llena.");
            return;
        }

        if (existeContacto(c)) {
            System.out.println("Ese teléfono ya existe.");
            return;
        }

        contactos.add(c);

        System.out.println("Contacto agregado.");
    }

    public boolean existeContacto(Contacto c) {

        for (Contacto contacto : contactos) {

            if (contacto.getTelefono()
                    .equals(c.getTelefono())) {

                return true;
            }
        }

        return false;
    }

    public void listarContactos() {

        if (contactos.isEmpty()) {

            System.out.println(
                    "No hay contactos."
            );

            return;
        }

        System.out.println("\n=== CONTACTOS ===");

        for (Contacto c : contactos) {

            System.out.println(c);
        }
    }

    public void buscaContacto(
            String nombre
    ) {

        for (Contacto c : contactos) {

            if (
                c.getNombre()
                 .equalsIgnoreCase(nombre)
            ) {

                System.out.println(
                        "Teléfono: "
                        + c.getTelefono()
                );

                return;
            }
        }

        System.out.println(
                "Contacto no encontrado."
        );
    }

    public void eliminarContacto(
            Contacto contacto
    ) {

        for (
                Contacto c
                : contactos
        ) {

            if (
                c.getTelefono()
                        .equals(
                                contacto.getTelefono()
                        )
            ) {

                contactos.remove(c);

                System.out.println(
                        "Contacto eliminado."
                );

                return;
            }
        }

        System.out.println(
                "No se encontró."
        );
    }

    public boolean agendaLlena() {

        return contactos.size()
                >= capacidad;
    }

    public int espacioLibre() {

        return capacidad
                - contactos.size();
    }
}
