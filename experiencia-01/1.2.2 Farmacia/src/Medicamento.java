public class Medicamento {
    private String codigo;
    private String nombre;
    private String tipo;
    private int stock;
    private LocalDate caducidad;

    public Medicamento(String codigo, String nombre, String tipo, int stock, LocalDate caducidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.stock = stock;
        this.caducidad = caducidad;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    // END GETTERS AND SETTERS

    public void vender(Cliente cliente){
        cliente.setMedicamentoAdquirido(this.nombre);
    }
}
