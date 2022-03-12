package co.com.sofka.domain.generic;

public class MateriaID extends Identity {
    private MateriaID(String id){
        super(id);
    }

    public MateriaID(){ }

    public static MateriaID of(String id) {
        return new MateriaID(id);
    }
}