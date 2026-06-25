package resol.NizS.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    private static Catalogo catalogo =
            new Catalogo();

    private static ArrayList<Compra> compras =
            new ArrayList<>();


    public static void ejecutar() {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n=== TIENDA ===");

            System.out.println("1 Comprar");
            System.out.println("2 Ver compras");
            System.out.println("0 Salir");

            opcion = sc.nextInt();

            switch(opcion){

                case 1:
                    comprar(sc);
                    break;

                case 2:
                    mostrarCompras();
                    break;
            }

        } while(opcion!=0);

    }

    private static void comprar(
            Scanner sc
    ){

        catalogo.mostrar();

        System.out.print(
                "Seleccione prenda: " 
        );
        int indice =
                sc.nextInt()-1;

        Prenda prenda =
                catalogo.obtener(indice);

        System.out.println(
                "1 Contado"
        );

        System.out.println(
                "2 Cuotas"
        );

        int metodo =
                sc.nextInt();

        MetodoPago pago;

        double precio =
                prenda.getPrecioBase();

        double descuento = 0;

        double recargo = 0;

        int cuotas = 0;

        if(metodo==1){

            PagoContado pc =
                    new PagoContado();

            descuento =
                    pc.obtenerDescuento(
                            precio
                    );

            precio =
                    pc.calcularPrecio(
                            precio
                    );

            pago=pc;

        }else{

            System.out.print(
                    "Cantidad cuotas: "
            );

            cuotas =
                    sc.nextInt();

            PagoCuotas pq =
                    new PagoCuotas(
                            cuotas
                    );

            recargo =
                    pq.obtenerRecargo(
                            precio
                    );

            precio =
                    pq.calcularPrecio(
                            precio
                    );

            pago=pq;
        }

        System.out.print(
                "¿Cupón? (s/n): "
        );

        boolean cupon =
                sc.next()
                        .equalsIgnoreCase(
                                "s"
                        );

        double descCupon=0;

        if(cupon){

            descCupon =
                    precio*0.10;

            Cupon c =
                    new Cupon(true);

            precio =
                    c.aplicar(precio);
        }

        System.out.println(
                "\n===== RESUMEN ====="
        );

        System.out.println(
                "Prenda: "
                        +prenda.getTipo()
        );

        System.out.println(
                "Precio base: $"
                        +prenda.getPrecioBase()
        );

        System.out.println(
                "Método: "
                        +pago.descripcion()
        );

        System.out.println(
                "Descuento contado: $"
                        +descuento
        );

        System.out.println(
                "Recargo cuotas: $"
                        +recargo
        );

        System.out.println(
                "Descuento cupón: $"
                        +descCupon
        );

        System.out.println(
                "TOTAL: $"
                        +precio
        );

        compras.add(
                new Compra(
                        prenda,
                        pago,
                        cupon,
                        precio
                )
        );
    }

    private static void mostrarCompras(){

        if(compras.isEmpty()){

            System.out.println(
                    "Sin compras"
            );

            return;
        }

        for(
                Compra c:
                compras
        ){

            System.out.println(
                    c
            );
        }
    }
}
