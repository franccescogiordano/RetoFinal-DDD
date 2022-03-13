package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.ArProfesor.Clase;
import co.com.sofka.domain.generic.Command;
import java.util.*;
public class CargarClases extends Command {
    private final Set<Clase> clases;

    public CargarClases(Set<Clase> clases) {
        this.clases = clases;
    }

    public Set<Clase> getClases() {
        return clases;
    }
}
