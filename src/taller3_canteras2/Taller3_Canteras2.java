package taller3_canteras2;
import java.util.Scanner;

/**
 * Main catalogado como Biblioteca Principal
 * @author Viviana Cifuentes
 * @version 1.3
 */
public class Taller3_Canteras2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /** Se instancia objeto Librería */
        MainLibrary Biblioteca = new MainLibrary();
        /** Menú principal. */
        System.out.println("¡Bienvenidos!");
        System.out.println("A continuación Biblioteca Principal");
        /** Imprimir las canciones en consola*/
        Biblioteca.printSongs();
        for (int i = 0; i < 10; i++) {
            /** Opciones disponibles para seleccionar */
            System.out.println("\nTipee el numero de la opcion a ejecutar");
            System.out.println("1 Filtrar por Genero");
            System.out.println("2 Filtrar por Año");
            System.out.println("3 Ordenar por Año mas viejo al mas nuevo");
            System.out.println("4 Ordenar por Año mas nuevo al mas viejo");
            System.out.println("5 Ordenar por Mayor duracion");
            System.out.println("6 Ordenar por Menor duracion");
            System.out.println("7. Crear una Playlist personalizada");
            Scanner entradaEscaner = new Scanner(System.in); 
            String entradaTeclado = entradaEscaner.next();   
            /** condicionales para la opción seleccionada por consola */
            if ("1".equalsIgnoreCase(entradaTeclado)) {
                System.out.println("Tipee el género: ");
                entradaTeclado = entradaEscaner.next();
                Biblioteca.filterGender(entradaTeclado);
            }else if ("2".equalsIgnoreCase(entradaTeclado)) {
                System.out.println("Tipee el año: ");
                entradaTeclado = entradaEscaner.next();
                Biblioteca.filterDate(entradaTeclado);
            }else if ("3".equalsIgnoreCase(entradaTeclado)) {
                Biblioteca.sortByOldestDate();
            }else if ("4".equalsIgnoreCase(entradaTeclado)) {
                Biblioteca.sortByNewestDate();
            }else if ("5".equalsIgnoreCase(entradaTeclado)) {
                Biblioteca.sortByLongestSong();
            }else if ("6".equalsIgnoreCase(entradaTeclado)) {
                Biblioteca.sortByShortestSong();
            }else if ("7".equalsIgnoreCase(entradaTeclado)) {
                CustomPlayList pl = new CustomPlayList();
                pl.createPlaylist();
                pl.addSongsToPlayList();
            }
        }   
        
    }
    
}
