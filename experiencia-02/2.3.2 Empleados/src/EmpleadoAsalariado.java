public class EmpleadoAsalariado extends Empleado implements BonusCalculable{
    public EmpleadoAsalariado(String idEmpleado, String nombre, double sueldoBase){
        super(idEmpleado, nombre, sueldoBase);
    }

    public double calcularBonus(){
        return 100.0;
    }
}
