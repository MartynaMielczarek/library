package entity;

import javax.persistence.*;


@Entity
@Table(name = "KSIAZKA_TABLE")
public class Ksiazka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tytul")
    private String tytul;

    @Column(name = "data_wydania")
    private String data_wydania;

    @Column(name = "ISBN")
    private String ISBN;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getData_wydania() {
        return data_wydania;
    }

    public void setData_wydania(String data_wydania) {
        this.data_wydania = data_wydania;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "entity.Ksiazka{" +
                "id=" + id +
                ", tytul='" + tytul + '\'' +
                ", data_wydania='" + data_wydania + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}