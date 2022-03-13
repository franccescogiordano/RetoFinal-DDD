package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.ArAlumno.Curso;
import co.com.sofka.domain.generic.DomainEvent;
import java.util.Set;
public class CursosCargados extends DomainEvent {
    private final Set<Curso> cursos;

    public CursosCargados(Set<Curso> cursos) {
       super("aralumno.event.cursoscargados");
        this.cursos = cursos;
    }

    public Set<Curso> getCursos() {
        return cursos;
    }
}
