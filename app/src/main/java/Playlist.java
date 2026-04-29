/**
 * Verwaltet eine Sammlung von Songs in Form einer einfach verketteten Liste.
 *
 * <p>Neue Songs werden am Anfang der Liste eingefügt. Die Playlist speichert
 * zusätzlich die aktuelle Anzahl der Songs und erlaubt grundlegende Operationen
 * wie Hinzufügen, Abspielen und Ausgeben der Songs.
 */
public class Playlist {

    //Attributes Declaration
    private final String name;
    private int size;
    private Song firstSong;

    /**
     * Erstellt eine neue Playlist mit dem gegebenen Namen.
     *
     * @param name Name der Playlist, must not be {@code null} or blank
     * @throws IllegalArgumentException wenn {@code name} {@code null} oder leer ist
     */
    public Playlist(String name){
        // avoids null and blank name
        if (name == null){
            throw new IllegalArgumentException("null name is not allowed");
        }
        if (name.isBlank()){
            throw new IllegalArgumentException("blank name is not allowed");
        }

        this.name = name;
        size = 0;
        firstSong = null;
    }

    //Getter
    public String getName(){return name;}
    public int getSize(){return size;}
    public Song getFirstSong(){return firstSong;}

    /**
     * Fügt einen Song zur Playlist hinzu, sofern dieser noch nicht enthalten ist.
     *
     * <p>Der Song wird am Anfang der Liste eingefügt. Ist der Song bereits vorhanden
     * (gemäß {@code equals}), wird er nicht erneut hinzugefügt.
     *
     * @param song der hinzuzufügende Song, must not be {@code null}
     * @return {@code true}, wenn der Song hinzugefügt wurde, sonst {@code false}
     * @throws IllegalArgumentException wenn {@code song} {@code null} ist
     */
    public boolean add(Song song){
        // avoids null song
        if (song == null){
            throw new IllegalArgumentException("null song is not allowed");
        }

        Song current = firstSong;
        if (firstSong == null){ //wenn noch kein Song vorhanden (startet die Playlist)
            firstSong = song;
            size++;
            return true;
        }


        while(true){ //iteriert bis zum Listenende
            if (current.equals(song)){ //wenn Song schon vorhanden
                return false;
            }

            if (current.getNextSong() == null){ //Listenende erreicht
                break;
            }

            current = current.getNextSong();
        }
        /*Neuer Song zeigt auf bisherigen Song und
        neuer Song wird neuer Kopf der Liste
         */
        song.setNextSong(firstSong);
        firstSong = song;
        size++;

        //Song erfolgreich hinzugefügt
        return true;
    }

    /**
     * Prüft, ob die Playlist mindestens einen Song mit dem angegebenen Genre enthält.
     *
     * @param genre das zu prüfende Genre, must not be {@code null}
     * @return {@code true}, wenn ein Song mit diesem Genre vorhanden ist, sonst {@code false}
     * @throws IllegalArgumentException wenn {@code genre} {@code null} ist
     */
    public boolean containsGenre(Genre genre){
        // avoids null genre
        if (genre == null){
            throw new IllegalArgumentException("null genre is not allowed");
        }

        Song current = firstSong;
        while(true){ //iteriert bis zum Listenende
            if (current.getGenre().equals(genre)){
                return true;
            }

            if (current.getNextSong() == null){ //Listenende erreicht
                break;
            }

            current = current.getNextSong();
        }

        return false;
    }

    /**
     * Spielt alle Songs der Playlist ab, indem für jeden Song {@code play()} aufgerufen wird.
     */
    public void playAll(){
        Song current = firstSong;
        while(true){ //iteriert bis zum Listenende
            current.play();

            if (current.getNextSong() == null){ //Listenende erreicht
                break;
            }

            current = current.getNextSong();
        }
    }

    /**
     * Gibt alle Songs der Playlist in der Konsole aus.
     *
     * <p>Die Ausgabe erfolgt in der Reihenfolge der verketteten Liste und nutzt
     * die {@code toString()}-Methode der jeweiligen Songs.
     */
    public void printPlaylist(){
        Song current = firstSong;
        while(true){ //iteriert bis zum Listenende
            System.out.println(current.toString());

            if (current.getNextSong() == null){ //Listenende erreicht
                break;
            }

            current = current.getNextSong();
        }
    }

//    public void printPlaylist(Genre genre){}
//
//    public int getTotalDuration(){}
//
//    public int getTotalEnergy(){}


}
