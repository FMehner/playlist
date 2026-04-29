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


        while(current != null){ //iteriert bis zum Listenende
            if (current.equals(song)){ //wenn Song schon vorhanden
                return false;
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
        while(current != null){ //iteriert bis zum Listenende
            if (current.getGenre().equals(genre)){
                return true;
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
        while(current != null){ //iteriert bis zum Listenende
            current.play();
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
        while(current != null){ //iteriert bis zum Listenende
            System.out.println(current.toString());
            current = current.getNextSong();
        }
    }

    /**
     * Gibt alle Songs der Playlist aus, die dem angegebenen Genre entsprechen.
     *
     * <p>Die Ausgabe erfolgt in der Konsole in der Reihenfolge der verketteten Liste.
     * Es werden nur Songs berücksichtigt, deren Genre dem Parameter entspricht.
     *
     * @param genre das zu filternde Genre, must not be {@code null}
     * @throws IllegalArgumentException wenn {@code genre} {@code null} ist
     */
    public void printPlaylist(Genre genre){ //Ähnlicher Code wie in containsGenre()
        // avoids null genre
        if (genre == null){
            throw new IllegalArgumentException("null genre is not allowed");
        }

        Song current = firstSong;
        while(current != null){ //iteriert bis zum Listenende
            if (current.getGenre().equals(genre)){
                System.out.println(current.toString());
            }
            current = current.getNextSong();
        }
    }

    /**
     * Berechnet die Gesamtdauer aller Songs in der Playlist.
     *
     * @return die Summe der Dauer aller Songs in Sekunden;
     *         {@code 0}, wenn die Playlist leer ist
     */
    public int getTotalDuration(){
        Song current = firstSong;
        int totalDuration = 0;

        while(current != null){ //iteriert bis zum Listenende
            totalDuration += current.getDurationSeconds();
            current = current.getNextSong();
        }
        return totalDuration;
    }

    /**
     * Berechnet die Gesamtenergie aller Songs in der Playlist.
     *
     * <p>Die Energie eines Songs wird über {@code Song.getEnergy()} bestimmt.
     *
     * @return die Summe der Energie aller Songs;
     *         {@code 0}, wenn die Playlist leer ist
     */
    public int getTotalEnergy(){
        Song current = firstSong;
        int totalEnergy = 0;

        while(current != null){ //iteriert bis zum Listenende
            totalEnergy += current.getEnergy();
            current = current.getNextSong();
        }
        return totalEnergy;
    }
    /**
     * Entfernt den ersten Song aus der Playlist, der dem übergebenen Song entspricht.
     *
     * <p>Wird der Song gefunden, wird er aus der verketteten Liste entfernt und die Größe
     * der Playlist entsprechend angepasst. Ist der Song nicht enthalten, bleibt die
     * Playlist unverändert.
     *
     * @param song der zu entfernende Song, must not be {@code null}
     * @return {@code true}, wenn ein Song entfernt wurde, sonst {@code false}
     * @throws IllegalArgumentException wenn {@code song} {@code null} ist
     */
    public boolean delete(Song song){
        if (song == null){
            throw new IllegalArgumentException("null song is not allowed");
        }

        if (firstSong == null) return false;

        //Sonderfall: Erstes Element löschen
        if (firstSong.equals(song)){
            firstSong = firstSong.getNextSong(); // = null
            size--;
            return true;
        }

        Song current = firstSong;

        while (current.getNextSong() != null){
            if (current.getNextSong().equals(song)){
                current.setNextSong(current.getNextSong().getNextSong()); //Verschiebt Zeiger von A->B zu A->C, weil B gelöscht wird
                size--;
                return true;
            }
            current = current.getNextSong();
        }
        return false;
    }


}
