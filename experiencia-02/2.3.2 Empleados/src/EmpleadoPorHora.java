public class EmpleadoPorHora extends Empleado implements BonusCalculable{
    public EmpleadoPorHora(String idEmpleado, String nombre, double sueldoBase){
        super(idEmpleado, nombre, sueldoBase);
    }

    public double calcularBonus(){
        return 100.0;
    }
}
