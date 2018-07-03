package br.com.tonipimentel.restapi.web.api.v1.cidade;

import br.com.tonipimentel.restapi.web.api.v1.estado.EstadoResponse;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class CidadeResponse {

    private Long CidadeID;

    private String Nome;

    private EstadoResponse EstadoResponse;

    public Long getCidadeID() {
        return CidadeID;
    }

    public void setCidadeID(Long CidadeID) {
        this.CidadeID = CidadeID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public EstadoResponse getEstadoResponse() {
        return EstadoResponse;
    }

    public void setEstadoResponse(EstadoResponse EstadoResponse) {
        this.EstadoResponse = EstadoResponse;
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
