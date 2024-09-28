public class Cliente {
    private String numeroCliente;
    private String nombre;
    private String prendasAdquiridas;

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

    public String getPrendasAdquiridas() {
        return prendasAdquiridas;
    }

    public void setPrendasAdquiridas(String prendasAdquiridas) {
        this.prendasAdquiridas = prendasAdquiridas;
    }

    // END GETTERS AND SETTERS

    public void realizarCompra(PrendaDeVestir prendaDeVestir) {
        StringBuilder prendasAdquiridas = new StringBuilder();
        prendasAdquiridas.append(this.prendasAdquiridas).append(" ").append(prendaDeVestir.getNombre());
    }

    pubblic void devolverPrenda(PrendaDeVestir prendaDeVestir) {
        String nombrePrenda = prendaDeVestir.getNombre();
        int nombrePrendaLength = nombrePrenda.length();

        int prendaIndex = this.prendasAdquiridas.indexOf(nombrePrenda);

        StringBuilder newPrendasAdquiridas = new StringBuilder();
        newPrendasAdquiridas
                .append(this.prendasAdquiridas, 0, prendaIndex -1)
                .append(this.prendasAdquiridas.substring(prendaIndex + nombrePrendaLength));

        this.prendasAdquiridas = newPrendasAdquiridas.toString();
    }
}
