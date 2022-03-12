package co.com.sofka.domain.ArAlumno.values;


import co.com.sofka.domain.generic.Identity;

public class BecaId extends Identity {
    private BecaId(String id){
        super(id);
    }

    public BecaId(){ }

    public static BecaId of(String id) {
        return new BecaId(id);
    }
}