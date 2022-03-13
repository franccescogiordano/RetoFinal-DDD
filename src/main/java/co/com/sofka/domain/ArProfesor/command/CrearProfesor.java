package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.Direccion;
import co.com.sofka.domain.generics.NombreCompleto;
import co.com.sofka.domain.generics.ProfesorID;

public class CrearProfesor extends Command {
    private final NombreCompleto nombreCompleto;
    private final Direccion direccion;
    private final ProfesorID id;

    public CrearProfesor(NombreCompleto nombreCompleto, Direccion direccion, ProfesorID id) {

        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.id = id;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public ProfesorID getId() {
        return id;
    }
}
