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
@Table(name = "criterioproceso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Criterioproceso.findAll", query = "SELECT c FROM Criterioproceso c"),
    @NamedQuery(name = "Criterioproceso.findByIdcriterioproceso", query = "SELECT c FROM Criterioproceso c WHERE c.idcriterioproceso = :idcriterioproceso"),
    @NamedQuery(name = "Criterioproceso.findByProcesoproductivo", query = "SELECT c FROM Criterioproceso c WHERE c.procesoproductivo = :procesoproductivo")})
public class Criterioproceso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcriterioproceso")
    private Integer idcriterioproceso;
    @Size(max = 100)
    @Column(name = "procesoproductivo")
    private String procesoproductivo;
    @OneToMany(mappedBy = "idcriterioproceso")
    private Collection<Material> materialCollection;
    @OneToMany(mappedBy = "idcriterioproceso")
    private Collection<Productor> productorCollection;

    public Criterioproceso() {
    }

    public Criterioproceso(Integer idcriterioproceso) {
        this.idcriterioproceso = idcriterioproceso;
    }

    public Integer getIdcriterioproceso() {
        return idcriterioproceso;
    }

    public void setIdcriterioproceso(Integer idcriterioproceso) {
        this.idcriterioproceso = idcriterioproceso;
    }

    public String getProcesoproductivo() {
        return procesoproductivo;
    }

    public void setProcesoproductivo(String procesoproductivo) {
        this.procesoproductivo = procesoproductivo;
    }

    @XmlTransient
    public Collection<Material> getMaterialCollection() {
        return materialCollection;
    }

    public void setMaterialCollection(Collection<Material> materialCollection) {
        this.materialCollection = materialCollection;
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
        hash += (idcriterioproceso != null ? idcriterioproceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Criterioproceso)) {
            return false;
        }
        Criterioproceso other = (Criterioproceso) object;
        if ((this.idcriterioproceso == null && other.idcriterioproceso != null) || (this.idcriterioproceso != null && !this.idcriterioproceso.equals(other.idcriterioproceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Criterioproceso[ idcriterioproceso=" + idcriterioproceso + " ]";
    }
    
}
