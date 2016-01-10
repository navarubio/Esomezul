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
@Table(name = "empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e"),
    @NamedQuery(name = "Empresa.findByRif", query = "SELECT e FROM Empresa e WHERE e.rif = :rif"),
    @NamedQuery(name = "Empresa.findByRazonsocial", query = "SELECT e FROM Empresa e WHERE e.razonsocial = :razonsocial"),
    @NamedQuery(name = "Empresa.findByNombrecomercial", query = "SELECT e FROM Empresa e WHERE e.nombrecomercial = :nombrecomercial"),
    @NamedQuery(name = "Empresa.findByDireccionfiscal", query = "SELECT e FROM Empresa e WHERE e.direccionfiscal = :direccionfiscal"),
    @NamedQuery(name = "Empresa.findByTelefonos", query = "SELECT e FROM Empresa e WHERE e.telefonos = :telefonos"),
    @NamedQuery(name = "Empresa.findByPresidente", query = "SELECT e FROM Empresa e WHERE e.presidente = :presidente"),
    @NamedQuery(name = "Empresa.findBySiglasproductor", query = "SELECT e FROM Empresa e WHERE e.siglasproductor = :siglasproductor"),
    @NamedQuery(name = "Empresa.findBySerialproductor", query = "SELECT e FROM Empresa e WHERE e.serialproductor = :serialproductor"),
    @NamedQuery(name = "Empresa.findBySerialyacimiento", query = "SELECT e FROM Empresa e WHERE e.serialyacimiento = :serialyacimiento")})
public class Empresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "rif")
    private String rif;
    @Size(max = 100)
    @Column(name = "razonsocial")
    private String razonsocial;
    @Size(max = 50)
    @Column(name = "nombrecomercial")
    private String nombrecomercial;
    @Size(max = 200)
    @Column(name = "direccionfiscal")
    private String direccionfiscal;
    @Size(max = 50)
    @Column(name = "telefonos")
    private String telefonos;
    @Size(max = 150)
    @Column(name = "presidente")
    private String presidente;
    @Size(max = 8)
    @Column(name = "siglasproductor")
    private String siglasproductor;
    @Column(name = "serialproductor")
    private Integer serialproductor;
    @Column(name = "serialyacimiento")
    private Integer serialyacimiento;

    public Empresa() {
    }

    public Empresa(String rif) {
        this.rif = rif;
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

    public String getNombrecomercial() {
        return nombrecomercial;
    }

    public void setNombrecomercial(String nombrecomercial) {
        this.nombrecomercial = nombrecomercial;
    }

    public String getDireccionfiscal() {
        return direccionfiscal;
    }

    public void setDireccionfiscal(String direccionfiscal) {
        this.direccionfiscal = direccionfiscal;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getSiglasproductor() {
        return siglasproductor;
    }

    public void setSiglasproductor(String siglasproductor) {
        this.siglasproductor = siglasproductor;
    }

    public Integer getSerialproductor() {
        return serialproductor;
    }

    public void setSerialproductor(Integer serialproductor) {
        this.serialproductor = serialproductor;
    }

    public Integer getSerialyacimiento() {
        return serialyacimiento;
    }

    public void setSerialyacimiento(Integer serialyacimiento) {
        this.serialyacimiento = serialyacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rif != null ? rif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.rif == null && other.rif != null) || (this.rif != null && !this.rif.equals(other.rif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Empresa[ rif=" + rif + " ]";
    }
    
}
