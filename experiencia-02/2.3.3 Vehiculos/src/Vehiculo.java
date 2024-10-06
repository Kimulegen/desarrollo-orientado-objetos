public class Vehiculo {
    private String idVehiculo;
    private String modelo;
    private double costoBaseAlquiler;

    public Vehiculo(String idVehiculo, String modelo, double costoBaseAlquiler) {
        this.idVehiculo = idVehiculo;
        this.modelo = modelo;
        this.costoBaseAlquiler = costoBaseAlquiler;
    }

    public double getCostoBaseAlquiler(){
        return costoBaseAlquiler;
    }

    public double calcularCostoAlquiler(){
        return costoBaseAlquiler;
    }
}
