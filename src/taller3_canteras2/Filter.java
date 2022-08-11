package taller3_canteras2;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Yurleidy Alcazar 
 */
public class Filter {

    public void filterGender(String gender, ArrayList<Song> arrayOfSongs) {
        System.out.println("*******LISTA FILTRADA POR GENERO*************");

        for (Song song : arrayOfSongs) {

            if (song.getGenre().equalsIgnoreCase(gender)) {

                System.out.println(song.getId() + " " + song.getTitle() + " " + song.getGenre());
            }
        }
        System.out.println("*********************************************");
    }

    public void filterDate(String year, ArrayList<Song> arrayOfSongs) {
        System.out.println("*******LISTA FILTRADA POR AÑO*************");
        for (Song song : arrayOfSongs) {
            if (String.valueOf(song.getDate()).equalsIgnoreCase(year)) {
                System.out.println(song.getId() + " " + song.getTitle() + " " + song.getGenre());
            }
        }
        System.out.println("*********************************************");
    }

    //Comparador para la fecha
    public static Comparator<Song> YearComparator = new Comparator<Song>() {
        @Override
        public int compare(Song t, Song t1) {
            int date1 = t.getDate();
            int date2 = t1.getDate();
            return date1 - date2;
            /*For descending order*/
            //rollno2-rollno1;
        }
    };

    //Comparador para la duracion
    public static Comparator<Song> MinComparator = new Comparator<Song>() {
        @Override
        public int compare(Song t, Song t1) {
            int date1 = t.getMin();
            int date2 = t1.getMin();
            return date1 - date2;
        }
    };

}
