package co.com.sofka.domain.ArAlumno.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.ArAlumno.command.CambiarNombre;
import co.com.sofka.domain.ArAlumno.event.NombreCambiado;
import co.com.sofka.domain.ArAlumno.event.AlumnoCreado;
import co.com.sofka.domain.ArProfesor.usecases.CambiarNombreProfesorUseCase;
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

import java.util.List;

@ExtendWith(MockitoExtension.class)
class CambiarNombreAlumnoUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    void CambiarDireccionDeAdministrativoUseCaseTest(){
        AlumnoID alumnoID = AlumnoID.of("xxxx");
        NombreCompleto nombre = new NombreCompleto("Francccesco","Giordano Innamorato","",false);

        var command = new CambiarNombre(nombre, alumnoID);
        Mockito.when(repository.getEventsBy(null)).thenReturn(events());

        var useCase = new CambiarNombreAlumnoUseCase();
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (NombreCambiado)events.get(0);
        Assertions.assertEquals("aralumno.event.nombrecambiado", event.type);
        Assertions.assertEquals(nombre, event.getNombreAlum());
        Assertions.assertEquals("xxxx",event.aggregateRootId());

    }

    private List<DomainEvent> events() {
        NombreCompleto nombre = new NombreCompleto("Francccesco","Giordano Innamorato","",false);
        Direccion dir=new Direccion("Brum","11450","vizconque",false,"");
        return List.of(new AlumnoCreado(nombre,dir));
    }
}