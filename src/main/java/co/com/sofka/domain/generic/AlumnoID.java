package co.com.sofka.domain.generic;

public class AlumnoID extends Identity {
    private AlumnoID(String id){
        super(id);
    }

    public AlumnoID(){ }

    public static AlumnoID of(String id) {
        return new AlumnoID(id);
    }
}