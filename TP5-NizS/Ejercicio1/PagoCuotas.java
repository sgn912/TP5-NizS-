package resol.NizS.ejercicio1;

public class PagoCuotas extends MetodoPago {

    private int cuotas;

    public PagoCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public int getCuotas() {
        return cuotas;
    }

    private double recargo() {

        if (cuotas > 12)
            return 0.12;

        if (cuotas > 6)
            return 0.08;

        if (cuotas > 3)
            return 0.05;

        return 0;
    }

    @Override
    public double calcularPrecio(double precio) {
        return precio * (1 + recargo());
    }

    public double obtenerRecargo(double precio){
        return precio * recargo();
    }

    @Override
    public String descripcion() {
        return cuotas + " cuotas";
    }
}
