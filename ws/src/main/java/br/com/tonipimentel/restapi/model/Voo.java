package br.com.tonipimentel.restapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Voo")
public class Voo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VooID", nullable = false)
    private Long VooID;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "StatusVooID", nullable = false)
    private StatusVoo StatusVoo;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "AviaoID", nullable = false)
    private Aviao Aviao;

    @Column(name = "Partida", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date Partida;

    @Column(name = "Chegada", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date Chegada;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "CidadeID", nullable = false)
    private Cidade CidadeOrigem;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "CidadeID", nullable = false)
    private Cidade CidadeDestino;

    public Long getVooID() {
        return VooID;
    }

    public void setVooID(Long VooID) {
        this.VooID = VooID;
    }

    public StatusVoo getStatusVoo() {
        return StatusVoo;
    }

    public void setStatusVoo(StatusVoo StatusVoo) {
        this.StatusVoo = StatusVoo;
    }

    public Aviao getAviao() {
        return Aviao;
    }

    public void setAviao(Aviao Aviao) {
        this.Aviao = Aviao;
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

    public Cidade getCidadeOrigem() {
        return CidadeOrigem;
    }

    public void setCidadeOrigem(Cidade CidadeOrigem) {
        this.CidadeOrigem = CidadeOrigem;
    }

    public Cidade getCidadeDestino() {
        return CidadeDestino;
    }

    public void setCidadeDestino(Cidade CidadeDestino) {
        this.CidadeDestino = CidadeDestino;
    }
}
