package co.com.sofka.domain.generic;

public class NotaID extends Identity {
    private NotaID(String id){
        super(id);
    }

    public NotaID(){ }

    public static NotaID of(String id) {
        return new NotaID(id);
    }
}
