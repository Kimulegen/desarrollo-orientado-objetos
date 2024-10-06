public class VehiculoEstandar extends Vehiculo implements CostoAlquilerCalculable{
    public VehiculoEstandar(String idVehiculo, String modelo, double costoBaseAlquiler) {
        super(idVehiculo, modelo, costoBaseAlquiler);
    }

    public double calcularCostoAlquiler() {
        return getCostoBaseAlquiler();
    }
}
