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
@Table(name = "yacimientomaterial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Yacimientomaterial.findAll", query = "SELECT y FROM Yacimientomaterial y"),
    @NamedQuery(name = "Yacimientomaterial.findByIdyacimientomaterial", query = "SELECT y FROM Yacimientomaterial y WHERE y.idyacimientomaterial = :idyacimientomaterial")})
public class Yacimientomaterial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idyacimientomaterial")
    private Integer idyacimientomaterial;
    @JoinColumn(name = "idyacimiento", referencedColumnName = "codigoyacimiento")
    @ManyToOne
    private Yacimiento idyacimiento;
    @JoinColumn(name = "idmaterial", referencedColumnName = "idmaterial")
    @ManyToOne
    private Material idmaterial;

    public Yacimientomaterial() {
    }

    public Yacimientomaterial(Integer idyacimientomaterial) {
        this.idyacimientomaterial = idyacimientomaterial;
    }

    public Integer getIdyacimientomaterial() {
        return idyacimientomaterial;
    }

    public void setIdyacimientomaterial(Integer idyacimientomaterial) {
        this.idyacimientomaterial = idyacimientomaterial;
    }

    public Yacimiento getIdyacimiento() {
        return idyacimiento;
    }

    public void setIdyacimiento(Yacimiento idyacimiento) {
        this.idyacimiento = idyacimiento;
    }

    public Material getIdmaterial() {
        return idmaterial;
    }

    public void setIdmaterial(Material idmaterial) {
        this.idmaterial = idmaterial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idyacimientomaterial != null ? idyacimientomaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Yacimientomaterial)) {
            return false;
        }
        Yacimientomaterial other = (Yacimientomaterial) object;
        if ((this.idyacimientomaterial == null && other.idyacimientomaterial != null) || (this.idyacimientomaterial != null && !this.idyacimientomaterial.equals(other.idyacimientomaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Yacimientomaterial[ idyacimientomaterial=" + idyacimientomaterial + " ]";
    }
    
}
