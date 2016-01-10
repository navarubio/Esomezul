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
@Table(name = "estatus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estatus.findAll", query = "SELECT e FROM Estatus e"),
    @NamedQuery(name = "Estatus.findByIdestatus", query = "SELECT e FROM Estatus e WHERE e.idestatus = :idestatus"),
    @NamedQuery(name = "Estatus.findByEstatus", query = "SELECT e FROM Estatus e WHERE e.estatus = :estatus")})
public class Estatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idestatus")
    private Integer idestatus;
    @Size(max = 20)
    @Column(name = "estatus")
    private String estatus;
    @OneToMany(mappedBy = "idestatus")
    private Collection<Productor> productorCollection;

    public Estatus() {
    }

    public Estatus(Integer idestatus) {
        this.idestatus = idestatus;
    }

    public Integer getIdestatus() {
        return idestatus;
    }

    public void setIdestatus(Integer idestatus) {
        this.idestatus = idestatus;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    @XmlTransient
    public Collection<Productor> getProductorCollection() {
        return productorCollection;
    }

    public void setProductorCollection(Collection<Productor> productorCollection) {
        this.productorCollection = productorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestatus != null ? idestatus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estatus)) {
            return false;
        }
        Estatus other = (Estatus) object;
        if ((this.idestatus == null && other.idestatus != null) || (this.idestatus != null && !this.idestatus.equals(other.idestatus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return estatus;
    }
    
}
