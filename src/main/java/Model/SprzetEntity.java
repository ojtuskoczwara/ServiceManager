package Model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Wojtek on 2018-04-02.
 */
@Entity
@Table(name = "t_sprzet", schema = "public", catalog = "ManagerSerwisu2")
public class SprzetEntity {
    @Id
    @GeneratedValue
    private int sprzetId;
    private String rodzaj;
    private String marka;
    private String model;
    private String numerSeryjny;
    private Collection<ZlecenieEntity> tZleceniesBySprzetId;

    @Id
    @Column(name = "sprzet_id", nullable = false)
    public int getSprzetId() {
        return sprzetId;
    }

    public void setSprzetId(int sprzetId) {
        this.sprzetId = sprzetId;
    }

    @Basic
    @Column(name = "rodzaj", nullable = false, length = 20)
    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    @Basic
    @Column(name = "marka", nullable = false, length = 20)
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Basic
    @Column(name = "model", nullable = true, length = 20)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "numer_seryjny", nullable = true, length = 40)
    public String getNumerSeryjny() {
        return numerSeryjny;
    }

    public void setNumerSeryjny(String numerSeryjny) {
        this.numerSeryjny = numerSeryjny;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SprzetEntity that = (SprzetEntity) o;

        if (sprzetId != that.sprzetId) return false;
        if (rodzaj != null ? !rodzaj.equals(that.rodzaj) : that.rodzaj != null) return false;
        if (marka != null ? !marka.equals(that.marka) : that.marka != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (numerSeryjny != null ? !numerSeryjny.equals(that.numerSeryjny) : that.numerSeryjny != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sprzetId;
        result = 31 * result + (rodzaj != null ? rodzaj.hashCode() : 0);
        result = 31 * result + (marka != null ? marka.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (numerSeryjny != null ? numerSeryjny.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tSprzetBySprzetId")
    public Collection<ZlecenieEntity> gettZleceniesBySprzetId() {
        return tZleceniesBySprzetId;
    }

    public void settZleceniesBySprzetId(Collection<ZlecenieEntity> tZleceniesBySprzetId) {
        this.tZleceniesBySprzetId = tZleceniesBySprzetId;
    }
}
