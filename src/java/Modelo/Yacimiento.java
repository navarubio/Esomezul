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
@Table(name = "yacimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Yacimiento.findAll", query = "SELECT y FROM Yacimiento y"),
    @NamedQuery(name = "Yacimiento.findByCodigoyacimiento", query = "SELECT y FROM Yacimiento y WHERE y.codigoyacimiento = :codigoyacimiento"),
    @NamedQuery(name = "Yacimiento.findByIdlugar", query = "SELECT y FROM Yacimiento y WHERE y.idlugar = :idlugar"),
    @NamedQuery(name = "Yacimiento.findByCordenadan", query = "SELECT y FROM Yacimiento y WHERE y.cordenadan = :cordenadan"),
    @NamedQuery(name = "Yacimiento.findByCordenadae", query = "SELECT y FROM Yacimiento y WHERE y.cordenadae = :cordenadae"),
    @NamedQuery(name = "Yacimiento.findByAreatotal", query = "SELECT y FROM Yacimiento y WHERE y.areatotal = :areatotal"),
    @NamedQuery(name = "Yacimiento.findByVolumentotal", query = "SELECT y FROM Yacimiento y WHERE y.volumentotal = :volumentotal"),
    @NamedQuery(name = "Yacimiento.findByVidautil", query = "SELECT y FROM Yacimiento y WHERE y.vidautil = :vidautil"),
    @NamedQuery(name = "Yacimiento.findByAreaexplotar", query = "SELECT y FROM Yacimiento y WHERE y.areaexplotar = :areaexplotar"),
    @NamedQuery(name = "Yacimiento.findByAreareforestar", query = "SELECT y FROM Yacimiento y WHERE y.areareforestar = :areareforestar"),
    @NamedQuery(name = "Yacimiento.findByCantidadarboles", query = "SELECT y FROM Yacimiento y WHERE y.cantidadarboles = :cantidadarboles"),
    @NamedQuery(name = "Yacimiento.findByEspecies", query = "SELECT y FROM Yacimiento y WHERE y.especies = :especies"),
    @NamedQuery(name = "Yacimiento.findByNomina", query = "SELECT y FROM Yacimiento y WHERE y.nomina = :nomina"),
    @NamedQuery(name = "Yacimiento.findByMaquinaria", query = "SELECT y FROM Yacimiento y WHERE y.maquinaria = :maquinaria"),
    @NamedQuery(name = "Yacimiento.findByFechaAT", query = "SELECT y FROM Yacimiento y WHERE y.fechaAT = :fechaAT"),
    @NamedQuery(name = "Yacimiento.findByFechaOT", query = "SELECT y FROM Yacimiento y WHERE y.fechaOT = :fechaOT"),
    @NamedQuery(name = "Yacimiento.findByFechaPA", query = "SELECT y FROM Yacimiento y WHERE y.fechaPA = :fechaPA"),
    @NamedQuery(name = "Yacimiento.findByFechaPE", query = "SELECT y FROM Yacimiento y WHERE y.fechaPE = :fechaPE"),
    @NamedQuery(name = "Yacimiento.findByFechaincripcion", query = "SELECT y FROM Yacimiento y WHERE y.fechaincripcion = :fechaincripcion")})
