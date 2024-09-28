import java.util.ArrayList;

public class Revista extends Material{
    private String editorial;
    private int numeroEdicion;
    private ArrayList<String> articulosDestacados;

    public Revista(String idMaterial, String titulo, String editorial, int numeroEdicion) {
        super(idMaterial, titulo);
        this.editorial = editorial;
        this.numeroEdicion = numeroEdicion;
        this.articulosDestacados = new ArrayList<String>();
    }

    public ArrayList<String> verArticulosDestacados(){
        return this.articulosDestacados;
    }
}
