package br.com.tonipimentel.restapi.web.api.v1.estado;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class EstadoResponse {

    private Long EstadoID;

    private String Nome;

    private String Sigla;

    public Long getEstadoID() {
        return EstadoID;
    }

    public void setEstadoID(Long EstadoID) {
        this.EstadoID = EstadoID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String Sigla) {
        this.Sigla = Sigla;
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