public class Yacimiento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "codigoyacimiento")
    private String codigoyacimiento;
    @Column(name = "idlugar")
    private Integer idlugar;
    @Size(max = 20)
    @Column(name = "cordenadan")
    private String cordenadan;
    @Size(max = 20)
    @Column(name = "cordenadae")
    private String cordenadae;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "areatotal")
    private Double areatotal;
    @Column(name = "volumentotal")
    private Double volumentotal;
    @Column(name = "vidautil")
    private Integer vidautil;
    @Column(name = "areaexplotar")
    private Double areaexplotar;
    @Column(name = "areareforestar")
    private Double areareforestar;
    @Column(name = "cantidadarboles")
    private Integer cantidadarboles;
    @Size(max = 200)
    @Column(name = "especies")
    private String especies;
    @Column(name = "nomina")
    private Integer nomina;
    @Size(max = 255)
    @Column(name = "maquinaria")
    private String maquinaria;
    @Column(name = "fechaAT")
    @Temporal(TemporalType.DATE)
    private Date fechaAT;
    @Column(name = "fechaOT")
    @Temporal(TemporalType.DATE)
    private Date fechaOT;
    @Column(name = "fechaPA")
    @Temporal(TemporalType.DATE)
    private Date fechaPA;
    @Column(name = "fechaPE")
    @Temporal(TemporalType.DATE)
    private Date fechaPE;
    @Column(name = "fechaincripcion")
    @Temporal(TemporalType.DATE)
    private Date fechaincripcion;
    @JoinColumn(name = "codigoproductor", referencedColumnName = "codigoproductor")
    @ManyToOne
    private Productor codigoproductor;
    @JoinColumn(name = "idparroquia", referencedColumnName = "idparroquia")
    @ManyToOne
    private Parroquia idparroquia;
    @OneToMany(mappedBy = "idyacimiento")
    private Collection<Yacimientomaterial> yacimientomaterialCollection;

    public Yacimiento() {
    }

    public Yacimiento(String codigoyacimiento) {
        this.codigoyacimiento = codigoyacimiento;
    }

    public String getCodigoyacimiento() {
        return codigoyacimiento;
    }

    public void setCodigoyacimiento(String codigoyacimiento) {
        this.codigoyacimiento = codigoyacimiento;
    }

    public Integer getIdlugar() {
        return idlugar;
    }

    public void setIdlugar(Integer idlugar) {
        this.idlugar = idlugar;
    }

    public String getCordenadan() {
        return cordenadan;
    }

    public void setCordenadan(String cordenadan) {
        this.cordenadan = cordenadan;
    }

    public String getCordenadae() {
        return cordenadae;
    }

    public void setCordenadae(String cordenadae) {
        this.cordenadae = cordenadae;
    }

    public Double getAreatotal() {
        return areatotal;
    }

    public void setAreatotal(Double areatotal) {
        this.areatotal = areatotal;
    }

    public Double getVolumentotal() {
        return volumentotal;
    }

    public void setVolumentotal(Double volumentotal) {
        this.volumentotal = volumentotal;
    }

    public Integer getVidautil() {
        return vidautil;
    }

    public void setVidautil(Integer vidautil) {
        this.vidautil = vidautil;
    }

    public Double getAreaexplotar() {
        return areaexplotar;
    }

    public void setAreaexplotar(Double areaexplotar) {
        this.areaexplotar = areaexplotar;
    }

    public Double getAreareforestar() {
        return areareforestar;
    }

    public void setAreareforestar(Double areareforestar) {
        this.areareforestar = areareforestar;
    }

    public Integer getCantidadarboles() {
        return cantidadarboles;
    }

    public void setCantidadarboles(Integer cantidadarboles) {
        this.cantidadarboles = cantidadarboles;
    }

    public String getEspecies() {
        return especies;
    }

    public void setEspecies(String especies) {
        this.especies = especies;
    }

    public Integer getNomina() {
        return nomina;
    }

    public void setNomina(Integer nomina) {
        this.nomina = nomina;
    }

    public String getMaquinaria() {
        return maquinaria;
    }

    public void setMaquinaria(String maquinaria) {
        this.maquinaria = maquinaria;
    }

    public Date getFechaAT() {
        return fechaAT;
    }

    public void setFechaAT(Date fechaAT) {
        this.fechaAT = fechaAT;
    }

    public Date getFechaOT() {
        return fechaOT;
    }

    public void setFechaOT(Date fechaOT) {
        this.fechaOT = fechaOT;
    }

    public Date getFechaPA() {
        return fechaPA;
    }

    public void setFechaPA(Date fechaPA) {
        this.fechaPA = fechaPA;
    }

    public Date getFechaPE() {
        return fechaPE;
    }

    public void setFechaPE(Date fechaPE) {
        this.fechaPE = fechaPE;
    }

    public Date getFechaincripcion() {
        return fechaincripcion;
    }

    public void setFechaincripcion(Date fechaincripcion) {
        this.fechaincripcion = fechaincripcion;
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

    @XmlTransient
    public Collection<Yacimientomaterial> getYacimientomaterialCollection() {
        return yacimientomaterialCollection;
    }

    public void setYacimientomaterialCollection(Collection<Yacimientomaterial> yacimientomaterialCollection) {
        this.yacimientomaterialCollection = yacimientomaterialCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoyacimiento != null ? codigoyacimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Yacimiento)) {
            return false;
        }
        Yacimiento other = (Yacimiento) object;
        if ((this.codigoyacimiento == null && other.codigoyacimiento != null) || (this.codigoyacimiento != null && !this.codigoyacimiento.equals(other.codigoyacimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Yacimiento[ codigoyacimiento=" + codigoyacimiento + " ]";
    }
    
}
