import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {
    private String idEvento;
    private String nombre;
    private LocalDate fecha;
    private ArrayList<Reserva> reservas;
    private ArrayList<Cliente> clientes;

    public Evento(String idEvento, String nombre, LocalDate fecha) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.fecha = fecha;
        reservas = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public String getId() {
        return idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Reserva getReserva(String asiento) {
        for (Reserva r : reservas) {
            if (r.getAsientoReservado().equals(asiento)) {
                return r;
            }
        }
        return null;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public String verClientes(){
        if(clientes.isEmpty()){
            return "No hay clientes";
        }
        StringBuilder clientList = new StringBuilder();
        clientList.append(String.format("%-10s","ID Cliente"))
                .append(" ".repeat(5))
                .append(String.format("%-15s","Nombre"))
                .append(System.lineSeparator())
                .append("-".repeat(26))
                .append(System.lineSeparator());

        for (Cliente cliente : clientes) {
            clientList.append(String.format("%-10s", cliente.getId()))
                    .append(" ".repeat(5))
                    .append(String.format("%-15s", cliente.getNombre()))
                    .append(System.lineSeparator());

        }

        return clientList.toString();
    }

    public boolean existeReserva(String asiento) {
        for (Reserva r : reservas) {
            if (r.getAsientoReservado().equals(asiento)) {
                return true;
            }
        }
        return false;
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void eliminarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }
}
