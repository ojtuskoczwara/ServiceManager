package Model;

import javax.persistence.*;

/**
 * Created by Wojtek on 2018-04-02.
 */
@Entity
@Table(name = "t_klient", schema = "public", catalog = "ManagerSerwisu2")
@IdClass(KlientEntityPK.class)
public class KlientEntity {
    private int klientId;
    private String imie;
    private String nazwisko;
    private String firma;
    private int kontaktId;
    private int adresId;
    private KontaktEntity tKontaktByKontaktId;
    private AdresEntity tAdresByAdresId;

    @Id
    @Column(name = "klient_id", nullable = false)
    public int getKlientId() {
        return klientId;
    }

    public void setKlientId(int klientId) {
        this.klientId = klientId;
    }

    @Basic
    @Column(name = "imie", nullable = true, length = 20)
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Basic
    @Column(name = "nazwisko", nullable = true, length = 30)
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Basic
    @Column(name = "firma", nullable = true, length = 40)
    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    @Id
    @Column(name = "kontakt_id", nullable = false)
    public int getKontaktId() {
        return kontaktId;
    }

    public void setKontaktId(int kontaktId) {
        this.kontaktId = kontaktId;
    }

    @Id
    @Column(name = "adres_id", nullable = false)
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

        KlientEntity that = (KlientEntity) o;

        if (klientId != that.klientId) return false;
        if (kontaktId != that.kontaktId) return false;
        if (adresId != that.adresId) return false;
        if (imie != null ? !imie.equals(that.imie) : that.imie != null) return false;
        if (nazwisko != null ? !nazwisko.equals(that.nazwisko) : that.nazwisko != null) return false;
        if (firma != null ? !firma.equals(that.firma) : that.firma != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = klientId;
        result = 31 * result + (imie != null ? imie.hashCode() : 0);
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + (firma != null ? firma.hashCode() : 0);
        result = 31 * result + kontaktId;
        result = 31 * result + adresId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "kontakt_id", referencedColumnName = "kontakt_id", nullable = false)
    public KontaktEntity gettKontaktByKontaktId() {
        return tKontaktByKontaktId;
    }

    public void settKontaktByKontaktId(KontaktEntity tKontaktByKontaktId) {
        this.tKontaktByKontaktId = tKontaktByKontaktId;
    }

    @ManyToOne
    @JoinColumn(name = "adres_id", referencedColumnName = "adres_id", nullable = false)
    public AdresEntity gettAdresByAdresId() {
        return tAdresByAdresId;
    }

    public void settAdresByAdresId(AdresEntity tAdresByAdresId) {
        this.tAdresByAdresId = tAdresByAdresId;
    }
}
