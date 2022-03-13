package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.Orientacion;

import java.util.*;
public class CargarOrientaciones extends Command {
    private final Set<Orientacion> orientacions;

    public CargarOrientaciones(Set<Orientacion> orientacions) {
        this.orientacions = orientacions;
    }

    public Set<Orientacion> getOrientacions() {
        return orientacions;
    }
}
