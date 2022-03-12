package co.com.sofka.domain.ArProfesor;

import co.com.sofka.domain.ArProfesor.values.FechaDevolucion;
import co.com.sofka.domain.ArProfesor.values.MaterialID;
import co.com.sofka.domain.ArProfesor.values.TipoMaterial;
import co.com.sofka.domain.ArProfesor.values.Uso;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Nombre;
import co.com.sofka.domain.generic.Orientacion;

public class Material extends Entity<MaterialID> {
    private final Nombre nombre;
    private final Uso uso;
    private final FechaDevolucion fechaDevolucion;
    private final TipoMaterial tipoMaterial;
    private final Orientacion orientacion;

    public Material(MaterialID entityId, Nombre nombre, Uso uso, FechaDevolucion fechaDevolucion, TipoMaterial tipoMaterial, Orientacion orientacion) {
        super(entityId);
        this.nombre = nombre;
        this.uso = uso;
        this.fechaDevolucion = fechaDevolucion;
        this.tipoMaterial = tipoMaterial;
        this.orientacion = orientacion;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Uso getUso() {
        return uso;
    }

    public FechaDevolucion fechaDevolucion() {
        return fechaDevolucion;
    }

    public TipoMaterial tipoMaterial() {
        return tipoMaterial;
    }

    public Orientacion orientacion() {
        return orientacion;
    }
}
