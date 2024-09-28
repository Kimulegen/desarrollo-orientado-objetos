import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final ArrayList<Cliente> clientes = new ArrayList<>();
    private static final Hotel hotel = new Hotel("0", "Budapest");


    public static void main(String[] args) {
        hotel.seedHabitaciones();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Menú");
            System.out.println("-".repeat(30));
            System.out.println("1) Registrar cliente\n2) Ingresar\n3) Salir");
            int op = in.nextInt();

            switch (op) {
                case 1 -> registrarCliente();
                case 2 -> {
                    in.nextLine();
                    System.out.print("Ingrese su id: ");
                    String id = in.nextLine();
                    Cliente activeClient = verifyCliente(id);

                    if (activeClient == null) {
                        System.out.println("Cliente no encontrado");
                        break;
                    }

                    client_menu:
                    while (true) {
                        System.out.println("Menú Cliente");
                        System.out.println("-".repeat(30));
                        System.out.println("1) Reservar Habitación\n2) Ver reservas\n3) Cancelar una reserva\n4) Salir");
                        int op2 = in.nextInt();
                        switch (op2) {
                            case 1 -> {
                                in.nextLine();
                                System.out.println("Habitaciones disponibles:");
                                System.out.println(hotel.getHabitacionesDisponiblesStr());
                                System.out.println("Ingrese número de la habitación a reservar");
                                String numero = in.nextLine();
                                Habitacion h = hotel.getHabitacion(numero);
                                if (h.isDisponible()) {
                                    h.setDisponible(false);
                                    Reserva reserva = new Reserva(hotel, h);
                                    activeClient.addReserva(reserva);
                                    System.out.println("Habitación reservada con éxito");
                                } else {
                                    System.out.println("No se pudo reservar la habitación");
                                }
                            }
                            case 2 -> {
                                String reservas = activeClient.getReservasStr();
                                System.out.println(reservas.isEmpty() ? "No hay reservas" : reservas);
                            }
                            case 3 -> {
                                in.nextLine();
                                System.out.println("Ingresa el número de la habitación que desea cancelar");
                                String numero = in.nextLine();

                                if (activeClient.removeReserva(numero)) {
                                    hotel.getHabitacion(numero).setDisponible(true);
                                    System.out.println("Reserva cancelada con éxito");
                                } else {
                                    System.out.println("No se pudo cancelar la reserva");
                                }
                            }
                            case 4 -> {
                                break client_menu;
                            }
                        }
                        System.out.println();
                    }
                }
                case 3 -> {
                    in.close();
                    System.out.println("Adiós");
                    System.exit(0);
                }
            }
            System.out.println();
        }
    }

    private static void registrarCliente() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el id del cliente: ");
        String id = in.nextLine();
        if (isRegistered(id)) {
            System.out.println("El cliente ya existe");
        } else {
            System.out.print("Ingrese el nombre del cliente: ");
            String nombre = in.nextLine();

            Cliente cliente = new Cliente(id, nombre);
            System.out.println("Cliente registrado");
            clientes.add(cliente);
        }
    }

    private static boolean isRegistered(String id) {
        for (Cliente cliente : clientes) {
            if (id.equals(cliente.getIdCliente())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    private static Cliente verifyCliente(String id) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente().equals(id)) {
                return cliente;
            }
        }
        return null;
    }
}