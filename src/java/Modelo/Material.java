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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "material")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Material.findAll", query = "SELECT m FROM Material m"),
    @NamedQuery(name = "Material.findByIdmaterial", query = "SELECT m FROM Material m WHERE m.idmaterial = :idmaterial"),
    @NamedQuery(name = "Material.findByIdgrupomat", query = "SELECT m FROM Material m WHERE m.idgrupomat = :idgrupomat"),
    @NamedQuery(name = "Material.findByIdsubgrupomat", query = "SELECT m FROM Material m WHERE m.idsubgrupomat = :idsubgrupomat"),
    @NamedQuery(name = "Material.findByIdespecificomat", query = "SELECT m FROM Material m WHERE m.idespecificomat = :idespecificomat"),
    @NamedQuery(name = "Material.findByIdsubespecificomat", query = "SELECT m FROM Material m WHERE m.idsubespecificomat = :idsubespecificomat"),
    @NamedQuery(name = "Material.findByIdgravable", query = "SELECT m FROM Material m WHERE m.idgravable = :idgravable"),
    @NamedQuery(name = "Material.findByIdprecio", query = "SELECT m FROM Material m WHERE m.idprecio = :idprecio"),
    @NamedQuery(name = "Material.findByDescripcionmaterial", query = "SELECT m FROM Material m WHERE m.descripcionmaterial = :descripcionmaterial")})
public class Material implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmaterial")
    private Integer idmaterial;
    @Column(name = "idgrupomat")
    private Integer idgrupomat;
    @Column(name = "idsubgrupomat")
    private Integer idsubgrupomat;
    @Column(name = "idespecificomat")
    private Integer idespecificomat;
    @Column(name = "idsubespecificomat")
    private Integer idsubespecificomat;
    @Column(name = "idgravable")
    private Integer idgravable;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "idprecio")
    private Double idprecio;
    @Size(max = 20)
    @Column(name = "descripcionmaterial")
    private String descripcionmaterial;
    @OneToMany(mappedBy = "idmaterial")
    private Collection<Materialuso> materialusoCollection;
    @OneToMany(mappedBy = "idmaterial")
    private Collection<Yacimientomaterial> yacimientomaterialCollection;
    @JoinColumn(name = "idcriterioproceso", referencedColumnName = "idcriterioproceso")
    @ManyToOne
    private Criterioproceso idcriterioproceso;

    public Material() {
    }

    public Material(Integer idmaterial) {
        this.idmaterial = idmaterial;
    }

    public Integer getIdmaterial() {
        return idmaterial;
    }

    public void setIdmaterial(Integer idmaterial) {
        this.idmaterial = idmaterial;
    }

    public Integer getIdgrupomat() {
        return idgrupomat;
    }

    public void setIdgrupomat(Integer idgrupomat) {
        this.idgrupomat = idgrupomat;
    }

    public Integer getIdsubgrupomat() {
        return idsubgrupomat;
    }

    public void setIdsubgrupomat(Integer idsubgrupomat) {
        this.idsubgrupomat = idsubgrupomat;
    }

    public Integer getIdespecificomat() {
        return idespecificomat;
    }

    public void setIdespecificomat(Integer idespecificomat) {
        this.idespecificomat = idespecificomat;
    }

    public Integer getIdsubespecificomat() {
        return idsubespecificomat;
    }

    public void setIdsubespecificomat(Integer idsubespecificomat) {
        this.idsubespecificomat = idsubespecificomat;
    }

    public Integer getIdgravable() {
        return idgravable;
    }

    public void setIdgravable(Integer idgravable) {
        this.idgravable = idgravable;
    }

    public Double getIdprecio() {
        return idprecio;
    }

    public void setIdprecio(Double idprecio) {
        this.idprecio = idprecio;
    }

    public String getDescripcionmaterial() {
        return descripcionmaterial;
    }

    public void setDescripcionmaterial(String descripcionmaterial) {
        this.descripcionmaterial = descripcionmaterial;
    }

    @XmlTransient
    public Collection<Materialuso> getMaterialusoCollection() {
        return materialusoCollection;
    }

    public void setMaterialusoCollection(Collection<Materialuso> materialusoCollection) {
        this.materialusoCollection = materialusoCollection;
    }

    @XmlTransient
    public Collection<Yacimientomaterial> getYacimientomaterialCollection() {
        return yacimientomaterialCollection;
    }

    public void setYacimientomaterialCollection(Collection<Yacimientomaterial> yacimientomaterialCollection) {
        this.yacimientomaterialCollection = yacimientomaterialCollection;
    }

    public Criterioproceso getIdcriterioproceso() {
        return idcriterioproceso;
    }

    public void setIdcriterioproceso(Criterioproceso idcriterioproceso) {
        this.idcriterioproceso = idcriterioproceso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmaterial != null ? idmaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Material)) {
            return false;
        }
        Material other = (Material) object;
        if ((this.idmaterial == null && other.idmaterial != null) || (this.idmaterial != null && !this.idmaterial.equals(other.idmaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Material[ idmaterial=" + idmaterial + " ]";
    }
    
}
