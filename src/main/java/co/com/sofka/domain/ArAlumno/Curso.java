package co.com.sofka.domain.ArAlumno;

import co.com.sofka.domain.ArAlumno.values.*;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Orientacion;

public class Curso extends Entity<CursoID> {
    private final NombreCurso nombreCurso;
    private final Tipo tipo;
    private final HoraInicioFin horaInicioFin;
    private final Requisitos requisitos;
    private Orientacion orientacion;

    public Curso(CursoID entityId, NombreCurso nombreCurso, Tipo tipo, HoraInicioFin horaInicioFin, Requisitos requisitos) {
        super(entityId);
        this.nombreCurso = nombreCurso;
        this.tipo = tipo;
        this.horaInicioFin = horaInicioFin;
        this.requisitos = requisitos;
    }

    public NombreCurso NombreCurso() {
        return nombreCurso;
    }

    public Tipo tipo() {
        return tipo;
    }

    public HoraInicioFin horaInicioFin() {
        return horaInicioFin;
    }

    public Requisitos requisitos() {
        return requisitos;
    }

    public Orientacion orientacion() {
        return orientacion;
    }
}
