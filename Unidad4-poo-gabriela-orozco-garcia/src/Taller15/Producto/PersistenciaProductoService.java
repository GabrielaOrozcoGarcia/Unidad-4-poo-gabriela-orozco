package Taller15.Producto;

public class PersistenciaProductoService {

    public void guardarProducto(ProductoSRP producto) {
        System.out.println("Guardando producto en base de datos: " + producto.getNombre());
    }
}

