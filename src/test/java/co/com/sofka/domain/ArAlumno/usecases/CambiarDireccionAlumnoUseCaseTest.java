package co.com.sofka.domain.ArAlumno.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.ArAlumno.command.CambiarDireccion;
import co.com.sofka.domain.ArAlumno.command.CambiarNombre;
import co.com.sofka.domain.ArAlumno.event.AlumnoCreado;
import co.com.sofka.domain.ArAlumno.event.DireccionCambiada;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.AlumnoID;
import co.com.sofka.domain.generics.Direccion;
import co.com.sofka.domain.generics.NombreCompleto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CambiarDireccionAlumnoUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @Test
    void CambiarDireccionDeAdministrativoUseCaseTest(){
        AlumnoID alumnoID = AlumnoID.of("xxxx");
           Direccion direccion = new Direccion("zzz","24242","dasdas",false,"");

        var command = new CambiarDireccion(direccion, alumnoID);
        Mockito.when(repository.getEventsBy(null)).thenReturn(events());

        var useCase = new CambiarDireccionAlumnoUseCase();
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (DireccionCambiada)events.get(0);
        Assertions.assertEquals("aralumno.event.direccioncambiada", event.type);
        Assertions.assertEquals(direccion, event.getDireccion());
        Assertions.assertEquals("xxxx",event.aggregateRootId());

    }

    private List<DomainEvent> events() {
        NombreCompleto nombre = new NombreCompleto("Francccesco","Giordano Innamorato","",false);
        Direccion dir=new Direccion("Brum","11450","vizconque",false,"");
        return List.of(new AlumnoCreado(nombre,dir));
    }

}