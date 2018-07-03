package br.com.tonipimentel.restapi.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;

@Entity
@Table(name = "Estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EstadoID", nullable = false)
    private Long EstadoID;

    @Column(name = "Nome", nullable = false, length = 500)
    private String Nome;

    @Column(name = "Sigla", nullable = false, length = 10)
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
