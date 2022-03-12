package co.com.sofka.domain.ArProfesor;
import co.com.sofka.domain.ArProfesor.event.*;
import co.com.sofka.domain.generic.EventChange;

public class ProfesorEventChange extends EventChange {
    public ProfesorEventChange(Profesor profesor) {

        apply((ProfesorCreado event) -> {
            //Agregar reglas de dominio
            profesor.direccion = event.getDireccion();
            profesor.nombreCompleto = event.getNombreCompleto();
        });

        apply((AlumnosCargados event) -> {
            //Agregar reglas de dominio
            profesor.alumnos = event.getAlumno();
        });

        apply((NombreCambiado event) -> {
            //Agregar reglas de dominio
            profesor.nombreCompleto = event.getNombreprofe();
        });

        apply((DireccionCambiada event) -> {
            //Agregar reglas de dominio
            profesor.direccion = event.getDireccion();
        });

        apply((ExamenesCargados event) -> {
            //Agregar reglas de dominio
            profesor.examenes = event.getExamenes();
        });

        apply((ClasesCargadas event) -> {
            //Agregar reglas de dominio
            profesor.clases = event.getClases();
        });
    }
}

