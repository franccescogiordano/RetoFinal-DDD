package co.com.sofka.domain.ArAlumno.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.ArAlumno.command.CrearAlumno;
import co.com.sofka.domain.ArAlumno.event.AlumnoCreado;
import co.com.sofka.domain.ArProfesor.Clase;
import co.com.sofka.domain.ArProfesor.Examen;
import co.com.sofka.domain.ArProfesor.command.CrearProfesor;
import co.com.sofka.domain.ArProfesor.event.ProfesorCreado;
import co.com.sofka.domain.ArProfesor.usecases.CrearProfesorUseCase;
import co.com.sofka.domain.generics.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CrearAlumnoUseCaseTest {
    @Test
    void crearAlumno(){
        AlumnoID alumnoID = AlumnoID.of("xxxx");
        NombreCompleto nombre = new NombreCompleto("Francccesco","Giordano Innamorato","",false);
        Direccion dir=new Direccion("Brum","11450","vizconque",false,"");


        var command = new CrearAlumno(nombre,dir,alumnoID);
        var useCase = new CrearAlumnoUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (AlumnoCreado)events.get(0);
        Assertions.assertEquals("aralumno.event.alumnocreado", event.type);
        Assertions.assertEquals(nombre.value(),event.getNombreCompleto().value());
        Assertions.assertEquals(dir.value(),event.getDireccion().value());
        Assertions.assertEquals("xxxx", event.aggregateRootId());
    }
}