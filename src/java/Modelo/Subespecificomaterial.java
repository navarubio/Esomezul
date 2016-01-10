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
@Table(name = "subespecificomaterial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subespecificomaterial.findAll", query = "SELECT s FROM Subespecificomaterial s"),
    @NamedQuery(name = "Subespecificomaterial.findByIdsubespecificomat", query = "SELECT s FROM Subespecificomaterial s WHERE s.idsubespecificomat = :idsubespecificomat"),
    @NamedQuery(name = "Subespecificomaterial.findBySubespecificomat", query = "SELECT s FROM Subespecificomaterial s WHERE s.subespecificomat = :subespecificomat")})
public class Subespecificomaterial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idsubespecificomat")
    private Integer idsubespecificomat;
    @Size(max = 10)
    @Column(name = "subespecificomat")
    private String subespecificomat;

    public Subespecificomaterial() {
    }

    public Subespecificomaterial(Integer idsubespecificomat) {
        this.idsubespecificomat = idsubespecificomat;
    }

    public Integer getIdsubespecificomat() {
        return idsubespecificomat;
    }

    public void setIdsubespecificomat(Integer idsubespecificomat) {
        this.idsubespecificomat = idsubespecificomat;
    }

    public String getSubespecificomat() {
        return subespecificomat;
    }

    public void setSubespecificomat(String subespecificomat) {
        this.subespecificomat = subespecificomat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsubespecificomat != null ? idsubespecificomat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subespecificomaterial)) {
            return false;
        }
        Subespecificomaterial other = (Subespecificomaterial) object;
        if ((this.idsubespecificomat == null && other.idsubespecificomat != null) || (this.idsubespecificomat != null && !this.idsubespecificomat.equals(other.idsubespecificomat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Subespecificomaterial[ idsubespecificomat=" + idsubespecificomat + " ]";
    }
    
}
