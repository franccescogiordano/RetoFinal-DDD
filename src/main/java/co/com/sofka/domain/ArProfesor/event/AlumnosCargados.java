package co.com.sofka.domain.ArProfesor.event;
import co.com.sofka.domain.generics.AlumnoID;
import co.com.sofka.domain.generic.DomainEvent;
import java.util.*;
public class AlumnosCargados extends DomainEvent {
 private final Set<AlumnoID> alumno;


    public AlumnosCargados(Set<AlumnoID> alumno) {
        super("arprofesor.event.alumnoscargados");
        this.alumno=alumno;
        }

    public Set<AlumnoID> getAlumno() {
        return alumno;
    }
}
