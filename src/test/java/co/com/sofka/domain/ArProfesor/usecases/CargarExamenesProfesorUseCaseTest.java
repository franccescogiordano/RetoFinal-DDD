package co.com.sofka.domain.ArProfesor.usecases;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.ArProfesor.Examen;
import co.com.sofka.domain.ArProfesor.command.CambiarDireccion;
import co.com.sofka.domain.ArProfesor.command.CargarAlumnos;
import co.com.sofka.domain.ArProfesor.command.CargarExamenes;
import co.com.sofka.domain.ArProfesor.event.AlumnosCargados;
import co.com.sofka.domain.ArProfesor.event.ExamenesCargados;
import co.com.sofka.domain.ArProfesor.event.ProfesorCreado;
import co.com.sofka.domain.ArProfesor.values.ExamenID;
import co.com.sofka.domain.ArProfesor.values.Preguntas;
import co.com.sofka.domain.ArProfesor.values.Respuestas;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generics.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CargarExamenesProfesorUseCaseTest  {

    @Mock
    DomainEventRepository repository;

    @Test
    void CargarAlumnosProfesorUseCaseTest(){
        ProfesorID profesorID = ProfesorID.of("xxxx");
        Set<String> abcd= new HashSet<>();
        String stringTest="asdadas";
        abcd.add(stringTest);
        ExamenID entityId=ExamenID.of("xxxx");
        ExamenID entityId2=ExamenID.of("xxxx2");
        ExamenID entityId3=ExamenID.of("xxxx3");
        Preguntas preguntas=new Preguntas(abcd);
        Respuestas respuestas=new Respuestas(abcd);
        Orientacion orientacion=new Orientacion("abcd","abcd");
        //ExamenID entityId, Preguntas preguntas, Respuestas respuestas, Orientacion orientacion
        Examen z = new Examen( entityId2,preguntas ,respuestas ,orientacion );
        Examen x= new Examen( entityId3,preguntas ,respuestas ,orientacion );
        Examen n = new Examen( entityId,preguntas ,respuestas ,orientacion );
  
        AlumnoID c = AlumnoID.of("vvvv");
        Set<Examen> examenes= new HashSet<>();
        examenes.add(z);
        examenes.add(x);
        examenes.add(n);
        var command = new CargarExamenes(examenes, profesorID);
        Mockito.when(repository.getEventsBy(null)).thenReturn(events());

        var useCase = new CargarExamenesProfesorUseCase();
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (ExamenesCargados)events.get(0);
        Assertions.assertEquals("arprofesor.event.examenescargados", event.type);
        Assertions.assertEquals(examenes, event.getExamenes());
        Assertions.assertEquals("xxxx",event.aggregateRootId());

    }

    private List<DomainEvent> events() {
        NombreCompleto nombre = new NombreCompleto("Francccesco","Giordano Innamorato","",false);
        Direccion dir=new Direccion("Brum","11450","vizconque",false,"");
        return List.of(new ProfesorCreado(nombre,dir));
    }

}