package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.Direccion;
import co.com.sofka.domain.generics.ProfesorID;

public class CambiarDireccion extends Command {
    private final Direccion dir;
    private final ProfesorID profesorID;
    public CambiarDireccion(Direccion dir, ProfesorID profesorID) {
        this.dir = dir;
        this.profesorID = profesorID;
    }

    public Direccion getDir() {
        return dir;
    }

    public ProfesorID getProfesorID() {
        return profesorID;
    }
}
