package co.com.sofka.domain.ArMateria.values;

import co.com.sofka.domain.generic.ValueObject;

import java.sql.Date;

public class Dia implements ValueObject<String> {
    private final Date dia;
    private final String diaString;

    public Dia(String diaString,Date dia) {
        this.diaString= diaString;
        this.dia= dia;

    }

    @Override
    public String value() {
        return diaString+dia.toString();
    }
}
