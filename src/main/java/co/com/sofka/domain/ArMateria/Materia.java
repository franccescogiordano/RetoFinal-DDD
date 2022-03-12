package co.com.sofka.domain.ArMateria;
import co.com.sofka.domain.ArAlumno.values.Tipo;
import co.com.sofka.domain.ArMateria.events.MateriaCreada;
import co.com.sofka.domain.ArMateria.values.NombreMateria;
import co.com.sofka.domain.generic.*;
import java.util.*;

public class Materia extends AggregateEvent<MateriaID> {
    protected NombreMateria nombreMateria;
    protected Orientacion orientacion;
    protected Tipo tipo;
    protected Set<AlumnoID> alumnoIDs;
    protected Set<ProfesorID> profesorIDs;
    protected Set<Horario> horarios;

    public Materia(MateriaID entityId, NombreMateria nombreMateria, Tipo tipo) {
        super(entityId);
        appendChange(new MateriaCreada(nombreMateria,tipo)).apply();
        subscribe(new MateriaEventChange(this));

    }



    private Materia(MateriaID materiaID){
        super(materiaID);
        subscribe(new MateriaEventChange(this));
    }


    public static Materia from(MateriaID materiaID, NombreMateria nombreMateria, Tipo tipo, List<DomainEvent> eventList){
        Materia materia = new Materia(materiaID,nombreMateria,tipo);
        eventList.forEach(materia::applyEvent);

        return materia;
    }


    public Set<ProfesorID> profesorIDs() {
        return profesorIDs;
    }

    public Set<AlumnoID> alumnoIDs() {
        return alumnoIDs;
    }

    public Set<Horario> horarios() {
        return horarios;
    }

    public Orientacion orientacion() {
        return orientacion;
    }
}
