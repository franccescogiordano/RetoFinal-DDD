package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.generic.*;
import co.com.sofka.domain.generics.Direccion;
import co.com.sofka.domain.generics.NombreCompleto;

public class ProfesorCreado extends DomainEvent {
    private final NombreCompleto nombreCompleto;
    private final Direccion direccion;


    public ProfesorCreado(NombreCompleto nombreCompleto, Direccion direccion) {
        super("profesor.profesorcreado");
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public Direccion getDireccion() {
        return direccion;
    }


}
