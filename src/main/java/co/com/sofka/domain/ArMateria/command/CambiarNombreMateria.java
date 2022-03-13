package co.com.sofka.domain.ArMateria.command;

import co.com.sofka.domain.ArMateria.values.NombreMateria;
import co.com.sofka.domain.generic.Command;

public class CambiarNombreMateria extends Command{
    private final NombreMateria nombreMateria;

    public CambiarNombreMateria(NombreMateria nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public NombreMateria getNombreMateria() {
        return nombreMateria;
    }
}
