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
@Table(name = "clasificacionproductor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clasificacionproductor.findAll", query = "SELECT c FROM Clasificacionproductor c"),
    @NamedQuery(name = "Clasificacionproductor.findByIdclasificacion", query = "SELECT c FROM Clasificacionproductor c WHERE c.idclasificacion = :idclasificacion"),
    @NamedQuery(name = "Clasificacionproductor.findByClasificacionproductor", query = "SELECT c FROM Clasificacionproductor c WHERE c.clasificacionproductor = :clasificacionproductor")})
public class Clasificacionproductor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idclasificacion")
    private Integer idclasificacion;
    @Size(max = 50)
    @Column(name = "clasificacionproductor")
    private String clasificacionproductor;
    @OneToMany(mappedBy = "idclasificacion")
    private Collection<Productor> productorCollection;

    public Clasificacionproductor() {
    }

    public Clasificacionproductor(Integer idclasificacion) {
        this.idclasificacion = idclasificacion;
    }

    public Integer getIdclasificacion() {
        return idclasificacion;
    }

    public void setIdclasificacion(Integer idclasificacion) {
        this.idclasificacion = idclasificacion;
    }

    public String getClasificacionproductor() {
        return clasificacionproductor;
    }

    public void setClasificacionproductor(String clasificacionproductor) {
        this.clasificacionproductor = clasificacionproductor;
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
        hash += (idclasificacion != null ? idclasificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clasificacionproductor)) {
            return false;
        }
        Clasificacionproductor other = (Clasificacionproductor) object;
        if ((this.idclasificacion == null && other.idclasificacion != null) || (this.idclasificacion != null && !this.idclasificacion.equals(other.idclasificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return clasificacionproductor;
    }
    
}
