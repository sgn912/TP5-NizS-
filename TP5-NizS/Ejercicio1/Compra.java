package resol.NizS.ejercicio1;

public class Compra {

    private Prenda prenda;
    private MetodoPago pago;
    private boolean cupon;
    private double precioFinal;

    public Compra(
            Prenda prenda,
            MetodoPago pago,
            boolean cupon,
            double precioFinal
    ) {
        this.prenda = prenda;
        this.pago = pago;
        this.cupon = cupon;
        this.precioFinal = precioFinal;
    }

    @Override
    public String toString() {

        return "\nPrenda: " + prenda.getTipo() +
                "\nTalle: " + prenda.getTalle() +
                "\nMétodo: " + pago.descripcion() +
                "\nCupón: " + (cupon ? "Sí" : "No") +
                "\nTotal: $" + precioFinal;
    }
}
