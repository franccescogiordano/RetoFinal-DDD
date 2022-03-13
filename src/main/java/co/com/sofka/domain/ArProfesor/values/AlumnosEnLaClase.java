package co.com.sofka.domain.ArProfesor.values;

import co.com.sofka.domain.generics.AlumnoID;
import co.com.sofka.domain.generics.ClaseID;
import co.com.sofka.domain.generic.ValueObject;
import java.util.*;
public class AlumnosEnLaClase implements ValueObject<Set<AlumnoID>> {

    private final Set<AlumnoID> alumnoIDSet;
    private final ClaseID claseid;
    public AlumnosEnLaClase(Set<AlumnoID> alumnoIDSet, ClaseID claseid) {
        this.alumnoIDSet = alumnoIDSet;
        this.claseid=claseid;

    }

    @Override
    public Set<AlumnoID> value() {
        return alumnoIDSet;
    }
}
