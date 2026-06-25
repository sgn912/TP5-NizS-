package resol.NizS.ejercicio1;

public class Cupon {

    private boolean valido;

    public Cupon(boolean valido) {
        this.valido = valido;
    }

    public double aplicar(double precio) {

        if (valido) {
            return precio * 0.90;
        }

        return precio;
    }

    public boolean esValido() {
        return valido;
    }
}
