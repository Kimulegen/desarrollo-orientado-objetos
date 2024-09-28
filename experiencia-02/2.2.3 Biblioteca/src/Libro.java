public class Libro extends Material{
    private String autor;
    private String genero;
    private String resumen;

    public Libro(String idMaterial, String titulo, String autor, String genero) {
        super(idMaterial, titulo);
        this.autor = autor;
        this.genero = genero;
    }

    public String obtenerResumen(){
        return resumen;
    }
}
