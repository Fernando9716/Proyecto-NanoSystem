/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author fernando
 */
@Entity
@Table(name = "FACTURA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f")
    , @NamedQuery(name = "Factura.findByFolioF", query = "SELECT f FROM Factura f WHERE f.folioF = :folioF")
    , @NamedQuery(name = "Factura.findByFecha", query = "SELECT f FROM Factura f WHERE f.fecha = :fecha")
    , @NamedQuery(name = "Factura.findByNombre", query = "SELECT f FROM Factura f WHERE f.nombre = :nombre")
    , @NamedQuery(name = "Factura.findByRfc", query = "SELECT f FROM Factura f WHERE f.rfc = :rfc")
    , @NamedQuery(name = "Factura.findByCalle", query = "SELECT f FROM Factura f WHERE f.calle = :calle")
    , @NamedQuery(name = "Factura.findByNumero", query = "SELECT f FROM Factura f WHERE f.numero = :numero")
    , @NamedQuery(name = "Factura.findByNumeroint", query = "SELECT f FROM Factura f WHERE f.numeroint = :numeroint")
    , @NamedQuery(name = "Factura.findByColonia", query = "SELECT f FROM Factura f WHERE f.colonia = :colonia")
    , @NamedQuery(name = "Factura.findByServicio", query = "SELECT f FROM Factura f WHERE f.servicio = :servicio")
    , @NamedQuery(name = "Factura.findByEmail", query = "SELECT f FROM Factura f WHERE f.email = :email")
    , @NamedQuery(name = "Factura.findByCiudad", query = "SELECT f FROM Factura f WHERE f.ciudad = :ciudad")})
public class Factura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FOLIO_F")
    private Integer folioF;
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "RFC")
    private String rfc;
    @Column(name = "CALLE")
    private String calle;
    @Column(name = "NUMERO")
    private Integer numero;
    @Column(name = "NUMEROINT")
    private Integer numeroint;
    @Column(name = "COLONIA")
    private String colonia;
    @Column(name = "SERVICIO")
    private String servicio;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "CIUDAD")
    private String ciudad;
    @OneToMany(mappedBy = "folioF")
    private List<Venta> ventaList;

    public Factura() {
    }

    public Factura(Integer folioF) {
        this.folioF = folioF;
    }

    public Integer getFolioF() {
        return folioF;
    }

    public void setFolioF(Integer folioF) {
        this.folioF = folioF;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumeroint() {
        return numeroint;
    }

    public void setNumeroint(Integer numeroint) {
        this.numeroint = numeroint;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @XmlTransient
    public List<Venta> getVentaList() {
        return ventaList;
    }

    public void setVentaList(List<Venta> ventaList) {
        this.ventaList = ventaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (folioF != null ? folioF.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.folioF == null && other.folioF != null) || (this.folioF != null && !this.folioF.equals(other.folioF))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Factura[ folioF=" + folioF + " ]";
    }
    
}
