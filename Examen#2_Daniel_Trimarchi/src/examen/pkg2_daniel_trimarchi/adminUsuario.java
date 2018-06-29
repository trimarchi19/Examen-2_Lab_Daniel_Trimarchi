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
public class adminUsuario {
    private ArrayList<Usuario> listaus =new ArrayList();
    private File archivo=null;

    public adminUsuario(String path) {
        this.archivo=new File(path);
    }

    public ArrayList<Usuario> getListaus() {
        return listaus;
    }

    public void setListaus(ArrayList<Usuario> listaus) {
        this.listaus = listaus;
    }


    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaUsuarios=" + listaus + '}';
    } 
    public void setPersona(Usuario p){
        listaus.add(p);
    }
    public void cargarArchivo(){
        try{
            listaus =new ArrayList();
            Usuario temp;
            if(archivo.exists()){
                FileInputStream entrada
                        =new FileInputStream(archivo);
                ObjectInputStream objeto
                        =new ObjectInputStream(entrada);
                try{
                    while( (temp = (Usuario)objeto.readObject()) != null ){
                        listaus.add(temp);
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
            for (Usuario t : listaus) {
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
