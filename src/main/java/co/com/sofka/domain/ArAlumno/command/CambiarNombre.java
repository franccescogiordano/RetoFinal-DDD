package co.com.sofka.domain.ArAlumno.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.AlumnoID;
import co.com.sofka.domain.generics.NombreCompleto;
import co.com.sofka.domain.generics.ProfesorID;

public class CambiarNombre extends Command {
    private final NombreCompleto nombre;
    private  final AlumnoID alumnoID;
    public CambiarNombre(NombreCompleto nombre, AlumnoID alumnoID) {
        this.nombre = nombre;
        this.alumnoID = alumnoID;
    }

    public NombreCompleto getNombre() {
        return nombre;
    }

    public AlumnoID getAlumnoID() {
        return alumnoID;
    }
}
