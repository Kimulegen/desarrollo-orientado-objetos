import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Lugar espacioRiesco = new Lugar("0", "Espacio Riesco");
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Menú Lugar");
            System.out.println("-".repeat(30));
            System.out.println("1) Agregar evento\n2) Listar eventos\n3) Eliminar evento\n4) Ingresar a menú evento\n5) Salir");
            //
            int opLugar = in.nextInt();
            switch (opLugar) {
                case 1 -> {
                    in.nextLine();
                    LocalDate fechaEvento;

                    System.out.print("Ingrese el ID del evento: ");
                    String idEvento = in.nextLine();
                    if (espacioRiesco.existeEvento(idEvento)) {
                        System.out.println("Ya existe un evento con ese ID");
                        break;
                    }

                    System.out.print("Ingrese el nombre del evento: ");
                    String nombreEvento = in.nextLine();
                    System.out.print("Ingrese la fecha del evento (YYYY-MM-DD): ");

                    do {
                        try {
                            fechaEvento = LocalDate.parse(in.nextLine());
                            break;
                        } catch (DateTimeParseException e) {
                            System.out.println("Error al ingresar la fecha del evento," +
                                    "favor ingresar en formato (YYYY-MM-DD)");
                        }
                    } while (true);

                    // create evento
                    espacioRiesco.agregarEvento(new Evento(idEvento, nombreEvento, fechaEvento));
                    System.out.println("Evento agregado exitosamente");
                }
                case 2 ->
                        System.out.println(espacioRiesco.verEventos());
                case 3 -> {
                    in.nextLine();

                    System.out.print("Ingrese el ID del evento a eliminar: ");
                    String idEvento = in.nextLine();
                    Evento eventoAEliminar = espacioRiesco.getEvento(idEvento);

                    if (eventoAEliminar == null) {
                        System.out.println("No existe el evento con el ID " + idEvento);
                    } else {
                        espacioRiesco.eliminarEvento(eventoAEliminar);
                        System.out.println("Evento eliminado con éxito");
                    }
                }
                case 4 -> {
                    in.nextLine();

                    System.out.print("Ingrese el ID del evento: ");
                    String idEvento = in.nextLine();
                    Evento activeEvent = espacioRiesco.getEvento(idEvento);
                    if (activeEvent == null) {
                        System.out.println("No existe el evento con esa ID");
                        break;
                    }
                    menu_evento:
                    while (true) {
                        System.out.printf("Menú evento (%s)\n", activeEvent.getNombre());
                        System.out.println("-".repeat(30));
                        System.out.println("1) Registrar cliente\n2) Listar clientes\n3) Eliminar cliente\n4) Ingresar al menú cliente\n5) Salir ");
                        //
                        int opEvento = in.nextInt();
                        switch (opEvento) {
                            case 1 -> {
                                in.nextLine();
                                System.out.print("Ingrese el ID del cliente: ");
                                String idCliente = in.nextLine();

                                boolean existeCliente = false;
                                for (Cliente cliente : activeEvent.getClientes()) {
                                    if (cliente.getId().equals(idCliente)) {
                                        existeCliente = true;
                                        break;
                                    }
                                }
                                if (existeCliente) {
                                    System.out.println("Ya existe un cliente con ese ID");
                                    break;
                                }

                                System.out.print("Ingrese el nombre del cliente: ");
                                String nombreCliente = in.nextLine();

                                // create cliente
                                activeEvent.agregarCliente(new Cliente(idCliente, nombreCliente));
                                System.out.println("Cliente registrado con éxito");
                            }
                            case 2 -> {
                                System.out.println(activeEvent.verClientes());
                            }
                            case 3 -> {
                                in.nextLine();
                                System.out.print("Ingrese el ID del cliente: ");
                                String idCliente = in.nextLine();

                                if (activeEvent.getClientes().removeIf(c -> c.getId().equals(idCliente))) {
                                    System.out.println("Cliente eliminado");
                                } else {
                                    System.out.println("No existe el cliente con el ID " + idCliente);
                                }
                            }
                            case 4 -> {
                                in.nextLine();
                                System.out.print("Ingrese el ID del cliente: ");
                                String idCliente = in.nextLine();
                                Cliente activeClient = null;

                                for (Cliente cliente : activeEvent.getClientes()) {
                                    if (cliente.getId().equals(idCliente)) {
                                        activeClient = cliente;
                                        break;
                                    }
                                }

                                if (activeClient == null) {
                                    System.out.println("No existe cliente con esa ID");
                                    break;
                                }
                                menu_cliente:
                                while (true) {
                                    System.out.printf("Menú Cliente %s\n", activeClient.getNombre());
                                    System.out.println("-".repeat(30));
                                    System.out.println("1) Agregar reserva\n2) Ver reservas\n3) Eliminar reserva\n4) Salir");
                                    //
                                    int opCliente = in.nextInt();
                                    in.nextLine();

                                    switch (opCliente) {
                                        case 1 -> {
                                            System.out.print("Ingrese el asiento a reservar: ");
                                            String asiento = in.nextLine();

                                            if (activeEvent.existeReserva(asiento)) {
                                                System.out.println("Error al reservar asiento, reserva ya existe");
                                            } else {
                                                Reserva reserva = new Reserva(activeEvent, asiento);
                                                activeEvent.agregarReserva(reserva);
                                                activeClient.agregarReserva(reserva);
                                                System.out.println("Reserva añadida con éxito");
                                            }
                                        }
                                        case 2 -> System.out.println(activeClient.verReservas());
                                        case 3 -> {
                                            System.out.print("Ingrese el asiento a eliminar: ");
                                            String asiento = in.nextLine();

                                            Reserva reserva = activeEvent.getReserva(asiento);
                                            if (reserva != null) {
                                                activeEvent.eliminarReserva(reserva);
                                                activeClient.eliminarReserva(reserva);
                                                System.out.println("Reserva eliminada con éxito");
                                            } else {
                                                System.out.println("No existe una reserva con ese asiento");
                                            }
                                        }
                                        case 4 -> {
                                            System.out.println("Saliendo del Menú Cliente.");
                                            break menu_cliente;
                                        }
                                        default -> System.out.println("Opción inválida, intente de nuevo.");
                                    }
                                }
                            }
                            case 5 -> {
                                break menu_evento;
                            }
                            default -> System.out.println("Opción inválida, intente de nuevo.");
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Adiós");
                    in.close();
                    System.exit(0);
                }
                default -> System.out.println("Opción inválida, intente de nuevo.");

            }
            System.out.println();
        }

    }
}