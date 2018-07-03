package br.com.tonipimentel.restapi.model;

import javax.persistence.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "StatusVoo")
public class StatusVoo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StatusVooID", nullable = false)
    private Long StatusVooID;

    @Column(name = "Nome", nullable = false, length = 500)
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