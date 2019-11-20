package cl.hiperactivo.demoracle.VO;

import java.io.Serializable;

public class EfectoVO implements Serializable {

    private int codEfecto;
    private String glsEfecto;

    private EfectoVO(Builder builder) {
        codEfecto = builder.codEfecto;
        glsEfecto = builder.glsEfecto;
    }

    public EfectoVO() {
    }

    public int getCodEfecto() {
        return codEfecto;
    }

    public void setCodEfecto(int codEfecto) {
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
        return "EfectoVO{" +
                "codEfecto=" + codEfecto +
                ", glsEfecto='" + glsEfecto + '\'' +
                '}';
    }

    public static class Builder {

        private int codEfecto;
        private String glsEfecto;

        public Builder codEfecto(int codEfecto){
            this.codEfecto = codEfecto;
            return this;
        }

        public Builder glsEfecto(String glsEfecto){
            this.glsEfecto = glsEfecto;
            return this;
        }

        public EfectoVO build() {
            return new EfectoVO(this);
        }
    }
}
