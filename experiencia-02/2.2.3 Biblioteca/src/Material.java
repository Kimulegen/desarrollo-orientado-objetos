public class Material {
    private String idMaterial;
    private String titulo;
private boolean disponibilidad;

    public Material(String idMaterial, String titulo) {
        this.idMaterial = idMaterial;
        this.titulo = titulo;
        this.disponibilidad = true;
    }

    public boolean verificarDisponibilidad(){
        return this.disponibilidad;
    }
}
