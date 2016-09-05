/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pweb.business;

/**
 *
 * @author alumno
 */
public class RegistroM {
   
    private String codigo;
    private String nombre;
    private String apellidos;
    private String email;
    
     public RegistroM() {
        codigo = "";
        nombre= "";
         apellidos= "";
        email = "";
        
    }
      public RegistroM(String codigo, String nombre,String apellidos,String email) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.apellidos=apellidos;
         this.email=email;
      
    }
       public String getcodigo() {
        return codigo;
    }

    public void setnombre(String nombre) {
        this.nombre=nombre;
    }
 public void setapellidos(String apellidos) {
        this.apellidos=apellidos;
    }
  public void setemail(String email) {
        this.email=email;
    }
   
}
