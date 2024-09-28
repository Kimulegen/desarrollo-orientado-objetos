public class Ropa extends Producto {
    private String talla;
    private String color;

    public Ropa(String idProducto, String nombre, double precio, String talla, String color) {
        super(idProducto, nombre, precio);
        this.talla = talla;
        this.color = color;
    }

    private void ajustarTalla(String nuevaTalla) {
        this.talla = nuevaTalla;
    }
}
