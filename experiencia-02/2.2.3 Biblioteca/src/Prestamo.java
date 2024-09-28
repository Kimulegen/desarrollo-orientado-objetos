import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Prestamo {
    private Material material;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Material material, LocalDate fechaDevolucion) {
        this.material = material;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = fechaDevolucion;
    }

    public double calcularMulta(){
        LocalDate hoy = LocalDate.now();
        if(hoy.isBefore(fechaDevolucion)){
            return 0;
        }
        long diasAtrasados = ChronoUnit.DAYS.between(fechaDevolucion, hoy);
        double MULTA_POR_DIA = 500;
        return diasAtrasados * MULTA_POR_DIA;
    }
}
