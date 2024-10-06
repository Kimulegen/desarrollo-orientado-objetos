import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>(2);
        empleados.add(new EmpleadoAsalariado("001", "Oscar", 100000));
        empleados.add(new EmpleadoPorHora("002", "Andres", 200000));

        Departamento it = new Departamento("001", "IT", empleados);
        it.agregarEmpleado(new EmpleadoAsalariado("003", "Francisco", 300000));
        System.out.println(it.calcularCostoTotalSalarios());
    }
}