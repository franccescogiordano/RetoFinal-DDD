package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.ArProfesor.Examen;
import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.ProfesorID;

import java.util.*;
public class CargarExamenes extends Command {
    private final Set<Examen> examenes;
    private final ProfesorID profesorID;

    public ProfesorID getProfesorID() {
        return profesorID;
    }
    public CargarExamenes(Set<Examen> examenes, ProfesorID profesorID) {
        this.examenes = examenes;
        this.profesorID = profesorID;
    }

    public Set<Examen> getExamenes() {
        return examenes;
    }
}
