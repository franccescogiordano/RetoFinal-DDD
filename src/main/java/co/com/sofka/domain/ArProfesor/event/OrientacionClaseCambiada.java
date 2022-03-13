package co.com.sofka.domain.ArProfesor.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.Orientacion;
//TODO Meter en el eventchange
public class OrientacionClaseCambiada extends DomainEvent {
    private final Orientacion orientacion;
    public OrientacionClaseCambiada(Orientacion orientacion){
        super("arprofesor.event.orientacionclasecambiada");
        this.orientacion=orientacion;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }
}
