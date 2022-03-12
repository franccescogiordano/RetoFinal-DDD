package co.com.sofka.domain.ArMateria;
import co.com.sofka.domain.ArMateria.events.MateriaCreada;
import co.com.sofka.domain.ArProfesor.Profesor;
import co.com.sofka.domain.ArProfesor.event.ProfesorCreado;
import co.com.sofka.domain.generic.EventChange;

public class MateriaEventChange extends EventChange {
    public MateriaEventChange(Materia materia) {

        apply((MateriaCreada event) -> {
            //Agregar reglas de dominio
            materia.nombreMateria = event.getNombreMateria();
            materia.tipo = event.getTipo();
        });


    }
}

