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
@Table(name = "criteriouso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Criteriouso.findAll", query = "SELECT c FROM Criteriouso c"),
    @NamedQuery(name = "Criteriouso.findByIdcriteriouso", query = "SELECT c FROM Criteriouso c WHERE c.idcriteriouso = :idcriteriouso"),
    @NamedQuery(name = "Criteriouso.findByUso", query = "SELECT c FROM Criteriouso c WHERE c.uso = :uso")})
public class Criteriouso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcriteriouso")
    private Integer idcriteriouso;
    @Size(max = 100)
    @Column(name = "uso")
    private String uso;
    @OneToMany(mappedBy = "idcriteriouso")
    private Collection<Materialuso> materialusoCollection;

    public Criteriouso() {
    }

    public Criteriouso(Integer idcriteriouso) {
        this.idcriteriouso = idcriteriouso;
    }

    public Integer getIdcriteriouso() {
        return idcriteriouso;
    }

    public void setIdcriteriouso(Integer idcriteriouso) {
        this.idcriteriouso = idcriteriouso;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @XmlTransient
    public Collection<Materialuso> getMaterialusoCollection() {
        return materialusoCollection;
    }

    public void setMaterialusoCollection(Collection<Materialuso> materialusoCollection) {
        this.materialusoCollection = materialusoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcriteriouso != null ? idcriteriouso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Criteriouso)) {
            return false;
        }
        Criteriouso other = (Criteriouso) object;
        if ((this.idcriteriouso == null && other.idcriteriouso != null) || (this.idcriteriouso != null && !this.idcriteriouso.equals(other.idcriteriouso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Criteriouso[ idcriteriouso=" + idcriteriouso + " ]";
    }
    
}
