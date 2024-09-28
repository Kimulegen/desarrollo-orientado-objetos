import java.util.ArrayList;

public class Cliente {
    private final String idCliente;
    private final ArrayList<Reserva> reservasRealizadas;

    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente;
        reservasRealizadas = new ArrayList<>();
    }

    public String getIdCliente() {
        return idCliente;
    }


    public String getReservasStr() {
        StringBuilder reservas = new StringBuilder();
        for (Reserva r : reservasRealizadas) {
            reservas.append(r.getHabitacion().getNumeroHabitacion()).append(" ");
        }
        return reservas.toString();
    }

    public boolean addReserva(Reserva r) {
        for (Reserva r2 : reservasRealizadas) {
            if (r2.equals(r)) {
                return false;
            }
        }
        return reservasRealizadas.add(r);
    }

    public boolean removeReserva(String numeroHabitacion) {
        return reservasRealizadas.removeIf(r -> r.getHabitacion().getNumeroHabitacion().equals(numeroHabitacion));
    }
}
