package taller3_canteras2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


/**
 * Esta  clase contien los métodos de la biblioteca Principal
 * @author Viviana Cifuentes
 * @version 1.3
 */
public class MainLibrary {
    /**
    * Se agrega ArrayList para almacenar las canciones dentro de la Biblioteca principal.
    * @author Viviana Cifuentes
    */
    public static ArrayList<Song> arrayOfSongs = new ArrayList<>();
    
    /**
     * Método constructor por defecto.
     */
    public MainLibrary() {
    }
      
    /**
     * Método para agregar canciones al ArrayList y a su vez se instancia el objeto canción.
     */
    public void addSong(){
        arrayOfSongs.add(new Song(01,"Cali Ají", 1990, "7:26", "salsa", "CA", "Album Cielo de Tambores"));
        arrayOfSongs.add(new Song(02,"Amores Lejanos", 2002, "4:54", "rock", "AL", "Album de Enanitos Verdes"));
        arrayOfSongs.add(new Song(03,"Magic", 2014, "5:16", "rock", "M", "Album Ghost Stories"));
        arrayOfSongs.add(new Song(04,"Put yor head on my shoulder", 1958, "2:43", "rock", "PYHOMS", "is a song written by Canadian-born singer-songwriter Paul Anka"));
        arrayOfSongs.add(new Song(05,"La Inocente", 2022, "3:22", "reggaeton", "LI", "Album de Feid & Mora"));
        arrayOfSongs.add(new Song(06,"Estos Celos", 2007, "3:06", "ranchera", "EC", "Album Para Siempre"));
        arrayOfSongs.add(new Song(07,"PlasticHearts", 2020, "3:28", "pop", "PH", "Album Plastic Hearts"));
        arrayOfSongs.add(new Song(07,"Is there someone else?", 2022, "3:19", "pop", "ITSE", "Album Dawn FM"));
    }
    
    /**
    * Método encargado de imprimir las canciones en pantalla.
    * @author Viviana Cifuentes
    */
    public void printSongs(){
        addSong();
        for (Song song: arrayOfSongs) {
            System.out.println(song.getId()+". "+song.getTitle());
        }
    }
    /**
     * Método para filtrar las canciones de la biblioteca principal por género.
     * @param gender será introducido por el usuario
     */
    public void filterGender(String gender) {               
        System.out.println("*******LISTA FILTRADA POR GENERO*************");
        for (Song song : arrayOfSongs) {
            if (song.getGenre().equalsIgnoreCase(gender)) {
                System.out.println(song.getId() + " " + song.getTitle() + " " + song.getGenre());  
            }
        }
        System.out.println("********************************************");
    }
    
    /**
     * Método para filtrar las canciones de la biblioteca principal por año de lanzamiento.
     * @param year 
     */
    public void filterDate(String year) {
        System.out.println("*******LISTA FILTRADA POR AÑO*************");
        for (Song song : arrayOfSongs) {
            if (String.valueOf(song.getDate()).equalsIgnoreCase(year)) {
                System.out.println(song.getId() + " " + song.getTitle() + " " + song.getGenre());
            }
        }
        System.out.println("******************************************");
    }
    
    /**
     * Método para ordenar las canciones de la biblioteca principal de la canción más nueva a la más vieja.
     */
    public void sortByNewestDate(){
        System.out.println("\n Lista de canciones ordenadas por la canción más reciente: ");
        Collections.sort(arrayOfSongs, new Comparator<Song>() {			
            @Override
            public int compare(Song o1, Song o2) {
                return new Integer(o2.getDate()).compareTo(new Integer(o1.getDate()));
            }		
        });
    printListSongsByDate();
    }
    
    /**
     * Método para ordenar las canciones de la biblioteca principal de la canción más vieja a la más nueva.
     */
    public void sortByOldestDate(){
        System.out.println("\n Lista de canciones ordenadas por la canción más antigua:");
        Collections.sort(arrayOfSongs, new Comparator<Song>() {			
            @Override
            public int compare(Song o1, Song o2) {
                return new Integer(o1.getDate()).compareTo(new Integer(o2.getDate()));
            }		
        });
    printListSongsByDate();
    }
    
    /**
     * Método para imprimir las canciones en pantalla con información del año de lanzamiento.
     */
    private static void printListSongsByDate() {
	Iterator<Song> itrArrayList = arrayOfSongs.iterator();
	int posicion = 1;
	while (itrArrayList.hasNext()) {
	    System.out.println(posicion + ". " + itrArrayList.next().toStringDate());
	    posicion++;
	}
    }
    
    /**
     * Método para ordenar las canciones de la más larga a la más corta.
     */
    public void sortByLongestSong(){
        System.out.println("\n Lista de canciones ordenadas por la canción más larga: ");
        Collections.sort(arrayOfSongs, new Comparator<Song>() {			
            @Override
            public int compare(Song o1, Song o2) {
                return new String(o2.getDuration()).compareTo(new String(o1.getDuration()));
            }		
        });
    printListSongsByDuration();
    }
    
    /**
     * Método para ordenar las canciones de la más corta a la más larga.
     */
    public void sortByShortestSong(){
        System.out.println("\n Lista de canciones ordenadas por la canción más corta:");
        Collections.sort(arrayOfSongs, new Comparator<Song>() {			
            @Override
            public int compare(Song o1, Song o2) {
                return new String(o1.getDuration()).compareTo(new String(o2.getDuration()));
            }		
        });
    printListSongsByDuration();
    }
    
    /**
     * Método para imprimir las canciones en pantalla con información de la duración de la canción.
     */
    private static void printListSongsByDuration() {
	Iterator<Song> itrArrayList = arrayOfSongs.iterator();
	int posicion = 1;
	while (itrArrayList.hasNext()) {
	    System.out.println(posicion + ". " + itrArrayList.next().toStringDuration());
	    posicion++;
	}
    }

}
    
    


