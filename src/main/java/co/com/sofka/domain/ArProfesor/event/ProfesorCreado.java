package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.ArProfesor.Clase;
import co.com.sofka.domain.ArProfesor.Examen;
import co.com.sofka.domain.generic.*;

import java.util.Set;

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
