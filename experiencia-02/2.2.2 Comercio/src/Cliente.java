import java.util.ArrayList;

public class Cliente {
    private String idCliente;
    private String nombre;
    private ArrayList<Pedido> pedidosRealizados;

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.pedidosRealizados = new ArrayList<Pedido>();
    }

    public Cliente(String idCliente, String nombre, ArrayList<Pedido> pedidosRealizados) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.pedidosRealizados = pedidosRealizados;
    }
}
