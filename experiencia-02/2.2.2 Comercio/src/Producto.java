public class Producto {
    private String idProducto;
    private String nombre;
    private double precio;

    public Producto(String idProducto, String nombre, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public double calcularDescuento(double descuento){
        return precio * descuento;
    }

    public double getPrecio(){
        return precio;
    }
}
