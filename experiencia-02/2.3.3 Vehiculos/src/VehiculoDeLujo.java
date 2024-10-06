public class VehiculoDeLujo extends Vehiculo implements CostoAlquilerCalculable{
    public VehiculoDeLujo(String idVehiculo, String modelo, double costoBaseAlquiler){
        super(idVehiculo, modelo, costoBaseAlquiler);
    }

    public double calcularCostoAlquiler(){
        return getCostoBaseAlquiler();
    }
}
