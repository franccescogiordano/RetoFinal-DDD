package co.com.sofka.domain.ArMateria.values;

import co.com.sofka.domain.generic.Identity;

public class CreditoID extends Identity {
    private CreditoID(String id){
        super(id);
    }

    public CreditoID(){ }

    public static CreditoID of(String id) {
        return new CreditoID(id);
    }
}
