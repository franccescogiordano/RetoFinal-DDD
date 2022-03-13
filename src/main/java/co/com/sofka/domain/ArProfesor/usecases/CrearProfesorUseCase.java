package co.com.sofka.domain.ArProfesor.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.ArProfesor.Profesor;
import co.com.sofka.domain.ArProfesor.command.CrearProfesor;

public class CrearProfesorUseCase extends UseCase<RequestCommand<CrearProfesor>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearProfesor> input) {
        var command = input.getCommand();
        var profesor = new Profesor(command.getId(),command.getNombreCompleto(),command.getDireccion());
        emit().onResponse(new ResponseEvents(profesor.getUncommittedChanges()));
    }
}
