package co.com.sofka.domain.generics;

import co.com.sofka.domain.generic.Identity;

public class ClaseID  extends Identity {
    private ClaseID(String id){
        super(id);
    }

    public ClaseID(){ }

    public static ClaseID of(String id) {
        return new ClaseID(id);
    }
}