import java.util.ArrayList;

public class Pedido {
    private ArrayList<Producto> productos;
    private double total;

    public Pedido() {
        productos = new ArrayList<>();
        total = 0;
    }

    public Pedido(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double calcularTotal(){
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}
