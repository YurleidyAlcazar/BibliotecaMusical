/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3_canteras2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase contiene los métodos y atributos de la lista de cancione personalizadas.
 * @author Viviana Cifuentes
 */
public class CustomPlayList extends MainLibrary{
    private int idPlaylist;
    private String name;
    private String PlayListGenre;
    
    /**
     * Método constructor por defecto.
     */
    public CustomPlayList() {
    }
    
    /**
     * Método construtor parametrizado
     * @param idPlaylist número identificador de la playlist
     * @param name nombre de la playlist
     * @param PlayListGenre género de la playlist
     */
    public CustomPlayList(int idPlaylist, String name, String PlayListGenre) {
        this.idPlaylist = idPlaylist;
        this.name = name;
        this.PlayListGenre = PlayListGenre;
    }
   
    /**
     * @return the idPlaylist
     */
    public int getIdPlaylist() {
        return idPlaylist;
    }

    /**
     * @param idPlaylist the idPlaylist to set
     */
    public void setIdPlaylist(int idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the PlayListGenre
     */
    public String getPlayListGenre() {
        return PlayListGenre;
    }

    /**
     * @param PlayListGenre the PlayListGenre to set
     */
    public void setPlayListGenre(String PlayListGenre) {
        this.PlayListGenre = PlayListGenre;
    }
   
    /**
     * Método encargado de crear la playlist con el nombre y el género obtenido por consola.
     */
    public void createPlaylist(){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la playlist: ");
        this.name = sc1.next();
        System.out.println("Ingrese el género de la playlist: ");
        this.PlayListGenre = sc.next();
    }
    
    
    public void addSongsToPlayList(){
        ArrayList<Song> myPlayList = new ArrayList<>();
                for(int j = 0; j < 3 ;j++){
                    System.out.println("Tipee el id de la cancion a  agregar");
                    Scanner sc = new Scanner(System.in);
                    String entradaTeclado = sc.next(); 
                    for (Song song : arrayOfSongs) {
                         if(String.valueOf(song.getId()).equalsIgnoreCase(entradaTeclado)){
                             myPlayList.add(song);
                             break;
                         }
                    }
                }
                System.out.println("My LISTA DE RELODUCCION ES:");
                System.out.println(this.name + " de " + this.PlayListGenre);
                for (Song song : myPlayList) {
                    System.out.println(song.getId() + ". " + song.getTitle());
                }
    }
        
}
   
    