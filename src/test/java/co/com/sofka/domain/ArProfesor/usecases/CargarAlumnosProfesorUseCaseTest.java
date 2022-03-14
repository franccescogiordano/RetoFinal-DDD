package co.com.sofka.domain.ArProfesor.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.ArProfesor.command.CambiarDireccion;
import co.com.sofka.domain.ArProfesor.command.CambiarNombre;
import co.com.sofka.domain.ArProfesor.command.CargarAlumnos;
import co.com.sofka.domain.ArProfesor.event.AlumnosCargados;
import co.com.sofka.domain.ArProfesor.event.DireccionCambiada;
import co.com.sofka.domain.ArProfesor.event.NombreCambiado;
import co.com.sofka.domain.ArProfesor.event.ProfesorCreado;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.AlumnoID;
import co.com.sofka.domain.generics.Direccion;
import co.com.sofka.domain.generics.NombreCompleto;
import co.com.sofka.domain.generics.ProfesorID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Set;
import java.util.List;
import java.util.HashSet;

@ExtendWith(MockitoExtension.class)
class CargarAlumnosProfesorUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void CargarAlumnosProfesorUseCaseTest(){
        ProfesorID profesorID = ProfesorID.of("xxxx");
        AlumnoID a = AlumnoID.of("zzzz");
        AlumnoID b = AlumnoID.of("aaaa");
        AlumnoID c = AlumnoID.of("vvvv");
      Set<AlumnoID> alumnos= new HashSet<>();
        alumnos.add(a);
        alumnos.add(b);
        alumnos.add(c);
        var command = new CargarAlumnos(alumnos, profesorID);
        Mockito.when(repository.getEventsBy(null)).thenReturn(events());

        var useCase = new CargarAlumnosProfesorUseCase();
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (AlumnosCargados)events.get(0);
        Assertions.assertEquals("arprofesor.event.alumnoscargados", event.type);
        Assertions.assertEquals(alumnos, event.getAlumno());
        Assertions.assertEquals("xxxx",event.aggregateRootId());

    }

    private List<DomainEvent> events() {
        NombreCompleto nombre = new NombreCompleto("Francccesco","Giordano Innamorato","",false);
        Direccion dir=new Direccion("Brum","11450","vizconque",false,"");
        return List.of(new ProfesorCreado(nombre,dir));
    }
}