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
@Table(name = "grupomaterial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grupomaterial.findAll", query = "SELECT g FROM Grupomaterial g"),
    @NamedQuery(name = "Grupomaterial.findByIdgrupomat", query = "SELECT g FROM Grupomaterial g WHERE g.idgrupomat = :idgrupomat"),
    @NamedQuery(name = "Grupomaterial.findByGrupo", query = "SELECT g FROM Grupomaterial g WHERE g.grupo = :grupo")})
public class Grupomaterial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idgrupomat")
    private Integer idgrupomat;
    @Size(max = 20)
    @Column(name = "grupo")
    private String grupo;

    public Grupomaterial() {
    }

    public Grupomaterial(Integer idgrupomat) {
        this.idgrupomat = idgrupomat;
    }

    public Integer getIdgrupomat() {
        return idgrupomat;
    }

    public void setIdgrupomat(Integer idgrupomat) {
        this.idgrupomat = idgrupomat;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgrupomat != null ? idgrupomat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupomaterial)) {
            return false;
        }
        Grupomaterial other = (Grupomaterial) object;
        if ((this.idgrupomat == null && other.idgrupomat != null) || (this.idgrupomat != null && !this.idgrupomat.equals(other.idgrupomat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Grupomaterial[ idgrupomat=" + idgrupomat + " ]";
    }
    
}
