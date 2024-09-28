public class Vuelo {
    private String idVuelo;
    private String origen;
    private String destino;
    private String[] asientosDisponibles;

    public Vuelo(String idVuelo, String origen, String destino, String[] asientosDisponibles) {
        this.idVuelo = idVuelo;
        this.origen = origen;
        this.destino = destino;
        this.asientosDisponibles = asientosDisponibles;
    }

    public String[] getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(String[] asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }
}
