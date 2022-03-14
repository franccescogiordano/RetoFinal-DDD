package co.com.sofka.domain.ArAlumno.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.AlumnoID;
import co.com.sofka.domain.generics.Direccion;
import co.com.sofka.domain.generics.NombreCompleto;

public class CrearAlumno extends Command {
    private final NombreCompleto nombreCompleto;
    private final Direccion direccion;
    private final AlumnoID alumnoID;

    public CrearAlumno(NombreCompleto nombreCompleto, Direccion direccion, AlumnoID alumnoID) {
        this.nombreCompleto=nombreCompleto;
        this.direccion=direccion;


        this.alumnoID = alumnoID;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public Direccion getDireccion() {
        return direccion;
    }


    public AlumnoID getAlumnoID() {
        return alumnoID;
    }
}
