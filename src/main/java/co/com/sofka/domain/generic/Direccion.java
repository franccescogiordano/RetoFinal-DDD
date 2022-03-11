package co.com.sofka.domain.generic;

public class Direccion implements ValueObject<String> {
    private final String calle;
    private final String esquina;
    private final String numeroDePuerta;
    private final String apto;
    private final Boolean viveEnApartamento;

    public Direccion(String calle,String numeroDePuerta,String esquina,Boolean viveEnApartamento,String apto) {
        if(viveEnApartamento) {
            this.calle = calle;
            this.esquina = esquina;
            this.numeroDePuerta = numeroDePuerta;
            this.apto=apto;
            this.viveEnApartamento = true;
        }else{
            this.calle = calle;
            this.esquina =esquina;
            this.numeroDePuerta = numeroDePuerta;
            this.apto="";
            this.viveEnApartamento = false;
        }

    }

    @Override
    public String value() {
        return calle+esquina+numeroDePuerta+apto;
    }
}
