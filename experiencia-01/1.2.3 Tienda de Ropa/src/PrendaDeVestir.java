public class PrendaDeVestir {
    private String codigo;
    private String nombre;
    private String marca;
    private String categoria;
    private boolean isDisponible;

    public PrendaDeVestir(String codigo, String nombre, String marca, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.isDisponible = true;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean disponible) {
        this.isDisponible = disponible;
    }

    // END GETTERS AND SETTERS

    public void vender(Cliente cliente){
        this.isDisponible = false;
        StringBuilder prendasAdquiridas = new StringBuilder();
        prendasAdquiridas.append(cliente.getPrendasAdquiridas()).append(" ").append(this.nombre);
        cliente.setPrendasAdquiridas(prendasAdquiridas.toString());
    }

    public void reponerInventario(){
        this.isDisponible = true;
    }
}
