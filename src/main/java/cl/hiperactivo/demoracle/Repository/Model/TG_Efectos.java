package cl.hiperactivo.demoracle.Repository.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TG_Efectos {

    @Column(name = "COD_EFECTO")
    @Id
    private Integer codEfecto;

    @Column(name = "GLS_EFECTO")
    private String glsEfecto;

    public TG_Efectos() {
    }

    public Integer getCodEfecto() {
        return codEfecto;
    }

    public void setCodEfecto(Integer codEfecto) {
        this.codEfecto = codEfecto;
    }

    public String getGlsEfecto() {
        return glsEfecto;
    }

    public void setGlsEfecto(String glsEfecto) {
        this.glsEfecto = glsEfecto;
    }

    @Override
    public String toString() {
        return "TG_Efectos{" +
                "codEfecto=" + codEfecto +
                ", glsEfecto='" + glsEfecto + '\'' +
                '}';
    }
}

