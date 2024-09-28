public class Reserva {
    private String asiento;
    private Vuelo vuelo;

    public Reserva(String asiento, Vuelo vuelo) {
        this.asiento = asiento;
        this.vuelo = vuelo;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
}
