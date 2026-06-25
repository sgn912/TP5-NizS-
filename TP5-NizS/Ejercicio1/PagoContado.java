package resol.NizS.ejercicio1;

public class PagoContado extends MetodoPago {

    private final double DESCUENTO = 0.15;

    @Override
    public double calcularPrecio(double precio) {
        return precio * (1 - DESCUENTO);
    }

    @Override
    public String descripcion() {
        return "Pago al contado (15% descuento)";
    }

    public double obtenerDescuento(double precio){
        return precio * DESCUENTO;
    }
}
