package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.AlumnoID;

import java.util.Set;

public class CargarAlumnos extends Command {
    private final Set<AlumnoID> alumno;
    public CargarAlumnos(Set<AlumnoID> alumno) {
        this.alumno=alumno;
    }

    public Set<AlumnoID> getAlumno() {
        return alumno;
    }
}
