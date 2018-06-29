/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_daniel_trimarchi;

import com.sun.jndi.toolkit.dir.SearchFilter;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author X
 */
public class Playlist implements Serializable{
    private String play_name;
    private ArrayList <Cancion> play=new ArrayList<>();

    public Playlist() {
    }

    public ArrayList<Cancion> getPlay() {
        return play;
    }

    public String getPlay_name() {
        return play_name;
    }

    public void setPlay_name(String play_name) {
        this.play_name = play_name;
    }

    public Playlist(String play_name) {
        this.play_name = play_name;
    }

    public void setPlay(ArrayList<Cancion> play) {
        this.play = play;
    }

    @Override
    public String toString() {
        return play_name ;
    }

   
    
    
    
}
