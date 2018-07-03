package br.com.tonipimentel.restapi.web.api.v1.aviao;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.math.BigDecimal;

public class AviaoResponse {

    private Long AviaoID;

    private String Modelo;

    public Long getAviaoID() {
        return AviaoID;
    }

    public void setAviaoID(Long AviaoID) {
        this.AviaoID = AviaoID;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
