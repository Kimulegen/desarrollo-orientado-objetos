public class Cliente {
    private String numeroCliente;
    private String nombre;
    private String medicamentoAdquirido;

    public Cliente(String numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedicamentoAdquirido() {
        return medicamentoAdquirido;
    }

    public void setMedicamentoAdquirido(String medicamentoAdquirido) {
        this.medicamentoAdquirido = medicamentoAdquirido;
    }

    // END GETTERS AND SETTERS
    public void realizarCompra(Medicamento medicamento) {
        this.medicamentoAdquirido = medicamento.getNombre();
    }

    public void devolverMedicamento() {
         this.medicamentoAdquirido = null;
    }

}
