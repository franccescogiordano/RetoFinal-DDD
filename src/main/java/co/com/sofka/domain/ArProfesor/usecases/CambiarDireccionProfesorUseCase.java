package co.com.sofka.domain.ArProfesor.usecases;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.ArProfesor.Profesor;
import co.com.sofka.domain.ArProfesor.command.CambiarDireccion;
import co.com.sofka.domain.ArProfesor.command.CambiarNombre;

public class CambiarDireccionProfesorUseCase  extends UseCase<RequestCommand<CambiarDireccion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarDireccion> input) {
        var command = input.getCommand();
        var profesor = Profesor.from(command.getProfesorID(), retrieveEvents());
        try{
            profesor.ActualizarDireccion(command.getDir());
        }catch (IllegalArgumentException e){
            throw new BusinessException(command.getProfesorID().value(), e.getMessage());
        }
        emit().onResponse(new ResponseEvents(profesor.getUncommittedChanges()));
    }
}
