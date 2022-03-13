package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.ArProfesor.values.ProfesorACargo;

public class CambiarProfesorACargoClase {
    private final ProfesorACargo profe;

    public CambiarProfesorACargoClase(ProfesorACargo profe) {
        this.profe = profe;
    }

    public ProfesorACargo getProfe() {
        return profe;
    }
}
