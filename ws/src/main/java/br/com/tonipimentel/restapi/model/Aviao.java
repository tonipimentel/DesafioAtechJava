package br.com.tonipimentel.restapi.model;

import javax.persistence.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "Aviao")
public class Aviao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AviaoID", nullable = false)
    private Long AviaoID;

    @Column(name = "Modelo", nullable = false, length = 500)
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
