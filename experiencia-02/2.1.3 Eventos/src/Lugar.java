import java.util.ArrayList;

public class Lugar {
    private String idLugar;
    private String nombre;
    private final ArrayList<Evento> eventos;

    public Lugar(String idLugar, String nombre) {
        this.idLugar = idLugar;
        this.nombre = nombre;
        eventos = new ArrayList<Evento>(1);
    }

    public Evento getEvento(String idEvento){
        for(Evento evento : eventos){
            if(evento.getId().equals(idEvento)){
                return evento;
            }
        }
        return null;
    }

    public String verEventos(){
        if(eventos.isEmpty()){
            return "No hay eventos";
        }
        StringBuilder eventosStr = new StringBuilder();
        eventosStr
                .append(String.format("%-9s", "ID evento"))
                .append(" ".repeat(5))
                .append(String.format("%-13s", "Nombre Evento"))
                .append(" ".repeat(5))
                .append(String.format("%-12s", "Fecha Evento"))
                .append(" ".repeat(5))
                .append(System.lineSeparator())
                .append("-".repeat(43))
                .append(System.lineSeparator());

        for (Evento evento : eventos){
            eventosStr
                    .append(String.format("%-9s",evento.getId()))
                    .append(" ".repeat(5))
                    .append(String.format("%-13s",evento.getNombre()))
                    .append(" ".repeat(5))
                    .append(String.format("%-12s",evento.getFecha().toString()))
                    .append(System.lineSeparator());
        }
        return eventosStr.toString();
    }

    public boolean agregarEvento(Evento evento) {
        for (Evento e: eventos){
            if (e.getId().equals(evento.getId())){
                return false;
            }
        }
        return eventos.add(evento);
    }

    public void eliminarEvento(Evento evento){
        eventos.remove(evento);
    }

    public boolean existeEvento(String idEvento){
        for (Evento evento : eventos){
            if(evento.getId().equals(idEvento)){
                return true;
            }
        }
        return false;
    }
}
