package co.com.sofka.domain.ArMateria.values;

import co.com.sofka.domain.generic.ValueObject;

import java.sql.Date;

public class Valor implements ValueObject<Integer> {
    private final Integer valor;


    public Valor(Integer valor) {
        this.valor= valor;

    }

    @Override
    public Integer value() {
        return valor;
    }
}
