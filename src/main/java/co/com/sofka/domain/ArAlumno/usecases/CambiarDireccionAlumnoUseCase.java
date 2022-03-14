package co.com.sofka.domain.ArAlumno.usecases;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.ArAlumno.Alumno;

import co.com.sofka.domain.ArAlumno.command.CambiarDireccion;

public class CambiarDireccionAlumnoUseCase extends UseCase<RequestCommand<CambiarDireccion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarDireccion> input) {
        var command = input.getCommand();
        var alumno = Alumno.from(command.getAlumnoID(), retrieveEvents());
        try {
            alumno.ActualizarDireccion(command.getDireccion());
        } catch (IllegalArgumentException e) {
            throw new BusinessException(command.getAlumnoID().value(), e.getMessage());
        }
        emit().onResponse(new ResponseEvents(alumno.getUncommittedChanges()));
    }
}
