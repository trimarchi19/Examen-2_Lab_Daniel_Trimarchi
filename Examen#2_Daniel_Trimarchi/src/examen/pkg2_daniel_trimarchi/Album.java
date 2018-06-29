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
public class Album implements Serializable{
   private String artista;
   private String nombre;
   private ArrayList<Cancion>cancion=new ArrayList<>();

    public Album() {
    }

    public Album(String artista, String nombre) {
        this.artista = artista;
        this.nombre = nombre;
        
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Cancion> cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
   
    
    
}
