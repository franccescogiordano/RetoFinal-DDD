package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.ArProfesor.Examen;
import java.util.*;
public class CargarExamenes {
    private final Set<Examen> examenes;

    public CargarExamenes(Set<Examen> examenes) {
        this.examenes = examenes;
    }

    public Set<Examen> getExamenes() {
        return examenes;
    }
}
