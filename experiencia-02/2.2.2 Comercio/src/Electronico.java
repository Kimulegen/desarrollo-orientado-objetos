public class Electronico extends Producto {
    private String marca;
    private int garantiaMeses;

    public Electronico(String idProducto, String nombre, double precio, String marca, int garantiaMeses) {
        super(idProducto, nombre, precio);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public void extenderGarantia(int mesesExtra){
        this.garantiaMeses += mesesExtra;
    }
}
