package co.com.sofka.domain.ArAlumno.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.ArAlumno.Alumno;
import co.com.sofka.domain.ArAlumno.command.CrearAlumno;


public class CrearAlumnoUseCase extends UseCase<RequestCommand<CrearAlumno>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearAlumno> input) {
        var command = input.getCommand();
        var alumno = new Alumno(command.getAlumnoID(), command.getNombreCompleto(), command.getDireccion());
        emit().onResponse(new ResponseEvents(alumno.getUncommittedChanges()));
    }
}