package co.com.sofka.domain.ArAlumno;

import co.com.sofka.domain.ArAlumno.event.*;
import co.com.sofka.domain.generic.EventChange;

public class AlumnoEventChange extends EventChange {
    public AlumnoEventChange(Alumno alumno) {

        apply((AlumnoCreado event) -> {
            //Agregar reglas de dominio
            alumno.direccion = event.getDireccion();
            alumno.nombreCompleto = event.getNombreCompleto();


        });

        apply((NombreCambiado event) -> {
            //Agregar reglas de dominio
            alumno.nombreCompleto = event.getNombreAlum();
        });

        apply((DireccionCambiada event) -> {
            //Agregar reglas de dominio
            alumno.direccion = event.getDireccion();
        });

        apply((CursosCargados event) -> {
            //Agregar reglas de dominio
            alumno.cursos = event.getCursos();


        });

        apply((ProfesoresCargados event) -> {
            //Agregar reglas de dominio
            alumno.profesores = event.getProfes();



        });

    }
}

