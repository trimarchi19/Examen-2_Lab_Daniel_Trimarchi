/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_daniel_trimarchi;

import java.io.Serializable;

/**
 *
 * @author X
 */
public class Cancion implements Serializable{
    private String nombre;
    private String artista;
    private Album album;
    private int duracin;
    private String genero;

    public Cancion(){
    }

    public Cancion(String nombre, String artista, int duracin, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracin = duracin;
        this.genero = genero;
    }

    public Cancion(String nombre, String artista, Album album, int duracin, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.album = album;
        this.duracin = duracin;
        this.genero = genero;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public int getDuracin() {
        return duracin;
    }

    public void setDuracin(int duracin) {
        this.duracin = duracin;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + ", artista=" + artista + ", album=" + album.getNombre() + '}';
    }
    

}
