import java.util.ArrayList;

public class CarritoCompras {
    private ArrayList<Producto> productos = new ArrayList<>();
    private double total = 0.0;

    public CarritoCompras() {
    }

    public CarritoCompras(ArrayList<Producto> productos) {
        for(Producto p : productos) {
            total += p.getPrice();
            this.productos.add(p);
        }
    }

    public Producto[] getProductos() {
        var productos =  new Producto[this.productos.size()];
        return this.productos.toArray(productos);
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void addProducto(Producto producto) {
        this.productos.add(producto);
        this.total += producto.getPrice();
    }

    public void quitarProducto(Producto producto) {
        for (Producto p : this.productos){
            if (p.getId().equals(producto.getId())){
                this.productos.remove(p);
                this.total -= producto.getPrice();
                break;
            }
        }
        System.out.println("Producto con id " + producto.getId() + " quitado con éxito" );
    }

    public void showProductList(){
        for(Producto p : this.productos){
            System.out.println(p.getName());
        }
    }
}
