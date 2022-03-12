package co.com.sofka.domain.ArMateria.values;

import co.com.sofka.domain.ArProfesor.values.ExamenID;
import co.com.sofka.domain.generic.Identity;

public class HorarioID extends Identity {
    private HorarioID(String id){
        super(id);
    }

    public HorarioID(){ }

    public static HorarioID of(String id) {
        return new HorarioID(id);
    }
}
