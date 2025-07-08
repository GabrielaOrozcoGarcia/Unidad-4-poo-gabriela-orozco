package Taller15.Producto;

public class EtiquetaProductoService {

    public void generarEtiqueta(ProductoSRP producto, double precioFinal) {
        System.out.println("..::Etiqueta del Producto::..");
        System.out.println("Producto: " + producto.getNombre());
        System.out.printf("Precio Final: $%.2f%n", precioFinal);
        System.out.println("----------------------------");
    }
}

