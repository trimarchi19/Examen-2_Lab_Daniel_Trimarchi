/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_daniel_trimarchi;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author X
 */
public class adminAlbum {
       private ArrayList<Album> listAlbum =new ArrayList();
    private File archivo=null;

    public adminAlbum(String path) {
        this.archivo=new File(path);
    }

    public ArrayList<Album> getListAlbum() {
        return listAlbum;
    }

    public void setListAlbum(ArrayList<Album> listAlbum) {
        this.listAlbum = listAlbum;
    }

    


    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaUsuarios=" + listAlbum + '}';
    } 
    public void setPersona(Album p){
        listAlbum.add(p);
    }
    public void cargarArchivo(){
        try{
            listAlbum =new ArrayList();
            Album temp;
            if(archivo.exists()){
                FileInputStream entrada
                        =new FileInputStream(archivo);
                ObjectInputStream objeto
                        =new ObjectInputStream(entrada);
                try{
                    while( (temp = (Album)objeto.readObject()) != null ){
                        listAlbum.add(temp);
                    }
                }catch(EOFException e){
                    //encontro el final del archivo
                }
            }
            
            
        }catch(Exception ex){
            
        }
    }
    public void escribirArchivo(){
        FileOutputStream fw=null;
        ObjectOutputStream bw=null;
        try{
            fw=new FileOutputStream(archivo);
            bw= new ObjectOutputStream(fw);
            for (Album t : listAlbum) {
                bw.writeObject(t);
                
            }
            bw.flush();
        }catch(Exception ex){
            System.out.println(ex);
        }finally{
            try{
               // fw.close();
                bw.close();
                 fw.close();
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
    }
   
    
    
    
}
