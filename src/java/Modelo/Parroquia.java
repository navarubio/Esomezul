/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SofiMar
 */
@Entity
@Table(name = "parroquia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parroquia.findAll", query = "SELECT p FROM Parroquia p"),
    @NamedQuery(name = "Parroquia.findByIdparroquia", query = "SELECT p FROM Parroquia p WHERE p.idparroquia = :idparroquia"),
    @NamedQuery(name = "Parroquia.findByParroquia", query = "SELECT p FROM Parroquia p WHERE p.parroquia = :parroquia")})
public class Parroquia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idparroquia")
    private Integer idparroquia;
    @Size(max = 50)
    @Column(name = "parroquia")
    private String parroquia;
    @OneToMany(mappedBy = "idparroquia")
    private Collection<Yacimiento> yacimientoCollection;
    @OneToMany(mappedBy = "idparroquia")
    private Collection<Patio> patioCollection;
    @JoinColumn(name = "idmunicipio", referencedColumnName = "idmunicipio")
    @ManyToOne
    private Municipio idmunicipio;

    public Parroquia() {
    }

    public Parroquia(Integer idparroquia) {
        this.idparroquia = idparroquia;
    }

    public Integer getIdparroquia() {
        return idparroquia;
    }

    public void setIdparroquia(Integer idparroquia) {
        this.idparroquia = idparroquia;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    @XmlTransient
    public Collection<Yacimiento> getYacimientoCollection() {
        return yacimientoCollection;
    }

    public void setYacimientoCollection(Collection<Yacimiento> yacimientoCollection) {
        this.yacimientoCollection = yacimientoCollection;
    }

    @XmlTransient
    public Collection<Patio> getPatioCollection() {
        return patioCollection;
    }

    public void setPatioCollection(Collection<Patio> patioCollection) {
        this.patioCollection = patioCollection;
    }

    public Municipio getIdmunicipio() {
        return idmunicipio;
    }

    public void setIdmunicipio(Municipio idmunicipio) {
        this.idmunicipio = idmunicipio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idparroquia != null ? idparroquia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parroquia)) {
            return false;
        }
        Parroquia other = (Parroquia) object;
        if ((this.idparroquia == null && other.idparroquia != null) || (this.idparroquia != null && !this.idparroquia.equals(other.idparroquia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Parroquia[ idparroquia=" + idparroquia + " ]";
    }
    
}
