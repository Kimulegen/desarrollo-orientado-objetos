public class ProveedorDeModa {
    private String codigoProveedor;
    private String nombre;
    private String prendasSuministradas;

    public ProveedorDeModa(String codigoProveedor, String nombre) {
        this.codigoProveedor = codigoProveedor;
        this.nombre = nombre;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrendasSuministradas() {
        return prendasSuministradas;
    }

    public void setPrendasSuministradas(String prendasSuministradas) {
        this.prendasSuministradas = prendasSuministradas;
    }

    // END GETTERS AND SETTERS
}
