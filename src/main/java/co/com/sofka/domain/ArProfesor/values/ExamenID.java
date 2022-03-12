package co.com.sofka.domain.ArProfesor.values;
import co.com.sofka.domain.generic.Identity;

public class ExamenID extends Identity {
    private ExamenID(String id){
        super(id);
    }

    public ExamenID(){ }

    public static ExamenID of(String id) {
        return new ExamenID(id);
    }
}
