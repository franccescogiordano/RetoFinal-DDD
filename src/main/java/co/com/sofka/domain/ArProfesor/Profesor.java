package co.com.sofka.domain.ArProfesor;

import co.com.sofka.domain.ArAlumno.Alumno;
import co.com.sofka.domain.generic.*;
import java.util.*;
public class Profesor extends AggregateRoot<ProfesorID> {
    protected NombreCompleto nombreCompleto;
    protected Direccion direccion;
    protected Set<Alumno> alumnos;
    protected Set<Clase> clases;
    protected Set<Examen> examen;
    protected Set<Orientacion> orientaciones;




    public Profesor(ProfesorID entityId) {
        super(entityId);
        subscribe(new ProfesorEventChange(this));
    }

    public static Profesor from(ProfesorID profesorId, List<DomainEvent> eventList){
        Profesor profesor = new Profesor(profesorId);
        eventList.forEach(profesor::applyEvent);

        return pedido;
    }

    public Set<Alumno> alumnos() {
        return alumnos;
    }

}
