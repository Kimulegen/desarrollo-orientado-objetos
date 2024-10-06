import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>(2);
        vehiculos.add(new VehiculoEstandar("001", "kiaMorning", 5000000));
        vehiculos.add(new VehiculoDeLujo("002", "porsche911", 150000000));

        Sucursal sucursal = new Sucursal("001", "sucursal", vehiculos);
        sucursal.agregarVehiculo(new VehiculoEstandar("003", "toyotaCorolla", 15000000));

        System.out.println(sucursal.calcularCostoTotalAlquiler());
    }
}