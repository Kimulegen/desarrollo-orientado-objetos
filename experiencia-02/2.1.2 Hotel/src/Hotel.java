import java.util.ArrayList;

public class Hotel {
    private String idHotel;
    private String nombre;
    private int numeroPisos;
    private int nHabitacionesPiso;
    private final ArrayList<Habitacion> habitacionesDisponibles;

    public Hotel(String idHotel, String nombre) {
        this.idHotel = idHotel;
        this.nombre = nombre;
        this.habitacionesDisponibles = new ArrayList<>();
    }

    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Habitacion> getHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }

    public String getHabitacionesDisponiblesStr() {
        StringBuilder habitacionesDisponibles = new StringBuilder();
        for (int i = 0; i < numeroPisos; i++) {
            for (int j = 0; j < nHabitacionesPiso; j++) {
                Habitacion h = this.habitacionesDisponibles.get(i * nHabitacionesPiso + j);
                if (h.isDisponible()) {
                    habitacionesDisponibles.append(h.getNumeroHabitacion()).append(" ");
                } else {
                    habitacionesDisponibles.append("X").append(" ");
                }
            }
            habitacionesDisponibles.append("\n");
        }
        return habitacionesDisponibles.toString();
    }
    // END GETTERS AND SETTERS

    public Habitacion getHabitacion(String nHabitacion) {
        for (Habitacion habitacion : habitacionesDisponibles) {
            if (habitacion.getNumeroHabitacion().equals(nHabitacion)) {
                return habitacion;
            }
        }
        return null;
    }

    public boolean addHabitacionDisponible(Habitacion habitacion) {
        for (Habitacion h : this.habitacionesDisponibles) {
            if (h.equals(habitacion)) {
                return false;
            }
        }
        return this.habitacionesDisponibles.add(habitacion);
    }

    public void seedHabitaciones() {
        numeroPisos = (int) (Math.random() * 25 + 5);
        nHabitacionesPiso = (int) (Math.random() * 10 + 5);

        for (int i = 0; i < numeroPisos; i++) {
            for (int j = 0; j < nHabitacionesPiso; j++) {
                StringBuilder nHabitacion = new StringBuilder();
                int priceRange = (int) (Math.random() * 80 + 40);
                double precioNoche = 500 * priceRange;
                nHabitacion.append((i + 1)).append(String.format("%02d", j + 1));

                addHabitacionDisponible(new Habitacion(true, precioNoche, nHabitacion.toString()));
            }
        }
    }
}
