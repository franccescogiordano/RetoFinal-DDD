package co.com.sofka.domain.ArAlumno;

import co.com.sofka.domain.ArAlumno.event.AlumnoCreado;
import co.com.sofka.domain.ArAlumno.event.NombreCambiado;
import co.com.sofka.domain.ArAlumno.event.ProfesoresCargados;
import co.com.sofka.domain.ArProfesor.Profesor;
import co.com.sofka.domain.ArProfesor.event.DireccionCambiada;
import co.com.sofka.domain.generic.*;
import co.com.sofka.domain.generics.*;

import java.util.*;
public class Alumno extends AggregateEvent<AlumnoID> {
    protected NombreCompleto nombreCompleto;
    protected Direccion direccion;
    protected Set<ProfesorID> profesores;
    protected ClaseVO clase;
    protected Set<Curso> cursos;
    protected Orientacion orientacion;

    public Alumno(AlumnoID alumnoId,NombreCompleto nombreCompleto,Direccion direccion) {
        super(alumnoId);
        appendChange(new AlumnoCreado(nombreCompleto,direccion)).apply();

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

    public Set<Curso> cursos() {
        return cursos;
    }


    public void cambiarNombre(NombreCompleto nombre){
        appendChange(new NombreCambiado(nombre)).apply();
    }

    public void ActualizarDireccion(Direccion dir){
        appendChange(new DireccionCambiada(dir)).apply();
    }

    public void cargarProfesores(Set<ProfesorID> teachers){
        appendChange(new ProfesoresCargados(teachers)).apply();
    }
    
}
