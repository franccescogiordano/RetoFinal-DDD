package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.ArProfesor.values.CantidadAlumnos;
import co.com.sofka.domain.generic.DomainEvent;
//TODO Meter en el eventchange
public class AlumnosContabilizadosDeLaClase extends DomainEvent {
    private final CantidadAlumnos cantidadAlumnos;

    public AlumnosContabilizadosDeLaClase(CantidadAlumnos cantidadAlumnos){
        super("arprofesor.event.alumnoscontabilizadosdelaclase");
        this.cantidadAlumnos=cantidadAlumnos;
    }

    public CantidadAlumnos getCantidadAlumnos() {
        return cantidadAlumnos;
    }
}
