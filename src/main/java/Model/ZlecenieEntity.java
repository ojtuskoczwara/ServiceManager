package Model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Wojtek on 2018-04-02.
 */
@Entity
@Table(name = "t_zlecenie", schema = "public", catalog = "ManagerSerwisu2")
public class ZlecenieEntity {
    private int zlecenieId;
    private String klientNazwaSkrocona;
    private String klientOpisProblemu;
    private String serwisOpisUsterki;
    private String serwisOpisWykonanychPrac;
    private Date dataPrzyjecia;
    private Date dataWykonaniaUslugi;
    private Date dataWydania;
    private Boolean zaplacone;
    private String zgloszenieNumer;
    private KontaktEntity tKontaktByKontaktId;
    private SprzetEntity tSprzetBySprzetId;

    @Id
    @Column(name = "zlecenie_id", nullable = false)
    public int getZlecenieId() {
        return zlecenieId;
    }

    public void setZlecenieId(int zlecenieId) {
        this.zlecenieId = zlecenieId;
    }

    @Basic
    @Column(name = "klient_nazwa_skrocona", nullable = false, length = 30)
    public String getKlientNazwaSkrocona() {
        return klientNazwaSkrocona;
    }

    public void setKlientNazwaSkrocona(String klientNazwaSkrocona) {
        this.klientNazwaSkrocona = klientNazwaSkrocona;
    }

    @Basic
    @Column(name = "klient_opis_problemu", nullable = true, length = -1)
    public String getKlientOpisProblemu() {
        return klientOpisProblemu;
    }

    public void setKlientOpisProblemu(String klientOpisProblemu) {
        this.klientOpisProblemu = klientOpisProblemu;
    }

    @Basic
    @Column(name = "serwis_opis_usterki", nullable = true, length = -1)
    public String getSerwisOpisUsterki() {
        return serwisOpisUsterki;
    }

    public void setSerwisOpisUsterki(String serwisOpisUsterki) {
        this.serwisOpisUsterki = serwisOpisUsterki;
    }

    @Basic
    @Column(name = "serwis_opis_wykonanych_prac", nullable = true, length = -1)
    public String getSerwisOpisWykonanychPrac() {
        return serwisOpisWykonanychPrac;
    }

    public void setSerwisOpisWykonanychPrac(String serwisOpisWykonanychPrac) {
        this.serwisOpisWykonanychPrac = serwisOpisWykonanychPrac;
    }

    @Basic
    @Column(name = "data_przyjecia", nullable = false)
    public Date getDataPrzyjecia() {
        return dataPrzyjecia;
    }

    public void setDataPrzyjecia(Date dataPrzyjecia) {
        this.dataPrzyjecia = dataPrzyjecia;
    }

    @Basic
    @Column(name = "data_wykonania_uslugi", nullable = true)
    public Date getDataWykonaniaUslugi() {
        return dataWykonaniaUslugi;
    }

    public void setDataWykonaniaUslugi(Date dataWykonaniaUslugi) {
        this.dataWykonaniaUslugi = dataWykonaniaUslugi;
    }

    @Basic
    @Column(name = "data_wydania", nullable = true)
    public Date getDataWydania() {
        return dataWydania;
    }

    public void setDataWydania(Date dataWydania) {
        this.dataWydania = dataWydania;
    }

    @Basic
    @Column(name = "zaplacone", nullable = true)
    public Boolean getZaplacone() {
        return zaplacone;
    }

    public void setZaplacone(Boolean zaplacone) {
        this.zaplacone = zaplacone;
    }

    @Basic
    @Column(name = "zgloszenie_numer", nullable = true, length = 15)
    public String getZgloszenieNumer() {
        return zgloszenieNumer;
    }

    public void setZgloszenieNumer(String zgloszenieNumer) {
        this.zgloszenieNumer = zgloszenieNumer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ZlecenieEntity that = (ZlecenieEntity) o;

        if (zlecenieId != that.zlecenieId) return false;
        if (klientNazwaSkrocona != null ? !klientNazwaSkrocona.equals(that.klientNazwaSkrocona) : that.klientNazwaSkrocona != null)
            return false;
        if (klientOpisProblemu != null ? !klientOpisProblemu.equals(that.klientOpisProblemu) : that.klientOpisProblemu != null)
            return false;
        if (serwisOpisUsterki != null ? !serwisOpisUsterki.equals(that.serwisOpisUsterki) : that.serwisOpisUsterki != null)
            return false;
        if (serwisOpisWykonanychPrac != null ? !serwisOpisWykonanychPrac.equals(that.serwisOpisWykonanychPrac) : that.serwisOpisWykonanychPrac != null)
            return false;
        if (dataPrzyjecia != null ? !dataPrzyjecia.equals(that.dataPrzyjecia) : that.dataPrzyjecia != null)
            return false;
        if (dataWykonaniaUslugi != null ? !dataWykonaniaUslugi.equals(that.dataWykonaniaUslugi) : that.dataWykonaniaUslugi != null)
            return false;
        if (dataWydania != null ? !dataWydania.equals(that.dataWydania) : that.dataWydania != null) return false;
        if (zaplacone != null ? !zaplacone.equals(that.zaplacone) : that.zaplacone != null) return false;
        if (zgloszenieNumer != null ? !zgloszenieNumer.equals(that.zgloszenieNumer) : that.zgloszenieNumer != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zlecenieId;
        result = 31 * result + (klientNazwaSkrocona != null ? klientNazwaSkrocona.hashCode() : 0);
        result = 31 * result + (klientOpisProblemu != null ? klientOpisProblemu.hashCode() : 0);
        result = 31 * result + (serwisOpisUsterki != null ? serwisOpisUsterki.hashCode() : 0);
        result = 31 * result + (serwisOpisWykonanychPrac != null ? serwisOpisWykonanychPrac.hashCode() : 0);
        result = 31 * result + (dataPrzyjecia != null ? dataPrzyjecia.hashCode() : 0);
        result = 31 * result + (dataWykonaniaUslugi != null ? dataWykonaniaUslugi.hashCode() : 0);
        result = 31 * result + (dataWydania != null ? dataWydania.hashCode() : 0);
        result = 31 * result + (zaplacone != null ? zaplacone.hashCode() : 0);
        result = 31 * result + (zgloszenieNumer != null ? zgloszenieNumer.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "kontakt_id", referencedColumnName = "kontakt_id")
    public KontaktEntity gettKontaktByKontaktId() {
        return tKontaktByKontaktId;
    }

    public void settKontaktByKontaktId(KontaktEntity tKontaktByKontaktId) {
        this.tKontaktByKontaktId = tKontaktByKontaktId;
    }

    @ManyToOne
    @JoinColumn(name = "sprzet_id", referencedColumnName = "sprzet_id")
    public SprzetEntity gettSprzetBySprzetId() {
        return tSprzetBySprzetId;
    }

    public void settSprzetBySprzetId(SprzetEntity tSprzetBySprzetId) {
        this.tSprzetBySprzetId = tSprzetBySprzetId;
    }
}
