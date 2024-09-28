import java.util.ArrayList;

public class Cliente {
    private String idCliente;
    private String nombre;
    private ArrayList<Reserva> reservasRealizadas;

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.reservasRealizadas = new ArrayList<>();
    }

    public String getId() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarReserva(Reserva reserva) {
        this.reservasRealizadas.add(reserva);
    }

    public void eliminarReserva(Reserva reserva) {
        this.reservasRealizadas.remove(reserva);
    }

    public String verReservas() {
        if (this.reservasRealizadas.isEmpty()) {
            return "No hay reservas";
        }
        StringBuilder reservas = new StringBuilder();
        reservas.append("Reservas: ");
        for (Reserva reserva : reservasRealizadas) {
            reservas.append(reserva.getAsientoReservado()).append(" ");
        }
        return reservas.toString().isEmpty() ? "No existen reservas" : reservas.toString();
    }
}