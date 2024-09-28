import java.util.ArrayList;

public class Cliente {
    private String id;
    private String nombre;
    private CarritoCompras carro;
    private static final ArrayList<String> ids = new ArrayList<>(10);

    private static boolean isUsed(String id){
        for(String i: ids){
            if(i.equals(id)) return true;
        }
        return false;
    }

    public Cliente() {
    }

    public Cliente(String id, String nombre) throws Exception {
        if (isUsed(id)) throw new Exception("El cliente " + id + " ya existe");
        ids.add(id);
        this.nombre = nombre;
        this.id = id;
    }

    public Cliente(String id, String nombre, CarritoCompras carro) throws Exception {
        if (isUsed(id)) throw new Exception("El cliente " + id + " ya existe");
        ids.add(id);
        this.id = id;
        this.nombre = nombre;
        this.carro = carro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        if (isUsed(id)) throw new Exception("El cliente " + id + " ya existe");
        ids.add(id);
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CarritoCompras getCarro() {
        return carro;
    }

    public void setCarro(CarritoCompras carro) {
        this.carro = carro;
    }
}
