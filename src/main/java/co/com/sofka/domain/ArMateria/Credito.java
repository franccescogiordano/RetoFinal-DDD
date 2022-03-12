package co.com.sofka.domain.ArMateria;

import co.com.sofka.domain.ArMateria.values.CreditoID;
import co.com.sofka.domain.ArMateria.values.Estado;
import co.com.sofka.domain.ArMateria.values.Importancia;
import co.com.sofka.domain.ArMateria.values.Valor;
import co.com.sofka.domain.generic.Entity;

public class Credito extends Entity<CreditoID> {
    private final Valor valor;
    private final Importancia importancia;
    private final Estado estado;

    public Credito(CreditoID entityId, Valor valor, Importancia importancia, Estado estado) {
        super(entityId);
        this.valor = valor;
        this.importancia = importancia;
        this.estado = estado;
    }

    public Valor valor() {
        return valor;
    }

    public Importancia importancia() {
        return importancia;
    }

    public Estado estado() {
        return estado;
    }
}
