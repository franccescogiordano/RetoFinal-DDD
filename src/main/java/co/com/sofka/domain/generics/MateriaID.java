package co.com.sofka.domain.generics;

import co.com.sofka.domain.generic.Identity;

public class MateriaID extends Identity {
    private MateriaID(String id){
        super(id);
    }

    public MateriaID(){ }

    public static MateriaID of(String id) {
        return new MateriaID(id);
    }
}