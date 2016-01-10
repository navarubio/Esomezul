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
@Table(name = "subgrupomaterial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subgrupomaterial.findAll", query = "SELECT s FROM Subgrupomaterial s"),
    @NamedQuery(name = "Subgrupomaterial.findByIdsubgrupomat", query = "SELECT s FROM Subgrupomaterial s WHERE s.idsubgrupomat = :idsubgrupomat"),
    @NamedQuery(name = "Subgrupomaterial.findBySubgrupo", query = "SELECT s FROM Subgrupomaterial s WHERE s.subgrupo = :subgrupo")})
public class Subgrupomaterial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idsubgrupomat")
    private Integer idsubgrupomat;
    @Size(max = 10)
    @Column(name = "subgrupo")
    private String subgrupo;

    public Subgrupomaterial() {
    }

    public Subgrupomaterial(Integer idsubgrupomat) {
        this.idsubgrupomat = idsubgrupomat;
    }

    public Integer getIdsubgrupomat() {
        return idsubgrupomat;
    }

    public void setIdsubgrupomat(Integer idsubgrupomat) {
        this.idsubgrupomat = idsubgrupomat;
    }

    public String getSubgrupo() {
        return subgrupo;
    }

    public void setSubgrupo(String subgrupo) {
        this.subgrupo = subgrupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsubgrupomat != null ? idsubgrupomat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subgrupomaterial)) {
            return false;
        }
        Subgrupomaterial other = (Subgrupomaterial) object;
        if ((this.idsubgrupomat == null && other.idsubgrupomat != null) || (this.idsubgrupomat != null && !this.idsubgrupomat.equals(other.idsubgrupomat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Subgrupomaterial[ idsubgrupomat=" + idsubgrupomat + " ]";
    }
    
}
