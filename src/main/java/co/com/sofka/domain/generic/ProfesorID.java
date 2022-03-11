package co.com.sofka.domain.generic;

public class ProfesorID extends Identity {
    private ProfesorID(String id){
        super(id);
    }

    public ProfesorID(){ }

    public static ProfesorID of(String id) {
        return new ProfesorID(id);
    }
}