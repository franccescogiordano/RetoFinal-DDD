package co.com.sofka.domain.generics;

import co.com.sofka.domain.generic.Identity;

public class NotaID extends Identity {
    private NotaID(String id){
        super(id);
    }

    public NotaID(){ }

    public static NotaID of(String id) {
        return new NotaID(id);
    }
}
