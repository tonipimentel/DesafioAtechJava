package br.com.tonipimentel.restapi.web.api.v1.voo;

public class FlightRequest {

    private String airlineName;

    private String ident;

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }
}
