package co.com.sofka.domain.ArProfesor.values;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;

public class MaterialID extends Identity {
    private MaterialID(String id){
        super(id);
    }

    public MaterialID(){ }

    public static MaterialID of(String id) {
        return new MaterialID(id);
    }
}
