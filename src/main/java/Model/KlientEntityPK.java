package Model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Wojtek on 2018-04-02.
 */
public class KlientEntityPK implements Serializable {
    private int klientId;
    private int kontaktId;
    private int adresId;

    @Column(name = "klient_id", nullable = false)
    @Id
    public int getKlientId() {
        return klientId;
    }

    public void setKlientId(int klientId) {
        this.klientId = klientId;
    }

    @Column(name = "kontakt_id", nullable = false)
    @Id
    public int getKontaktId() {
        return kontaktId;
    }

    public void setKontaktId(int kontaktId) {
        this.kontaktId = kontaktId;
    }

    @Column(name = "adres_id", nullable = false)
    @Id
    public int getAdresId() {
        return adresId;
    }

    public void setAdresId(int adresId) {
        this.adresId = adresId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KlientEntityPK that = (KlientEntityPK) o;

        if (klientId != that.klientId) return false;
        if (kontaktId != that.kontaktId) return false;
        if (adresId != that.adresId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = klientId;
        result = 31 * result + kontaktId;
        result = 31 * result + adresId;
        return result;
    }
}
