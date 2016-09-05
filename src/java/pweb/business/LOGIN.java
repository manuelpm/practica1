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
public class LOGIN {
    private String USUARIO;
    private String CONTRASEÑA;
    
     public LOGIN() {
        USUARIO = "";
        CONTRASEÑA = "";
        
    }
      public LOGIN(String USUARIO, String CONTRASEÑA) {
        this.USUARIO=USUARIO;
        this.CONTRASEÑA=CONTRASEÑA;
      
    }
       public String getUSUARIO() {
        return USUARIO;
    }

    public void setCONTRASEÑA(String CONTRASEÑA) {
        this.CONTRASEÑA=CONTRASEÑA;
    }
}
