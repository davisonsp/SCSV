package modelo;
// Generated Nov 19, 2015 3:42:42 PM by Hibernate Tools 4.3.1



/**
 * UsuarioHasModulo generated by hbm2java
 */
public class UsuarioHasModulo  implements java.io.Serializable {


     private UsuarioHasModuloId id;
     private Modulo modulo;
     private Usuario usuario;
     private boolean escritura;
     private String lectura;

    public UsuarioHasModulo() {
    }

    public UsuarioHasModulo(UsuarioHasModuloId id, Modulo modulo, Usuario usuario, boolean escritura, String lectura) {
       this.id = id;
       this.modulo = modulo;
       this.usuario = usuario;
       this.escritura = escritura;
       this.lectura = lectura;
    }
   
    public UsuarioHasModuloId getId() {
        return this.id;
    }
    
    public void setId(UsuarioHasModuloId id) {
        this.id = id;
    }
    public Modulo getModulo() {
        return this.modulo;
    }
    
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public boolean isEscritura() {
        return this.escritura;
    }
    
    public void setEscritura(boolean escritura) {
        this.escritura = escritura;
    }
    public String getLectura() {
        return this.lectura;
    }
    
    public void setLectura(String lectura) {
        this.lectura = lectura;
    }




}

