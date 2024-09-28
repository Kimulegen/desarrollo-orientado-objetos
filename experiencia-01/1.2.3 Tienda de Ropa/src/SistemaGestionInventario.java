public class SistemaGestionInventario {
    private String catalogoPrendas;
    private String clientesRegistrados;
    private String proveedoresActivos;

    public SistemaGestionInventario() {
    }

    public String getCatalogoPrendas() {
        return catalogoPrendas;
    }

    public void setCatalogoPrendas(String catalogoPrendas) {
        this.catalogoPrendas = catalogoPrendas;
    }

    public String getClientesRegistrados() {
        return clientesRegistrados;
    }

    public void setClientesRegistrados(String clientesRegistrados) {
        this.clientesRegistrados = clientesRegistrados;
    }

    public String getProveedoresActivos() {
        return proveedoresActivos;
    }

    public void setProveedoresActivos(String proveedoresActivos) {
        this.proveedoresActivos = proveedoresActivos;
    }

    // END GETTERS AND SETTERS

    public void registrarPrenda(PrendaDeVestir prenda) {
        StringBuilder prendas = new StringBuilder();
        prendas
                .append(catalogoPrendas)
                .append(" ")
                .append(prenda.getNombre());

        this.catalogoPrendas = prendas.toString();
    }

    public void registrarCliente(Cliente cliente) {
        StringBuilder clientes = new StringBuilder();
        prendas
                .append(clientesRegistrados)
                .append(" ")
                .append(cliente.getNombre());

        this.clientesRegistrados = clientes.toString();
    }

    public boolean verificarDisponibilidad(PrendaDeVestir prenda) {
        return prenda.isDisponible();
    }

    public String generarInformeVentas(){
        StringBuilder informeVentas = new StringBuilder();
        informeVentas
                .append("Prendas: ")
                .append(catalogoPrendas)
                .append("\n")
                .append("Clientes: ")
                .append(clientesRegistrados)
                .append("\n")
                .append("Proveedores: ")
                .append(proveedoresActivos);

        return informeVentas.toString(); 
    }
}
