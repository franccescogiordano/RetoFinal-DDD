package co.com.sofka.domain.ArProfesor;

import co.com.sofka.domain.ArProfesor.event.ProfesorCreado;
import co.com.sofka.domain.generic.*;
import co.com.sofka.domain.generics.*;

import java.util.*;
public class Profesor extends AggregateEvent<ProfesorID> {
    protected NombreCompleto nombreCompleto;
    protected Direccion direccion;
    protected Set<AlumnoID> alumnos;
    protected Set<Clase> clases;
    protected Set<Examen> examenes;
    protected Set<Orientacion> orientaciones;




    public Profesor(ProfesorID entityId,NombreCompleto nombreCompleto,Direccion direccion) {
        super(entityId);
        appendChange(new ProfesorCreado(nombreCompleto,direccion)).apply();
        subscribe(new ProfesorEventChange(this));
    }

    public static Profesor from(ProfesorID profesorId,NombreCompleto nombreCompleto,Direccion direccion, List<DomainEvent> eventList){
        Profesor profesor = new Profesor(profesorId,nombreCompleto,direccion);
        eventList.forEach(profesor::applyEvent);

        return profesor;
    }

    public Set<AlumnoID> alumnos() {
        return alumnos;
    }

}
