public class Reserva {
    private Evento evento;
    private String asientoReservado;

    public Reserva(Evento evento, String asientoReservado) {
        this.evento = evento;
        this.asientoReservado = asientoReservado;
    }

    public String getAsientoReservado() {
        return asientoReservado;
    }
}
