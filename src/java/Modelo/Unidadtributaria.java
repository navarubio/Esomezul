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
@Table(name = "unidadtributaria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidadtributaria.findAll", query = "SELECT u FROM Unidadtributaria u"),
    @NamedQuery(name = "Unidadtributaria.findByIdunidad", query = "SELECT u FROM Unidadtributaria u WHERE u.idunidad = :idunidad"),
    @NamedQuery(name = "Unidadtributaria.findByAnio", query = "SELECT u FROM Unidadtributaria u WHERE u.anio = :anio"),
    @NamedQuery(name = "Unidadtributaria.findByMonto", query = "SELECT u FROM Unidadtributaria u WHERE u.monto = :monto")})
public class Unidadtributaria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idunidad")
    private Integer idunidad;
    @Column(name = "anio")
    private Integer anio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto")
    private Double monto;

    public Unidadtributaria() {
    }

    public Unidadtributaria(Integer idunidad) {
        this.idunidad = idunidad;
    }

    public Integer getIdunidad() {
        return idunidad;
    }

    public void setIdunidad(Integer idunidad) {
        this.idunidad = idunidad;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idunidad != null ? idunidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidadtributaria)) {
            return false;
        }
        Unidadtributaria other = (Unidadtributaria) object;
        if ((this.idunidad == null && other.idunidad != null) || (this.idunidad != null && !this.idunidad.equals(other.idunidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Unidadtributaria[ idunidad=" + idunidad + " ]";
    }
    
}
