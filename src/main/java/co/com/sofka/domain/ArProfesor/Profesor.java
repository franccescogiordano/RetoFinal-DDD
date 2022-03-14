package co.com.sofka.domain.ArProfesor;

import co.com.sofka.domain.ArProfesor.event.*;
import co.com.sofka.domain.ArProfesor.values.AlumnosEnLaClase;
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
    }
    private Profesor(ProfesorID profesorID){
        super(profesorID);
        subscribe(new ProfesorEventChange(this));
    }
    public static Profesor from(ProfesorID profesorId, List<DomainEvent> eventList){
        Profesor profesor = new Profesor(profesorId);
        eventList.forEach(profesor::applyEvent);

        return profesor;
    }

    public Optional<Clase> getClasePorId(ClaseID entityid) {
        return clases().
                stream().
                filter(clase -> clase.identity().equals(entityid)).findFirst();
    }

    public Set<Clase> clases() {
        return clases;
    }

    public Set<AlumnoID> alumnos() {
        return alumnos;
    }

    public void CargarAlumnos(Set<AlumnoID> alumnos){
        appendChange(new AlumnosCargados(alumnos)).apply();
    }

    public void CargarExamenes(Set<Examen> examenes){
        appendChange(new ExamenesCargados(examenes)).apply();
    }

    public void CargarClases(Set<Clase> clases){
        appendChange(new ClasesCargadas(clases)).apply();
    }

    public void ActualizarNombre(NombreCompleto name){
        appendChange(new NombreCambiado(name)).apply();
    }

    public void ActualizarDireccion(Direccion dir){
        appendChange(new DireccionCambiada(dir)).apply();
    }

    public void ActualizarAlumnosEnClase(ClaseID id, AlumnosEnLaClase alumnosEnLaClase){
        appendChange(new AlumnosCargadosDeLaClase(alumnosEnLaClase,id)).apply();
    }


}
