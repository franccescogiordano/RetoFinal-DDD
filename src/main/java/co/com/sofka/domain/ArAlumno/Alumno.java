package co.com.sofka.domain.ArAlumno;

import co.com.sofka.domain.ArAlumno.event.AlumnoCreado;
import co.com.sofka.domain.generic.*;

import java.util.*;
public class Alumno extends AggregateEvent<AlumnoID> {
    protected NombreCompleto nombreCompleto;
    protected Direccion direccion;
    protected Set<ProfesorID> profesores;
    protected ClaseVO clase;
    protected  Orientacion orientacion;

    public Alumno(AlumnoID alumnoId,NombreCompleto nombreCompleto,Direccion direccion) {
        super(alumnoId);
        appendChange(new AlumnoCreado(nombreCompleto,direccion)).apply();
        subscribe(new AlumnoEventChange(this));

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



    public Set<ProfesorID> profesores() {
        return profesores;
    }

    public ClaseVO clase() {
        return clase;
    }

    public Orientacion orientacion() {
        return orientacion;
    }
}
