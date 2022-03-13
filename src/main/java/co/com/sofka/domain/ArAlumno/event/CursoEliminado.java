package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.ArAlumno.Curso;
import co.com.sofka.domain.generic.DomainEvent;

public class CursoEliminado extends DomainEvent {
    private final Curso curso;

    public CursoEliminado(Curso curso) {
        super("aralumno.event.cursoeliminado");
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }
}
