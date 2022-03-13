package co.com.sofka.domain.generics;

import co.com.sofka.domain.ArProfesor.values.ExamenID;
import co.com.sofka.domain.generic.ValueObject;

public class Calificacion implements ValueObject<String> {

    private final String calificacion;
    private final ExamenID examenid;
    private final ProfesorID profesorID;

    public Calificacion(String calificacion,  ExamenID examenid,ProfesorID profesorID) {
        this.calificacion=calificacion;
        this.examenid = examenid;
        this.profesorID = profesorID;
    }

    @Override
    public String value() {
        return calificacion;
    }
}
