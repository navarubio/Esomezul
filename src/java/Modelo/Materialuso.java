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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SofiMar
 */
@Entity
@Table(name = "materialuso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materialuso.findAll", query = "SELECT m FROM Materialuso m"),
    @NamedQuery(name = "Materialuso.findByIdmaterialuso", query = "SELECT m FROM Materialuso m WHERE m.idmaterialuso = :idmaterialuso")})
public class Materialuso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmaterialuso")
    private Integer idmaterialuso;
    @JoinColumn(name = "idmaterial", referencedColumnName = "idmaterial")
    @ManyToOne
    private Material idmaterial;
    @JoinColumn(name = "idcriteriouso", referencedColumnName = "idcriteriouso")
    @ManyToOne
    private Criteriouso idcriteriouso;

    public Materialuso() {
    }

    public Materialuso(Integer idmaterialuso) {
        this.idmaterialuso = idmaterialuso;
    }

    public Integer getIdmaterialuso() {
        return idmaterialuso;
    }

    public void setIdmaterialuso(Integer idmaterialuso) {
        this.idmaterialuso = idmaterialuso;
    }

    public Material getIdmaterial() {
        return idmaterial;
    }

    public void setIdmaterial(Material idmaterial) {
        this.idmaterial = idmaterial;
    }

    public Criteriouso getIdcriteriouso() {
        return idcriteriouso;
    }

    public void setIdcriteriouso(Criteriouso idcriteriouso) {
        this.idcriteriouso = idcriteriouso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmaterialuso != null ? idmaterialuso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materialuso)) {
            return false;
        }
        Materialuso other = (Materialuso) object;
        if ((this.idmaterialuso == null && other.idmaterialuso != null) || (this.idmaterialuso != null && !this.idmaterialuso.equals(other.idmaterialuso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Materialuso[ idmaterialuso=" + idmaterialuso + " ]";
    }
    
}
