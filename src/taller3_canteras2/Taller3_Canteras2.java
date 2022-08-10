/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3_canteras2;

import java.util.ArrayList;

/**
 * Main catalogado como Biblioteca Principal
 * @author Viviana Cifuentes
 * @version 1.0
 */
public class Taller3_Canteras2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * se agrega ArrayList para almacenar las canciones dentro de la Biblioteca principal
         * @author Viviana Cifuentes
         */
        ArrayList<Song> arrayOfSongs = new ArrayList<>();
        
        arrayOfSongs.add(new Song(01,"Cali Ají", 1990, 7, 26, "salsa", "CA", "Album Cielo de Tambores"));
        arrayOfSongs.add(new Song(02,"Amores Lejanos", 2002, 4, 54, "rock", "AL", "Album de Enanitos Verdes"));
        arrayOfSongs.add(new Song(03,"Magic", 2014, 5, 16, "rock", "M", "Album Ghost Stories"));
        arrayOfSongs.add(new Song(04,"Put yor head on my shoulder", 1958, 2, 43, "rock", "PYHOMS", "is a song written by Canadian-born singer-songwriter Paul Anka"));
        arrayOfSongs.add(new Song(05,"La Inocente", 2022, 3, 22, "reggaeton", "LI", "Album de Feid & Mora"));
        
        /**
         * Ciclo encargado de imprimir las canciones en pantalla
         * @author Viviana Cifuentes
         */
        System.out.println("Biblioteca Principal");
        for (Song song: arrayOfSongs) {
            System.out.println(song.getId()+". "+song.getTitle());
        }
        
        
        
    }
    
}
