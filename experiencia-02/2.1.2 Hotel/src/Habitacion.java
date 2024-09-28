public class Habitacion {
    private final String numeroHabitacion;
    private double precioNoche;
    private boolean disponible;

    public Habitacion(boolean disponible, double precioNoche, String numeroHabitacion) {
        this.disponible = disponible;
        this.precioNoche = precioNoche;
        this.numeroHabitacion = numeroHabitacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    // END GETTERS AND SETTERS
}
