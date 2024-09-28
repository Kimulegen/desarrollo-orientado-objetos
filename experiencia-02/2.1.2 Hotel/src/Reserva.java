public class Reserva {
    private Habitacion habitacion;

    public Reserva(Hotel hotel, Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    // END GETTER AND SETTER
}
