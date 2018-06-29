/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_daniel_trimarchi;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author X
 */
public class Usuario implements Serializable{
    private String nombre;
    private String edad;
    private String user;
    private String password;
     private ArrayList<Cancion> playlist=new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nombre, String edad, String user, String password) {
        this.nombre = nombre;
        this.edad = edad;
        this.user = user;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + '}';
    }
    
}
