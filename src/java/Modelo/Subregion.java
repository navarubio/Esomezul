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
@Table(name = "subregion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subregion.findAll", query = "SELECT s FROM Subregion s"),
    @NamedQuery(name = "Subregion.findByIdsubregion", query = "SELECT s FROM Subregion s WHERE s.idsubregion = :idsubregion"),
    @NamedQuery(name = "Subregion.findBySubregion", query = "SELECT s FROM Subregion s WHERE s.subregion = :subregion")})
public class Subregion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idsubregion")
    private Integer idsubregion;
    @Size(max = 20)
    @Column(name = "subregion")
    private String subregion;
    @OneToMany(mappedBy = "idsubregion")
    private Collection<Municipio> municipioCollection;

    public Subregion() {
    }

    public Subregion(Integer idsubregion) {
        this.idsubregion = idsubregion;
    }

    public Integer getIdsubregion() {
        return idsubregion;
    }

    public void setIdsubregion(Integer idsubregion) {
        this.idsubregion = idsubregion;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    @XmlTransient
    public Collection<Municipio> getMunicipioCollection() {
        return municipioCollection;
    }

    public void setMunicipioCollection(Collection<Municipio> municipioCollection) {
        this.municipioCollection = municipioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsubregion != null ? idsubregion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subregion)) {
            return false;
        }
        Subregion other = (Subregion) object;
        if ((this.idsubregion == null && other.idsubregion != null) || (this.idsubregion != null && !this.idsubregion.equals(other.idsubregion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Subregion[ idsubregion=" + idsubregion + " ]";
    }
    
}
