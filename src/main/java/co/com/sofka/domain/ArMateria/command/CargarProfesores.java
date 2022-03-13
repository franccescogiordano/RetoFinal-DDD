package co.com.sofka.domain.ArMateria.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.ProfesorID;
import java.util.Set;
public class CargarProfesores extends Command {
    private final Set<ProfesorID> profes;

    public CargarProfesores(Set<ProfesorID> profes) {
        this.profes = profes;
    }

    public Set<ProfesorID> getProfes() {
        return profes;
    }
}
