package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.AlumnoID;
import co.com.sofka.domain.generics.ProfesorID;

import java.util.Set;

public class CargarAlumnos extends Command {
    private final Set<AlumnoID> alumno;
    private final ProfesorID profesorID;

    public ProfesorID getProfesorID() {
        return profesorID;
    }

    public CargarAlumnos(Set<AlumnoID> alumno, ProfesorID profesorID) {
        this.alumno=alumno;
        this.profesorID = profesorID;
    }

    public Set<AlumnoID> getAlumno() {
        return alumno;
    }
}
