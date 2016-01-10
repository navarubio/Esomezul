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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SofiMar
 */
@Entity
@Table(name = "patio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patio.findAll", query = "SELECT p FROM Patio p"),
    @NamedQuery(name = "Patio.findByIdpatio", query = "SELECT p FROM Patio p WHERE p.idpatio = :idpatio"),
    @NamedQuery(name = "Patio.findByDescripcion", query = "SELECT p FROM Patio p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Patio.findByDireccion", query = "SELECT p FROM Patio p WHERE p.direccion = :direccion")})
public class Patio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpatio")
    private Integer idpatio;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 150)
    @Column(name = "direccion")
    private String direccion;
    @JoinColumn(name = "codigoproductor", referencedColumnName = "codigoproductor")
    @ManyToOne
    private Productor codigoproductor;
    @JoinColumn(name = "idparroquia", referencedColumnName = "idparroquia")
    @ManyToOne
    private Parroquia idparroquia;

    public Patio() {
    }

    public Patio(Integer idpatio) {
        this.idpatio = idpatio;
    }

    public Integer getIdpatio() {
        return idpatio;
    }

    public void setIdpatio(Integer idpatio) {
        this.idpatio = idpatio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Productor getCodigoproductor() {
        return codigoproductor;
    }

    public void setCodigoproductor(Productor codigoproductor) {
        this.codigoproductor = codigoproductor;
    }

    public Parroquia getIdparroquia() {
        return idparroquia;
    }

    public void setIdparroquia(Parroquia idparroquia) {
        this.idparroquia = idparroquia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpatio != null ? idpatio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patio)) {
            return false;
        }
        Patio other = (Patio) object;
        if ((this.idpatio == null && other.idpatio != null) || (this.idpatio != null && !this.idpatio.equals(other.idpatio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Patio[ idpatio=" + idpatio + " ]";
    }
    
}
