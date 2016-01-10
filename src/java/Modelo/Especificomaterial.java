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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SofiMar
 */
@Entity
@Table(name = "especificomaterial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Especificomaterial.findAll", query = "SELECT e FROM Especificomaterial e"),
    @NamedQuery(name = "Especificomaterial.findByIdespecificomat", query = "SELECT e FROM Especificomaterial e WHERE e.idespecificomat = :idespecificomat"),
    @NamedQuery(name = "Especificomaterial.findByEspecifico", query = "SELECT e FROM Especificomaterial e WHERE e.especifico = :especifico")})
public class Especificomaterial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idespecificomat")
    private Integer idespecificomat;
    @Size(max = 20)
    @Column(name = "especifico")
    private String especifico;

    public Especificomaterial() {
    }

    public Especificomaterial(Integer idespecificomat) {
        this.idespecificomat = idespecificomat;
    }

    public Integer getIdespecificomat() {
        return idespecificomat;
    }

    public void setIdespecificomat(Integer idespecificomat) {
        this.idespecificomat = idespecificomat;
    }

    public String getEspecifico() {
        return especifico;
    }

    public void setEspecifico(String especifico) {
        this.especifico = especifico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idespecificomat != null ? idespecificomat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especificomaterial)) {
            return false;
        }
        Especificomaterial other = (Especificomaterial) object;
        if ((this.idespecificomat == null && other.idespecificomat != null) || (this.idespecificomat != null && !this.idespecificomat.equals(other.idespecificomat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Especificomaterial[ idespecificomat=" + idespecificomat + " ]";
    }
    
}
