package modelo;
// Generated Nov 19, 2015 3:42:42 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Trabajador generated by hbm2java
 */
public class Trabajador  implements java.io.Serializable {


     private Integer codTrabajador;
     private Location location;
     private Perfil perfil;
     private Sucursal sucursal;
     private Usuario usuario;
     private String estado;
     private Set<Incidencia> incidencias = new HashSet<Incidencia>(0);
     private Set<TrabajadorHasCertificado> trabajadorHasCertificados = new HashSet<TrabajadorHasCertificado>(0);

    public Trabajador() {
    }

	
    public Trabajador(Location location, Perfil perfil, Sucursal sucursal, Usuario usuario, String estado) {
        this.location = location;
        this.perfil = perfil;
        this.sucursal = sucursal;
        this.usuario = usuario;
        this.estado = estado;
    }
    public Trabajador(Location location, Perfil perfil, Sucursal sucursal, Usuario usuario, String estado, Set<Incidencia> incidencias, Set<TrabajadorHasCertificado> trabajadorHasCertificados) {
       this.location = location;
       this.perfil = perfil;
       this.sucursal = sucursal;
       this.usuario = usuario;
       this.estado = estado;
       this.incidencias = incidencias;
       this.trabajadorHasCertificados = trabajadorHasCertificados;
    }
   
    public Integer getCodTrabajador() {
        return this.codTrabajador;
    }
    
    public void setCodTrabajador(Integer codTrabajador) {
        this.codTrabajador = codTrabajador;
    }
    public Location getLocation() {
        return this.location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    public Perfil getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    public Sucursal getSucursal() {
        return this.sucursal;
    }
    
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set<Incidencia> getIncidencias() {
        return this.incidencias;
    }
    
    public void setIncidencias(Set<Incidencia> incidencias) {
        this.incidencias = incidencias;
    }
    public Set<TrabajadorHasCertificado> getTrabajadorHasCertificados() {
        return this.trabajadorHasCertificados;
    }
    
    public void setTrabajadorHasCertificados(Set<TrabajadorHasCertificado> trabajadorHasCertificados) {
        this.trabajadorHasCertificados = trabajadorHasCertificados;
    }




}

