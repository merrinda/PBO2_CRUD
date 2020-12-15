/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_merri.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NANDA NAJWAN NOOR
 */
@Entity
@Table(name = "anggota")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Anggota.findAll", query = "SELECT a FROM Anggota a")
    , @NamedQuery(name = "Anggota.findByNik", query = "SELECT a FROM Anggota a WHERE a.nik = :nik")
    , @NamedQuery(name = "Anggota.findByNama", query = "SELECT a FROM Anggota a WHERE a.nama = :nama")
    , @NamedQuery(name = "Anggota.findByTtl", query = "SELECT a FROM Anggota a WHERE a.ttl = :ttl")
    , @NamedQuery(name = "Anggota.findByAgama", query = "SELECT a FROM Anggota a WHERE a.agama = :agama")
    , @NamedQuery(name = "Anggota.findByAlamat", query = "SELECT a FROM Anggota a WHERE a.alamat = :alamat")
    , @NamedQuery(name = "Anggota.findByGoldar", query = "SELECT a FROM Anggota a WHERE a.goldar = :goldar")
    , @NamedQuery(name = "Anggota.findByEmail", query = "SELECT a FROM Anggota a WHERE a.email = :email")
    , @NamedQuery(name = "Anggota.findByNoHp", query = "SELECT a FROM Anggota a WHERE a.noHp = :noHp")
    , @NamedQuery(name = "Anggota.findByStatus", query = "SELECT a FROM Anggota a WHERE a.status = :status")})
public class Anggota implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NIK")
    private String nik;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @Column(name = "ttl")
    private String ttl;
    @Basic(optional = false)
    @Column(name = "agama")
    private String agama;
    @Basic(optional = false)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "goldar")
    private String goldar;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "no_hp")
    private String noHp;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;

    public Anggota() {
    }

    public Anggota(String nik) {
        this.nik = nik;
    }

    public Anggota(String nik, String nama, String ttl, String agama, String alamat, String goldar, String email, String noHp, String status) {
        this.nik = nik;
        this.nama = nama;
        this.ttl = ttl;
        this.agama = agama;
        this.alamat = alamat;
        this.goldar = goldar;
        this.email = email;
        this.noHp = noHp;
        this.status = status;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getGoldar() {
        return goldar;
    }

    public void setGoldar(String goldar) {
        this.goldar = goldar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nik != null ? nik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anggota)) {
            return false;
        }
        Anggota other = (Anggota) object;
        if ((this.nik == null && other.nik != null) || (this.nik != null && !this.nik.equals(other.nik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project_merri.models.Anggota[ nik=" + nik + " ]";
    }
    
}
