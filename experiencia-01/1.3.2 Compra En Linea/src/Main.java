import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final ArrayList<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            register_menu:
            while(true){
                System.out.println("Menú");
                System.out.println("-".repeat(30));
                System.out.println("1) Registrar Cliente\n2) Ingresar\n3) Salir");
                System.out.print("> ");
                int res = in.nextInt();

                switch (res){
                    case 1 -> {
                        RegisterClient();
                    }
                    case 2 -> {
                        // consumir salto de linea
                        in.nextLine();
                        // pedir nombre
                        System.out.println("Ingrese su nombre");
                        String name = in.nextLine();
                        Cliente activeClient = getCliente(name);

                        if (activeClient == null) {
                            System.out.println("Cliente no encontrado");
                        } else {
                            client_menu:
                            while(true){
                                System.out.println("Bienvenido, "+ activeClient.getNombre());
                                System.out.println("-".repeat(30));
                                System.out.println("1) Agregar Producto\n2) Ver Carrito\n3) Ver Total\n4) Salir");
                                System.out.print("> ");
                                res = in.nextInt();

                                switch (res){
                                    case 1 -> {
                                        System.out.println("Ingrese el ID del producto a agregar");
                                        // consumir linea
                                        in.nextLine();
                                        String pID = in.nextLine();
                                        System.out.println("Ingrese el nombre del producto a agregar");
                                        String pName = in.nextLine();
                                        System.out.println("Ingrese el precio del producto a agregar");
                                        double pPrice = in.nextDouble();

                                        // crear producto
                                        Producto producto = new Producto(pID, pName, pPrice);
                                        activeClient.getCarro().addProducto(producto);
                                        System.out.println("Producto agregado con éxito");
                                    }
                                    case 2 -> {
                                        activeClient.getCarro().showProductList();
                                    }
                                    case 3 -> {
                                        System.out.println("Su total es de " + activeClient.getCarro().getTotal());
                                    }
                                    case 4 -> {
                                        break client_menu;
                                    }
                                    default -> System.out.println("Opción inválida");
                                }
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("Adiós");
                        break register_menu;
                    }
                    default -> System.out.println("Opción inválida");
                }

//                buy_menu:
            }




        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void RegisterClient(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el ID del cliente");
        String id = in.nextLine();
        System.out.println("Ingrese el nombre del cliente");
        String name = in.nextLine();
        // crear cliente
        try {
            CarritoCompras carrito = new CarritoCompras();
            Cliente client = new Cliente(id, name, carrito);
            clientes.add(client);
            System.out.println("Cliente agregado con éxito");
        } catch (Exception e) {
            System.out.println("No se pudo registrar cliente");
        }
    }

    private static Cliente getCliente(String name){
        for(Cliente c : clientes){
            if (c.getNombre().equals(name)) {
                return c;
            }
        }
        return null;
    }
}