package co.com.sofka.domain.ArMateria.values;

import co.com.sofka.domain.ArProfesor.values.ExamenID;
import co.com.sofka.domain.generic.Identity;

public class FechaExamenID extends Identity {
    private FechaExamenID(String id){
        super(id);
    }

    public FechaExamenID(){ }

    public static FechaExamenID of(String id) {
        return new FechaExamenID(id);
    }
}
