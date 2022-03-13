package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.ArProfesor.values.AlumnosEnLaClase;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.ClaseID;
//TODO Meter en el eventchange

public class AlumnosCargadosDeLaClase extends DomainEvent {
    private final AlumnosEnLaClase alumnosEnLaClase;
    private final ClaseID claseid;
     public AlumnosCargadosDeLaClase(AlumnosEnLaClase alumnosEnLaClase, ClaseID claseid){
         super("arprofesor.event.alumnoscargadosdelaclase");
         this.alumnosEnLaClase=alumnosEnLaClase;
         this.claseid = claseid;
     }

    public AlumnosEnLaClase getAlumnosEnLaClase() {
        return alumnosEnLaClase;
    }

    public ClaseID getClaseid() {
        return claseid;
    }
}
