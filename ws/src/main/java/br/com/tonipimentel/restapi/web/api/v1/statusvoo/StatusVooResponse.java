package br.com.tonipimentel.restapi.web.api.v1.statusvoo;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class StatusVooResponse {

    private Long StatusVooID;

    private String Nome;

    public Long getStatusVooID() {
        return StatusVooID;
    }

    public void setStatusVooID(Long StatusVooID) {
        this.StatusVooID = StatusVooID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
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
