package co.com.sofka.domain.ArAlumno.values;

import co.com.sofka.domain.generic.ValueObject;

public class NombreCurso implements ValueObject<String> {

    private final String nombreCurso;

    public NombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;

    }

    @Override
    public String value() {
        return nombreCurso;
    }
}