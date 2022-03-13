package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.ArProfesor.values.AlumnosEnLaClase;

public class CargarAlumnosClase {
    private final AlumnosEnLaClase alumnosEnLaClase;


    public CargarAlumnosClase(AlumnosEnLaClase alumnosEnLaClase) {
        this.alumnosEnLaClase = alumnosEnLaClase;
    }

    public AlumnosEnLaClase getAlumnosEnLaClase() {
        return alumnosEnLaClase;
    }
}
