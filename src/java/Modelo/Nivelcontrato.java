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
@Table(name = "nivelcontrato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nivelcontrato.findAll", query = "SELECT n FROM Nivelcontrato n"),
    @NamedQuery(name = "Nivelcontrato.findByIdnivelcontrato", query = "SELECT n FROM Nivelcontrato n WHERE n.idnivelcontrato = :idnivelcontrato"),
    @NamedQuery(name = "Nivelcontrato.findByDescripcionnivel", query = "SELECT n FROM Nivelcontrato n WHERE n.descripcionnivel = :descripcionnivel")})
public class Nivelcontrato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idnivelcontrato")
    private Integer idnivelcontrato;
    @Size(max = 15)
    @Column(name = "descripcionnivel")
    private String descripcionnivel;
    @OneToMany(mappedBy = "idnivelcontrato")
    private Collection<Productor> productorCollection;

    public Nivelcontrato() {
    }

    public Nivelcontrato(Integer idnivelcontrato) {
        this.idnivelcontrato = idnivelcontrato;
    }

    public Integer getIdnivelcontrato() {
        return idnivelcontrato;
    }

    public void setIdnivelcontrato(Integer idnivelcontrato) {
        this.idnivelcontrato = idnivelcontrato;
    }

    public String getDescripcionnivel() {
        return descripcionnivel;
    }

    public void setDescripcionnivel(String descripcionnivel) {
        this.descripcionnivel = descripcionnivel;
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
        hash += (idnivelcontrato != null ? idnivelcontrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nivelcontrato)) {
            return false;
        }
        Nivelcontrato other = (Nivelcontrato) object;
        if ((this.idnivelcontrato == null && other.idnivelcontrato != null) || (this.idnivelcontrato != null && !this.idnivelcontrato.equals(other.idnivelcontrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descripcionnivel;
    }
    
}
