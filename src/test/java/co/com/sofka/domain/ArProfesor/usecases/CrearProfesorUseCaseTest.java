package co.com.sofka.domain.ArProfesor.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.ArAlumno.Alumno;
import co.com.sofka.domain.ArProfesor.Clase;
import co.com.sofka.domain.ArProfesor.Examen;
import co.com.sofka.domain.ArProfesor.command.CrearProfesor;
import co.com.sofka.domain.ArProfesor.event.ProfesorCreado;
import co.com.sofka.domain.generics.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;

class CrearProfesorUseCaseTest {
    @Test
    void crearEspectaculo(){
        //arrange

        /*
          protected NombreCompleto nombreCompleto;
             protected Direccion direccion;
    protected Set<AlumnoID> alumnos;
    protected Set<Clase> clases;
    protected Set<Examen> examenes;
    protected Set<Orientacion> orientaciones;
         */
        ProfesorID profesorID = ProfesorID.of("xxxx");
        NombreCompleto nombre = new NombreCompleto("Francccesco","Giordano Innamorato","",false);
        Direccion dir=new Direccion("Brum","11450","vizconque",false,"");
        Set<AlumnoID> alumnos = new HashSet<>();
        Set<Clase> clases = new HashSet<>();
        Set<Examen> examen = new HashSet<>();
        Set<Orientacion> orientaciones;

        var command = new CrearProfesor(nombre,dir,profesorID);
        var useCase = new CrearProfesorUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (ProfesorCreado)events.get(0);
        Assertions.assertEquals("arprofesor.event.profesorcreado", event.type);
        Assertions.assertEquals(nombre.value(),event.getNombreCompleto().value());
        Assertions.assertEquals(dir.value(),event.getDireccion().value());
        Assertions.assertEquals("xxxx", event.aggregateRootId());
    }
}