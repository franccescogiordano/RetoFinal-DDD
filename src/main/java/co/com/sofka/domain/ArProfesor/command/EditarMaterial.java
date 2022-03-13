package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.ArProfesor.Material;
import co.com.sofka.domain.generic.Command;

public class EditarMaterial extends Command {
    private final Material material;


    public EditarMaterial(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }
}
