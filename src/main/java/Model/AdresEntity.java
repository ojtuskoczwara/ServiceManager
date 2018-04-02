package Model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Wojtek on 2018-04-02.
 */
@Entity
@Table(name = "t_adres", schema = "public", catalog = "ManagerSerwisu2")
public class AdresEntity {
    private int adresId;
    private String ulica;
    private String numerZamieszkania;
    private String kodPocztowy;
    private String miejscowosc;
    private Collection<KlientEntity> tKlientsByAdresId;

    @Id
    @Column(name = "adres_id", nullable = false)
    public int getAdresId() {
        return adresId;
    }

    public void setAdresId(int adresId) {
        this.adresId = adresId;
    }

    @Basic
    @Column(name = "ulica", nullable = false, length = 30)
    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    @Basic
    @Column(name = "numer_zamieszkania", nullable = false, length = 10)
    public String getNumerZamieszkania() {
        return numerZamieszkania;
    }

    public void setNumerZamieszkania(String numerZamieszkania) {
        this.numerZamieszkania = numerZamieszkania;
    }

    @Basic
    @Column(name = "kod_pocztowy", nullable = false, length = 7)
    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    @Basic
    @Column(name = "miejscowosc", nullable = false, length = 30)
    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdresEntity that = (AdresEntity) o;

        if (adresId != that.adresId) return false;
        if (ulica != null ? !ulica.equals(that.ulica) : that.ulica != null) return false;
        if (numerZamieszkania != null ? !numerZamieszkania.equals(that.numerZamieszkania) : that.numerZamieszkania != null)
            return false;
        if (kodPocztowy != null ? !kodPocztowy.equals(that.kodPocztowy) : that.kodPocztowy != null) return false;
        if (miejscowosc != null ? !miejscowosc.equals(that.miejscowosc) : that.miejscowosc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adresId;
        result = 31 * result + (ulica != null ? ulica.hashCode() : 0);
        result = 31 * result + (numerZamieszkania != null ? numerZamieszkania.hashCode() : 0);
        result = 31 * result + (kodPocztowy != null ? kodPocztowy.hashCode() : 0);
        result = 31 * result + (miejscowosc != null ? miejscowosc.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tAdresByAdresId")
    public Collection<KlientEntity> gettKlientsByAdresId() {
        return tKlientsByAdresId;
    }

    public void settKlientsByAdresId(Collection<KlientEntity> tKlientsByAdresId) {
        this.tKlientsByAdresId = tKlientsByAdresId;
    }
}
