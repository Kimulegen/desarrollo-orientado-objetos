import java.util.ArrayList;

public class Producto {
    private String id;
    private String name;
    private double price;
    private static final ArrayList<String> ids = new ArrayList<>(10);

    private static boolean isUsed(String id){
        for(String i: ids){
            if(i.equals(id)) return true;
        }
        return false;
    }

    public Producto() {}

    public Producto(String id, String name, double price) throws Exception {
        if (isUsed(id)) throw new Exception("El producto " + id + " ya existe");
        ids.add(id);
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        if(isUsed(id)) throw new Exception("El producto " + id + " ya existe");
        ids.add(id);
        this.id = id;
    }


}
