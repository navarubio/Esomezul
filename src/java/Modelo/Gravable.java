/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SofiMar
 */
@Entity
@Table(name = "gravable")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gravable.findAll", query = "SELECT g FROM Gravable g"),
    @NamedQuery(name = "Gravable.findByIdgravable", query = "SELECT g FROM Gravable g WHERE g.idgravable = :idgravable"),
    @NamedQuery(name = "Gravable.findByPorcentajeravable", query = "SELECT g FROM Gravable g WHERE g.porcentajeravable = :porcentajeravable")})
public class Gravable implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idgravable")
    private Integer idgravable;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "porcentajeravable")
    private Double porcentajeravable;

    public Gravable() {
    }

    public Gravable(Integer idgravable) {
        this.idgravable = idgravable;
    }

    public Integer getIdgravable() {
        return idgravable;
    }

    public void setIdgravable(Integer idgravable) {
        this.idgravable = idgravable;
    }

    public Double getPorcentajeravable() {
        return porcentajeravable;
    }

    public void setPorcentajeravable(Double porcentajeravable) {
        this.porcentajeravable = porcentajeravable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgravable != null ? idgravable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gravable)) {
            return false;
        }
        Gravable other = (Gravable) object;
        if ((this.idgravable == null && other.idgravable != null) || (this.idgravable != null && !this.idgravable.equals(other.idgravable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Gravable[ idgravable=" + idgravable + " ]";
    }
    
}
