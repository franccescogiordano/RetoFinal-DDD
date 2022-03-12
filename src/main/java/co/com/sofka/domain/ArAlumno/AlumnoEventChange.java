package co.com.sofka.domain.ArAlumno;

import co.com.sofka.domain.ArAlumno.event.AlumnoCreado;
import co.com.sofka.domain.generic.EventChange;

public class AlumnoEventChange extends EventChange {
    public AlumnoEventChange(Alumno alumno) {

        apply((AlumnoCreado event) -> {
            //Agregar reglas de dominio
            alumno.direccion = event.getDireccion();
            alumno.nombreCompleto = event.getNombreCompleto();
        });


    }
}

