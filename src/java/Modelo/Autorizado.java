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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SofiMar
 */
@Entity
@Table(name = "autorizado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Autorizado.findAll", query = "SELECT a FROM Autorizado a"),
    @NamedQuery(name = "Autorizado.findByCedula", query = "SELECT a FROM Autorizado a WHERE a.cedula = :cedula"),
    @NamedQuery(name = "Autorizado.findByNombres", query = "SELECT a FROM Autorizado a WHERE a.nombres = :nombres"),
    @NamedQuery(name = "Autorizado.findByApellidos", query = "SELECT a FROM Autorizado a WHERE a.apellidos = :apellidos"),
    @NamedQuery(name = "Autorizado.findByTelefonos", query = "SELECT a FROM Autorizado a WHERE a.telefonos = :telefonos"),
    @NamedQuery(name = "Autorizado.findByCorreo", query = "SELECT a FROM Autorizado a WHERE a.correo = :correo")})
public class Autorizado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cedula")
    private String cedula;
    @Size(max = 100)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 100)
    @Column(name = "apellidos")
    private String apellidos;
    @Size(max = 100)
    @Column(name = "telefonos")
    private String telefonos;
    @Size(max = 100)
    @Column(name = "correo")
    private String correo;
    @JoinColumn(name = "codigoproductor", referencedColumnName = "codigoproductor")
    @ManyToOne
    private Productor codigoproductor;

    public Autorizado() {
    }

    public Autorizado(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Productor getCodigoproductor() {
        return codigoproductor;
    }

    public void setCodigoproductor(Productor codigoproductor) {
        this.codigoproductor = codigoproductor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Autorizado)) {
            return false;
        }
        Autorizado other = (Autorizado) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Autorizado[ cedula=" + cedula + " ]";
    }
    
}
