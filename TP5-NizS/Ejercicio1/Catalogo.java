package resol.NizS.ejercicio1;

import java.util.ArrayList;

public class Catalogo {

    private ArrayList<Prenda> prendas;

    public Catalogo() {

        prendas = new ArrayList<>();

        prendas.add(new Prenda("Camisa",25000,"M"));
        prendas.add(new Prenda("Pantalón",40000,"L"));
        prendas.add(new Prenda("Zapatillas",60000,"42"));
    }

    public void mostrar() {

        for(int i=0;i<prendas.size();i++){

            System.out.println(
                    (i+1)+". "+prendas.get(i)
            );
        }
    }

    public Prenda obtener(int i){

        return prendas.get(i);
    }
}
