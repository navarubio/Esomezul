/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author SofiMar
 */
@Entity
@Table(name = "productor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productor.findAll", query = "SELECT p FROM Productor p"),
    @NamedQuery(name = "Productor.findByCodigoproductor", query = "SELECT p FROM Productor p WHERE p.codigoproductor = :codigoproductor"),
    @NamedQuery(name = "Productor.findByRif", query = "SELECT p FROM Productor p WHERE p.rif = :rif"),
    @NamedQuery(name = "Productor.findByRazonsocial", query = "SELECT p FROM Productor p WHERE p.razonsocial = :razonsocial"),
    @NamedQuery(name = "Productor.findByTelefonos", query = "SELECT p FROM Productor p WHERE p.telefonos = :telefonos"),
    @NamedQuery(name = "Productor.findByEmail", query = "SELECT p FROM Productor p WHERE p.email = :email"),
    @NamedQuery(name = "Productor.findByDireccionfiscal", query = "SELECT p FROM Productor p WHERE p.direccionfiscal = :direccionfiscal"),
    @NamedQuery(name = "Productor.findByIdparroquia", query = "SELECT p FROM Productor p WHERE p.idparroquia = :idparroquia"),
    @NamedQuery(name = "Productor.findByPaginaweb", query = "SELECT p FROM Productor p WHERE p.paginaweb = :paginaweb"),
    @NamedQuery(name = "Productor.findByAportesocial", query = "SELECT p FROM Productor p WHERE p.aportesocial = :aportesocial"),
    @NamedQuery(name = "Productor.findByFechainscripcion", query = "SELECT p FROM Productor p WHERE p.fechainscripcion = :fechainscripcion")})
public class Productor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "codigoproductor")
    private String codigoproductor;
    @Size(max = 12)
    @Column(name = "rif")
    private String rif;
    @Size(max = 200)
    @Column(name = "razonsocial")
    private String razonsocial;
    @Size(max = 100)
    @Column(name = "telefonos")
    private String telefonos;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    @Size(max = 255)
    @Column(name = "direccionfiscal")
    private String direccionfiscal;
    @Column(name = "idparroquia")
    private Integer idparroquia;
    @Size(max = 100)
    @Column(name = "paginaweb")
    private String paginaweb;
    @Size(max = 255)
    @Column(name = "aportesocial")
    private String aportesocial;
    @Column(name = "fechainscripcion")
    @Temporal(TemporalType.DATE)
    private Date fechainscripcion;
    @OneToMany(mappedBy = "codigoproductor")
    private Collection<Autorizado> autorizadoCollection;
    @OneToMany(mappedBy = "codigoproductor")
    private Collection<Yacimiento> yacimientoCollection;
    @OneToMany(mappedBy = "codigoproductor")
    private Collection<Patio> patioCollection;
    @OneToMany(mappedBy = "codigoproductor")
    private Collection<Representante> representanteCollection;
    @JoinColumn(name = "idtransporte", referencedColumnName = "idtransporte")
    @ManyToOne
    private Transporte idtransporte;
    @JoinColumn(name = "idcriterioproceso", referencedColumnName = "idcriterioproceso")
    @ManyToOne
    private Criterioproceso idcriterioproceso;
    @JoinColumn(name = "idclasificacion", referencedColumnName = "idclasificacion")
    @ManyToOne
    private Clasificacionproductor idclasificacion;
    @JoinColumn(name = "idnivelcontrato", referencedColumnName = "idnivelcontrato")
    @ManyToOne
    private Nivelcontrato idnivelcontrato;
    @JoinColumn(name = "idestatus", referencedColumnName = "idestatus")
    @ManyToOne
    private Estatus idestatus;

    public Productor() {
    }

    public Productor(String codigoproductor) {
        this.codigoproductor = codigoproductor;
    }

    public String getCodigoproductor() {
        return codigoproductor;
    }

    public void setCodigoproductor(String codigoproductor) {
        this.codigoproductor = codigoproductor;
    }

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccionfiscal() {
        return direccionfiscal;
    }

    public void setDireccionfiscal(String direccionfiscal) {
        this.direccionfiscal = direccionfiscal;
    }

    public Integer getIdparroquia() {
        return idparroquia;
    }

    public void setIdparroquia(Integer idparroquia) {
        this.idparroquia = idparroquia;
    }

    public String getPaginaweb() {
        return paginaweb;
    }

    public void setPaginaweb(String paginaweb) {
        this.paginaweb = paginaweb;
    }

    public String getAportesocial() {
        return aportesocial;
    }

    public void setAportesocial(String aportesocial) {
        this.aportesocial = aportesocial;
    }

    public Date getFechainscripcion() {
        return fechainscripcion;
    }

    public void setFechainscripcion(Date fechainscripcion) {
        this.fechainscripcion = fechainscripcion;
    }

    @XmlTransient
    public Collection<Autorizado> getAutorizadoCollection() {
        return autorizadoCollection;
    }

    public void setAutorizadoCollection(Collection<Autorizado> autorizadoCollection) {
        this.autorizadoCollection = autorizadoCollection;
    }

    @XmlTransient
    public Collection<Yacimiento> getYacimientoCollection() {
        return yacimientoCollection;
    }

    public void setYacimientoCollection(Collection<Yacimiento> yacimientoCollection) {
        this.yacimientoCollection = yacimientoCollection;
    }

    @XmlTransient
    public Collection<Patio> getPatioCollection() {
        return patioCollection;
    }

    public void setPatioCollection(Collection<Patio> patioCollection) {
        this.patioCollection = patioCollection;
    }

    @XmlTransient
    public Collection<Representante> getRepresentanteCollection() {
        return representanteCollection;
    }

    public void setRepresentanteCollection(Collection<Representante> representanteCollection) {
        this.representanteCollection = representanteCollection;
    }

    public Transporte getIdtransporte() {
        return idtransporte;
    }

    public void setIdtransporte(Transporte idtransporte) {
        this.idtransporte = idtransporte;
    }

    public Criterioproceso getIdcriterioproceso() {
        return idcriterioproceso;
    }

    public void setIdcriterioproceso(Criterioproceso idcriterioproceso) {
        this.idcriterioproceso = idcriterioproceso;
    }

    public Clasificacionproductor getIdclasificacion() {
        return idclasificacion;
    }

    public void setIdclasificacion(Clasificacionproductor idclasificacion) {
        this.idclasificacion = idclasificacion;
    }

    public Nivelcontrato getIdnivelcontrato() {
        return idnivelcontrato;
    }

    public void setIdnivelcontrato(Nivelcontrato idnivelcontrato) {
        this.idnivelcontrato = idnivelcontrato;
    }

    public Estatus getIdestatus() {
        return idestatus;
    }

    public void setIdestatus(Estatus idestatus) {
        this.idestatus = idestatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoproductor != null ? codigoproductor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productor)) {
            return false;
        }
        Productor other = (Productor) object;
        if ((this.codigoproductor == null && other.codigoproductor != null) || (this.codigoproductor != null && !this.codigoproductor.equals(other.codigoproductor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Productor[ codigoproductor=" + codigoproductor + " ]";
    }
    
}
