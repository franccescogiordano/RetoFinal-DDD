package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.ArProfesor.values.AlumnosEnLaClase;
import co.com.sofka.domain.generic.DomainEvent;
//TODO Meter en el eventchange

public class AlumnosCargadosDeLaClase extends DomainEvent {
    private final AlumnosEnLaClase alumnosEnLaClase;
     public AlumnosCargadosDeLaClase(AlumnosEnLaClase alumnosEnLaClase){
         super("arprofesor.event.alumnoscargadosdelaclase");
         this.alumnosEnLaClase=alumnosEnLaClase;
     }

    public AlumnosEnLaClase getAlumnosEnLaClase() {
        return alumnosEnLaClase;
    }
}
