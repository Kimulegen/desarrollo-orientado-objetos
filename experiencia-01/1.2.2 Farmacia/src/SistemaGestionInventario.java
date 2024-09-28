public class SistemaGestionInventario {
    private String medicamentoActual;
    private String clienteActual;
    private String proveedorActual;

    public SistemaGestionInventario(String medicamentoActual, String clienteActual, String proveedorActual) {
        this.medicamentoActual = medicamentoActual;
        this.clienteActual = clienteActual;
        this.proveedorActual = proveedorActual;
    }

    public String getMedicamentoActual() {
        return medicamentoActual;
    }

    public void setMedicamentoActual(String medicamentoActual) {
        this.medicamentoActual = medicamentoActual;
    }

    public String getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(String clienteActual) {
        this.clienteActual = clienteActual;
    }

    public String getProveedorActual() {
        return proveedorActual;
    }

    public void setProveedorActual(String proveedorActual) {
        this.proveedorActual = proveedorActual;
    }

    // END GETTERS AND SETTERS

    public void registrarMedicamento(Medicamento medicamento) {
        this.medicamentoActual = medicamento.getNombre();
    }

    public void registrarCliente(Cliente cliente) {
        this.clienteActual = cliente.getNombre();
    }

    public void generarInformeVentas (){
        StringBuilder informeVentas = new StringBuilder();
        informeVentas.append("Proveedor Actual: " + this.proveedorActual).append("\n");
        informeVentas.append("Medicamento Actual: " + this.medicamentoActual).append("\n");
        informeVentas.append("Cliente Actual: " + this.clienteActual).append("\n");

        System.out.println(informeVentas.toString());

    }
}
