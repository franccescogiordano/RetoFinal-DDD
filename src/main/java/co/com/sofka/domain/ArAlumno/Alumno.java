package co.com.sofka.domain.ArAlumno;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.AlumnoID;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.NombreCompleto;

import java.util.*;
public class Alumno extends AggregateEvent<AlumnoID> {
    protected NombreCompleto nombreCompleto;
   
    protected ClienteId clienteId;

    public Alumno(AlumnoID alumnoId, ClienteId clienteId) {
        super(alumnoId);
        subscribe(new AlumnoEventChange(this));
        appendChange(new AlumnoCreado(clienteId)).apply();
    }


    private Alumno(AlumnoID alumnoId){
        super(alumnoId);
        subscribe(new AlumnoEventChange(this));
    }


    public static Alumno from(AlumnoID alumnoId, List<DomainEvent> eventList){
        Alumno pedido = new Alumno(alumnoId);
        eventList.forEach(pedido::applyEvent);

        return pedido;
    }



    public Set<ProductoAlumno> productoAlumnos() {
        return productoAlumnos;
    }

    public Venta venta() {
        return venta;
    }
}
