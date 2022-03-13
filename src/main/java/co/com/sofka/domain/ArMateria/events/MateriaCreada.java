package co.com.sofka.domain.ArMateria.events;

import co.com.sofka.domain.ArAlumno.values.Tipo;
import co.com.sofka.domain.ArMateria.values.NombreMateria;
import co.com.sofka.domain.generic.DomainEvent;

public class MateriaCreada extends DomainEvent {
    private final NombreMateria nombreMateria;
    private final Tipo tipo;


    public MateriaCreada(NombreMateria nombreMateria,Tipo tipo) {
        super("materia.materiacreada");
        this.nombreMateria = nombreMateria;
        this.tipo = tipo;
    }

    public NombreMateria getNombreMateria() {
        return nombreMateria;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
