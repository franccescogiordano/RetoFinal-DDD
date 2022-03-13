package co.com.sofka.domain.generics;

import co.com.sofka.domain.generic.ValueObject;

public class NombreCompleto implements ValueObject<String> {
    private final String primerNombre;
    private final String apellidos;
    private final String segundoNombre;
    private final Boolean tienesegundoNombre;

    public NombreCompleto(String primerNombre,String apellidos,String segundoNombre,Boolean tieneSegundoNombre) {
        if(tieneSegundoNombre) {
            this.primerNombre = primerNombre;
            this.segundoNombre = segundoNombre;
            this.apellidos = apellidos;
            this.tienesegundoNombre = true;
        }else{
            this.primerNombre = primerNombre;
            this.segundoNombre = "";
            this.apellidos = apellidos;
            this.tienesegundoNombre = false;
        }

    }

    @Override
    public String value() {
        return primerNombre+segundoNombre+apellidos;
    }
}
