public class Pasajero {
    private String rut;
    private String nombre;
    private Reserva reserva[];
    private double puntosAcumulados;

    public Pasajero() {
    }

    public Pasajero(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Reserva[] getReserva() {
        return reserva;
    }

    public void setReserva(Reserva[] reserva) {
        this.reserva = reserva;
    }

    public double getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(double puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }
}
