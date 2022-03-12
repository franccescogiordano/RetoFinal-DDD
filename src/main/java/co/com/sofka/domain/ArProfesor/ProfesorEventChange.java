package co.com.sofka.domain.ArProfesor;
import co.com.sofka.domain.ArProfesor.event.ProfesorCreado;
import co.com.sofka.domain.generic.EventChange;

public class ProfesorEventChange extends EventChange {
    public ProfesorEventChange(Profesor profesor) {

        apply((ProfesorCreado event) -> {
            //Agregar reglas de dominio
            profesor.direccion = event.getDireccion();
            profesor.nombreCompleto = event.getNombreCompleto();
        });


    }
}

