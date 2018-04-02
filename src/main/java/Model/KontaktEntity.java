package Model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Wojtek on 2018-04-02.
 */
@Entity
@Table(name = "t_kontakt", schema = "public", catalog = "ManagerSerwisu2")
public class KontaktEntity {
    private int kontaktId;
    private String numerKontaktowy;
    private String email;
    private Collection<KlientEntity> tKlientsByKontaktId;
    private Collection<ZlecenieEntity> tZleceniesByKontaktId;

    @Id
    @Column(name = "kontakt_id", nullable = false)
    public int getKontaktId() {
        return kontaktId;
    }

    public void setKontaktId(int kontaktId) {
        this.kontaktId = kontaktId;
    }

    @Basic
    @Column(name = "numer_kontaktowy", nullable = false, length = 15)
    public String getNumerKontaktowy() {
        return numerKontaktowy;
    }

    public void setNumerKontaktowy(String numerKontaktowy) {
        this.numerKontaktowy = numerKontaktowy;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KontaktEntity that = (KontaktEntity) o;

        if (kontaktId != that.kontaktId) return false;
        if (numerKontaktowy != null ? !numerKontaktowy.equals(that.numerKontaktowy) : that.numerKontaktowy != null)
            return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kontaktId;
        result = 31 * result + (numerKontaktowy != null ? numerKontaktowy.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tKontaktByKontaktId")
    public Collection<KlientEntity> gettKlientsByKontaktId() {
        return tKlientsByKontaktId;
    }

    public void settKlientsByKontaktId(Collection<KlientEntity> tKlientsByKontaktId) {
        this.tKlientsByKontaktId = tKlientsByKontaktId;
    }

    @OneToMany(mappedBy = "tKontaktByKontaktId")
    public Collection<ZlecenieEntity> gettZleceniesByKontaktId() {
        return tZleceniesByKontaktId;
    }

    public void settZleceniesByKontaktId(Collection<ZlecenieEntity> tZleceniesByKontaktId) {
        this.tZleceniesByKontaktId = tZleceniesByKontaktId;
    }
}
