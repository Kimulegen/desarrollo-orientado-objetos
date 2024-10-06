import java.util.ArrayList;

public class Departamento {
    private String idDepartamento;
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Departamento(String idDepartamento, String nombre, ArrayList<Empleado> empleados) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public Departamento(String nombre, String idDepartamento) {
        this.nombre = nombre;
        this.idDepartamento = idDepartamento;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public double calcularCostoTotalSalarios(){
        double salario = 0;
        for(Empleado empleado : empleados){
            salario += empleado.calcularSalario();
        }
        return salario;
    }
}
