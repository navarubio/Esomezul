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
@Table(name = "transporte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transporte.findAll", query = "SELECT t FROM Transporte t"),
    @NamedQuery(name = "Transporte.findByIdtransporte", query = "SELECT t FROM Transporte t WHERE t.idtransporte = :idtransporte"),
    @NamedQuery(name = "Transporte.findByTransporte", query = "SELECT t FROM Transporte t WHERE t.transporte = :transporte")})
public class Transporte implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtransporte")
    private Integer idtransporte;
    @Size(max = 20)
    @Column(name = "transporte")
    private String transporte;
    @OneToMany(mappedBy = "idtransporte")
    private Collection<Productor> productorCollection;

    public Transporte() {
    }

    public Transporte(Integer idtransporte) {
        this.idtransporte = idtransporte;
    }

    public Integer getIdtransporte() {
        return idtransporte;
    }

    public void setIdtransporte(Integer idtransporte) {
        this.idtransporte = idtransporte;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
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
        hash += (idtransporte != null ? idtransporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transporte)) {
            return false;
        }
        Transporte other = (Transporte) object;
        if ((this.idtransporte == null && other.idtransporte != null) || (this.idtransporte != null && !this.idtransporte.equals(other.idtransporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Transporte[ idtransporte=" + idtransporte + " ]";
    }
    
}
