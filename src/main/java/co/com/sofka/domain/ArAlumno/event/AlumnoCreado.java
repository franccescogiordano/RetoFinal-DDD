package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.generic.*;

import java.util.Set;

public class AlumnoCreado extends DomainEvent {
    private final NombreCompleto nombreCompleto;
    private final Direccion direccion;


    public AlumnoCreado(NombreCompleto nombreCompleto,Direccion direccion) {
        super("alumno.alumnocreado");
        this.nombreCompleto=nombreCompleto;
        this.direccion=direccion;


    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public Direccion getDireccion() {
        return direccion;
    }


}