package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.ArProfesor.values.CantidadAlumnos;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.ProfesorID;

public class ContabilizarAlumnosClase extends Command {
    private final CantidadAlumnos cant;
    private final ProfesorID profesorID;

    public ProfesorID getProfesorID() {
        return profesorID;
    }
    public ContabilizarAlumnosClase(CantidadAlumnos cant, ProfesorID profesorID) {
        this.cant = cant;
        this.profesorID = profesorID;
    }

    public CantidadAlumnos getCant() {
        return cant;
    }
}
