package co.com.sofka.domain.ArAlumno;

import co.com.sofka.domain.ArAlumno.values.Promedio;
import co.com.sofka.domain.ArProfesor.values.ExamenID;
import co.com.sofka.domain.generic.NotaID;
import co.com.sofka.domain.generic.Calificacion;
import co.com.sofka.domain.generic.Entity;
import java.util.*;
public class Nota extends Entity<NotaID> {
    private final Set<Calificacion> calificaciones;
    private final Promedio promedio;
    private final ExamenID examenID;

    public Nota(NotaID entityId, Set<Calificacion> calificaciones, Promedio promedio, ExamenID examenID) {
        super(entityId);
        this.calificaciones = calificaciones;
        this.promedio = promedio;
        this.examenID = examenID;
    }

    public Set<Calificacion> calificaciones() {
        return calificaciones;
    }

    public Promedio promedio() {
        return promedio;
    }

    public ExamenID examenID() {
        return examenID;
    }
}
