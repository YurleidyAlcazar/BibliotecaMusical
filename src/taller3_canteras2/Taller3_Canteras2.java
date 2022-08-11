/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3_canteras2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Main catalogado como Biblioteca Principal
 *
 * @author Viviana Cifuentes
 * @version 1.0
 */
public class Taller3_Canteras2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Filter filter = new Filter();
        String entradaTeclado = "";

        /**
         * se agrega ArrayList para almacenar las canciones dentro de la
         * Biblioteca principal
         *
         * @author Viviana Cifuentes
         */
        ArrayList<Song> arrayOfSongs = new ArrayList<>();

        arrayOfSongs.add(new Song(01, "Cali Ají", 1990, 7, 26, "salsa", "CA", "Album Cielo de Tambores"));
        arrayOfSongs.add(new Song(02, "Amores Lejanos", 1990, 4, 54, "rock", "AL", "Album de Enanitos Verdes"));
        arrayOfSongs.add(new Song(03, "Magic", 2014, 5, 16, "rock", "M", "Album Ghost Stories"));
        arrayOfSongs.add(new Song(04, "Put yor head on my shoulder", 1958, 2, 43, "rock", "PYHOMS", "is a song written by Canadian-born singer-songwriter Paul Anka"));
        arrayOfSongs.add(new Song(05, "La Inocente", 2022, 3, 22, "reggaeton", "LI", "Album de Feid & Mora"));

        /**
         * Ciclo encargado de imprimir las canciones en pantalla
         *
         * @author Viviana Cifuentes
         */
        System.out.println("Biblioteca Principal");
        for (Song song : arrayOfSongs) {
            System.out.println(song.getId() + ". " + song.getTitle());
        }
        // need to construct a new ArrayList otherwise remove operation will not be supported

        for (int i = 0; i < 10; i++) {
            System.out.println("Tipee el numero de la opcion a ejecutar");
            System.out.println("1 Filtrar por Genero");
            System.out.println("2 Filtrar por Año");
            System.out.println("3 Ordenar por Año mas viejo al mas nuevo");
            System.out.println("4 Ordenar por Año mas nuevo al mas viejo");
            System.out.println("5 Ordenar por Mayor duracion");
            System.out.println("6 Ordenar por Menor duracion");
            Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner
            entradaTeclado = entradaEscaner.nextLine(); //Invocamos un método sobre un objeto Scanner   
            if ("1".equalsIgnoreCase(entradaTeclado)) {
                System.out.println("Tipee el genero");
                entradaTeclado = entradaEscaner.nextLine();
                filter.filterGender(entradaTeclado, arrayOfSongs);
            } else if ("2".equalsIgnoreCase(entradaTeclado)) {
                System.out.println("Tipee el año");
                entradaTeclado = entradaEscaner.nextLine();
                filter.filterDate(entradaTeclado, arrayOfSongs);
            } else if ("3".equalsIgnoreCase(entradaTeclado)) {
                Collections.sort(arrayOfSongs, Filter.YearComparator); //ORDENA DE MENOR A MAYOR
                System.out.println("******* LISTA PRINCIPAL ORDENADA POR AÑO DEL MAS VIEJO AL MAS NUEVO*******"); 
                for (Song song : arrayOfSongs) {
                    System.out.println(song.getId() + " " + song.getTitle() + " " + song.getDate());
                }
                System.out.println("**********************************************************************");
            } else if ("4".equalsIgnoreCase(entradaTeclado)) {
                //ESTE METODO RECIBE DOS ARGUMENTOS LA LISTA Y EL ELEMENTO Y EL METODO DE COMO FILTRAR
                Collections.sort(arrayOfSongs, Filter.YearComparator);//ORDENA DE MENOR A MAYOR LA LISTA 
                Collections.reverse(arrayOfSongs);//INVIERTE EL ORDEN DE LA LIST
                System.out.println("******* LISTA PRINCIPAL ORDENADA POR AÑO DEL MAS NUEVO AL MAS VIEJO*******");
                for (Song song : arrayOfSongs) {
                    System.out.println(song.getId() + " " + song.getTitle() + " " + song.getDate());
                }
                System.out.println("**********************************************************************");
            } else if ("5".equalsIgnoreCase(entradaTeclado)) {
                Collections.sort(arrayOfSongs, Filter.MinComparator);
                Collections.reverse(arrayOfSongs);
                System.out.println("******* LISTA PRINCIPAL ORDENADA POR MAYOR DURACION*******");
                for (Song song : arrayOfSongs) {
                    System.out.println(song.getId() + " " + song.getTitle() + " " + song.getMin());
                }
                System.out.println("**********************************************************************");
            } else if ("6".equalsIgnoreCase(entradaTeclado)) {
                Collections.sort(arrayOfSongs, Filter.MinComparator); 
                System.out.println("******* LISTA PRINCIPAL ORDENADA POR MENOR5 DURACION*******");
                for (Song song : arrayOfSongs) {
                    System.out.println(song.getId() + " " + song.getTitle() + " " + song.getMin());
                }
                System.out.println("**********************************************************************");
            } else {
                System.out.println("ERROR DE DATOS INGRESADOS");
            }
        }

    }
}
