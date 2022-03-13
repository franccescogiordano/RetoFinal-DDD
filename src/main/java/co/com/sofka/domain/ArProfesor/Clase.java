package co.com.sofka.domain.ArProfesor;

import co.com.sofka.domain.ArProfesor.values.AlumnosEnLaClase;
import co.com.sofka.domain.ArProfesor.values.CantidadAlumnos;
import co.com.sofka.domain.ArProfesor.values.NombreClase;
import co.com.sofka.domain.ArProfesor.values.ProfesorACargo;
import co.com.sofka.domain.generics.ClaseID;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generics.Orientacion;

public class Clase extends Entity<ClaseID> {
    private final CantidadAlumnos cantidadAlumnos;
    private final ProfesorACargo profesorACargo;
    private final NombreClase nombreClase;
    private AlumnosEnLaClase alumnosEnLaClase;
    private final Orientacion orientacion;


    public Clase(ClaseID entityId, CantidadAlumnos cantidadAlumnos, ProfesorACargo profesorACargo, NombreClase nombreClase, AlumnosEnLaClase alumnosEnLaClase, Orientacion orientacion) {

        super(entityId);
        this.cantidadAlumnos = cantidadAlumnos;
        this.profesorACargo = profesorACargo;
        this.nombreClase = nombreClase;
        this.alumnosEnLaClase = alumnosEnLaClase;
        this.orientacion = orientacion;
    }

    public CantidadAlumnos getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public ProfesorACargo getProfesorACargo() {
        return profesorACargo;
    }

    public NombreClase getNombreClase() {
        return nombreClase;
    }

    public AlumnosEnLaClase getAlumnosEnLaClase() {
        return alumnosEnLaClase;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void actualizarAlumnosEnLaClase(AlumnosEnLaClase alumnosEnLaClase){
       this.alumnosEnLaClase=alumnosEnLaClase;
    }
}
