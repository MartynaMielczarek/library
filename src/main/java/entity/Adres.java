package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adres {
    @Column(name = "kraj")
    private String kraj;
    @Column(name = "miasto")
    private String miasto;
    @Column(name = "ulica")
    private String ulica;
    @Column(name = "numer")
    private String numer;

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    @Override
    public String toString() {
        return "entity.Adres{" +
                "kraj='" + kraj + '\'' +
                ", miasto='" + miasto + '\'' +
                ", ulica='" + ulica + '\'' +
                ", numer='" + numer + '\'' +
                '}';
    }
}


