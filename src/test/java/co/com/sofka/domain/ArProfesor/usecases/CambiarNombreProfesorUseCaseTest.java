package co.com.sofka.domain.ArProfesor.usecases;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.ArProfesor.Clase;
import co.com.sofka.domain.ArProfesor.Examen;
import co.com.sofka.domain.ArProfesor.command.CambiarDireccion;
import co.com.sofka.domain.ArProfesor.command.CambiarNombre;
import co.com.sofka.domain.ArProfesor.event.NombreCambiado;
import co.com.sofka.domain.ArProfesor.event.ProfesorCreado;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CambiarNombreProfesorUseCaseTest {

        @Mock
        DomainEventRepository repository;

        @Test
        void CambiarDireccionDeAdministrativoUseCaseTest(){
            ProfesorID profesorID = ProfesorID.of("xxxx");
            NombreCompleto nombre = new NombreCompleto("Francccesco","Giordano Innamorato","",false);

            var command = new CambiarNombre(nombre, profesorID);
            Mockito.when(repository.getEventsBy(null)).thenReturn(events());

            var useCase = new CambiarNombreProfesorUseCase();
            useCase.addRepository(repository);

            //act
            var events = UseCaseHandler.getInstance()
                    .syncExecutor(useCase, new RequestCommand<>(command))
                    .orElseThrow()
                    .getDomainEvents();

            //assert
            var event = (NombreCambiado)events.get(0);
            Assertions.assertEquals("arprofesor.event.nombrecambiado", event.type);
            Assertions.assertEquals(nombre, event.getNombreprofe());
            Assertions.assertEquals("xxxx",event.aggregateRootId());

        }

        private List<DomainEvent> events() {
            NombreCompleto nombre = new NombreCompleto("Francccesco","Giordano Innamorato","",false);
            Direccion dir=new Direccion("Brum","11450","vizconque",false,"");
            return List.of(new ProfesorCreado(nombre,dir));
        }
    }

