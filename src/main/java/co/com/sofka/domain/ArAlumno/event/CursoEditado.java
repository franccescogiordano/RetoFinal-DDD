package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.ArAlumno.Curso;
import co.com.sofka.domain.generic.DomainEvent;

public class CursoEditado extends DomainEvent {
    private final Curso curso;

    public CursoEditado(Curso curso) {
        super("aralumno.event.cursoeditado");
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }
}
