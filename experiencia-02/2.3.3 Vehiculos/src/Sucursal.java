import java.util.ArrayList;

public class Sucursal {
    private String idSucursal;
    private String nombre;
    private ArrayList<Vehiculo> vehiculosdisponibles;

    public Sucursal(String idSucursal, String nombre, ArrayList<Vehiculo> vehiculosdisponibles) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
        this.vehiculosdisponibles = vehiculosdisponibles;
    }

    public Sucursal(String idSucursal, String nombre) {
        this.idSucursal = idSucursal;
        this.nombre = nombre;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculosdisponibles.add(vehiculo);
    }

    public double calcularCostoTotalAlquiler(){
        double total = 0;
        for (Vehiculo vehiculo : vehiculosdisponibles) {
            total += vehiculo.calcularCostoAlquiler();
        }
        return total;
    }
}
