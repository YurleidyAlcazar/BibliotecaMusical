package taller3_canteras2;

/**
 * Esta clase corresponde a la canción con sus respectivos atributos y métodos.
 * @author Viviana Cifuentes
 */
public class Song {
     /**
      * Identificador de la canción.
      */
     private int id;
     /**
      * Título de la canción.
      */
     private String title;
     /**
      * Fecha de lanzamiento de la canción.
      */
     private int date;
     /**
      * Duración en minutos de la canción.
      */
     private int min;
     /**
      * Duración en segundos de la canción.
      */
     private int seg;
     /**
      * Género musical de la canción.
      */
     private String genre;
     /**
      * Carátula de la canción (en este caso se está agregando las iniciales de cada título).
      */
     private String cover;
     /**
      * Descripción corta y relevante de la canción.
      */
     private String shortDescription;
     
    /**
     * Método constructor por defecto para instanciar la clase canción.
     */
    public Song() {
    }
    
    /**
     * Método constuctor parametrizado encargado de recolectar los datos de la clase. 
     * @param id Identificador de la canción.
     * @param title Título de la canción.
     * @param date Fecha de lanzamiento de la canción.
     * @param min Duración en segundos de la canción.
     * @param seg Duración en segundos de la canción.
     * @param genre Género musical de la canción.
     * @param cover Carátula de la canción (en este caso se está agregando las iniciales de cada título).
     * @param shortDescription Descripción corta y relevante de la canción.
     */
    public Song(int id, String title, int date, int min, int seg, String genre, String cover, String shortDescription) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.min = min;
        this.seg = seg;
        this.genre = genre;
        this.cover = cover;
        this.shortDescription = shortDescription;
    }

    /**
     * Método para regregresar el Id de la canción.
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Establecer el id de la canción.
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método para regresar el título de la canción.
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Establecer el título de la cación.
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Método para regresar la fecha de la canción.
     * @return the date
     */
    public int getDate() {
        return date;
    }

    /**
     * Establecer la fecha de la canción.
     * @param date the date to set
     */
    public void setDate(int date) {
        this.date = date;
    }

    /**
     * Método para regresar la duración en minutos de la canción.
     * @return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * Establecer la duración en minutos de la canción.
     * @param min the min to set
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * Método para regresar la duración en segundos de la canción.
     * @return the seg
     */
    public int getSeg() {
        return seg;
    }

    /**
     * Establecer la duración en segundos de la canción.
     * @param seg the seg to set
     */
    public void setSeg(int seg) {
        this.seg = seg;
    }

    /**
     * Método para regresar el género de la canción.
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Establecer el género de la canción.
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Método para regresar la carátula de la canción.
     * @return the cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * Establecer la carátula de la canción.
     * @param cover the cover to set
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * Método para regresar una descripción corta de la canción.
     * @return the shortDescription
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Establecer una descripción corta de la canción.
     * @param shortDescription the shortDescription to set
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
     
    
    
}
