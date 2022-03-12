package co.com.sofka.domain.ArAlumno.values;


import co.com.sofka.domain.generic.Identity;

public class CursoID extends Identity {
    private CursoID(String id){
        super(id);
    }

    public CursoID(){ }

    public static CursoID of(String id) {
        return new CursoID(id);
    }
}