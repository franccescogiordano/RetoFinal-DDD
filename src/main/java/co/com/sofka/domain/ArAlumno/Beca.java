package co.com.sofka.domain.ArAlumno;

import co.com.sofka.domain.ArAlumno.values.BecaId;
import co.com.sofka.domain.ArAlumno.values.FechaCobro;
import co.com.sofka.domain.ArAlumno.values.Monto;
import co.com.sofka.domain.ArAlumno.values.TipoBeca;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Nombre;

public class Beca extends Entity<BecaId> {
    private final FechaCobro fechaCobro;
    private final Monto monto;
    private final TipoBeca tipoBeca;
    private final Nombre nombre;


    public Beca(BecaId entityId, FechaCobro fechaCobro, Monto monto, TipoBeca tipoBeca, Nombre nombre) {
        super(entityId);
        this.fechaCobro = fechaCobro;
        this.monto = monto;
        this.tipoBeca = tipoBeca;
        this.nombre = nombre;
    }


    public FechaCobro FechaCobro() {
        return fechaCobro;
    }

    public Monto Monto() {
        return monto;
    }

    public TipoBeca TipoBeca() {
        return tipoBeca;
    }

    public Nombre Nombre() {
        return nombre;
    }

}
