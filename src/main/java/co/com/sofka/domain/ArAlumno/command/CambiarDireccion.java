package co.com.sofka.domain.ArAlumno.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.AlumnoID;
import co.com.sofka.domain.generics.Direccion;



public class CambiarDireccion extends Command {
    private final Direccion direccion;
    private final AlumnoID alumnoID;
    public CambiarDireccion(Direccion direccion, AlumnoID alumnoID) {

        this.direccion = direccion;
        this.alumnoID = alumnoID;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public AlumnoID getAlumnoID() {
        return alumnoID;
    }
}
