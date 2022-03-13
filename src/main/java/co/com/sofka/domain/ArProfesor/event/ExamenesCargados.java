package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.ArProfesor.Examen;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Set;

public class ExamenesCargados extends DomainEvent {
    private final Set<Examen> examenes;

    public ExamenesCargados(Set<Examen> examenes) {
        super("profesor.examenescargados");
        this.examenes=examenes;
    }

    public Set<Examen> getExamenes() {
        return examenes;
    }

}
