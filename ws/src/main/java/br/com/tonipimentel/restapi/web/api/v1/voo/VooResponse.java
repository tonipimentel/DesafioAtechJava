package br.com.tonipimentel.restapi.web.api.v1.voo;

import br.com.tonipimentel.restapi.web.api.v1.aviao.AviaoResponse;
import br.com.tonipimentel.restapi.web.api.v1.statusvoo.StatusVooResponse;
import br.com.tonipimentel.restapi.web.api.v1.cidade.CidadeResponse;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Collection;
import java.util.Date;

public class VooResponse {

    private Long VooID;

    private StatusVooResponse StatusVooResponse;

    private AviaoResponse AviaoResponse;

    private Date Partida;

    private Date Chegada;

    private CidadeResponse CidadeResponseOrigem;
    
    private CidadeResponse CidadeResponseDestino;

    public Long getVooID() {
        return VooID;
    }

    public void setVooID(Long VooID) {
        this.VooID = VooID;
    }

    public StatusVooResponse getStatusVooResponse() {
        return StatusVooResponse;
    }

    public void setStatusVooResponse(StatusVooResponse StatusVooResponse) {
        this.StatusVooResponse = StatusVooResponse;
    }

    public AviaoResponse getAviaoResponse() {
        return AviaoResponse;
    }

    public void setAviaoResponse(AviaoResponse AviaoResponse) {
        this.AviaoResponse = AviaoResponse;
    }
    
    public Date getPartida() {
        return Partida;
    }

    public void setPartida(Date Partida) {
        this.Partida = Partida;
    }

    public Date getChegada() {
        return Chegada;
    }

    public void setChegada(Date Chegada) {
        this.Chegada = Chegada;
    }

    public CidadeResponse getCidadeResponseOrigem() {
        return CidadeResponseOrigem;
    }

    public void setCidadeResponseOrigem(CidadeResponse CidadeResponseOrigem) {
        this.CidadeResponseOrigem = CidadeResponseOrigem;
    }

    public CidadeResponse getCidadeResponseDestino() {
        return CidadeResponseDestino;
    }

    public void setCidadeResponseDestino(CidadeResponse CidadeResponseDestino) {
        this.CidadeResponseDestino = CidadeResponseDestino;
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
