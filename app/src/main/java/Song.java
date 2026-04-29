/**
 * Repräsentiert einen Song in einer Playlist.
 *
 * <p>Ein Song besitzt Titel, Artist, Dauer und Genre. Zusätzlich wird
 * gezählt, wie oft der Song abgespielt wurde. Songs können über eine
 * Referenz auf den nächsten Song zu einer verketteten Liste verbunden werden.
 */
public class Song {

    //Attributes Declaration
    private final String title;
    private final String artist;
    private final int durationSeconds;
    private final Genre genre;
    private int playCount;
    private Song nextSong;

    /**
     * Erstellt einen neuen Song mit den angegebenen Eigenschaften.
     *
     * @param title Titel des Songs, must not be {@code null} or blank
     * @param artist Interpret des Songs, must not be {@code null} or blank
     * @param durationSeconds Dauer in Sekunden, must be > {@code 0}
     * @param genre Genre des Songs, must not be {@code null}
     * @throws IllegalArgumentException wenn ein Parameter ungültig ist
     */
    public Song(String title, String artist, int durationSeconds, Genre genre){ //Constructor
        // avoids null and blank Title
        if (title == null){
            throw new IllegalArgumentException("null title is not allowed");
        }
        if(title.isBlank()){
            throw new IllegalArgumentException("blank title is not allowed");
        }

        // avoids null and blank artist
        if (artist == null){
            throw new IllegalArgumentException("null artist is not allowed");
        }
        if(artist.isBlank()){
            throw new IllegalArgumentException("blank artist is not allowed");
        }

        // avoids 0 and negative Duration
        if (durationSeconds == 0){
            throw new IllegalArgumentException("duration 0 is not allowed");
        }
        if (durationSeconds < 0){
            throw new IllegalArgumentException("negative duration is not allowed");
        }

        // avoids null genre
        if (genre == null){
            throw new IllegalArgumentException("null genre is not allowed");
        }

        // avoids müssen schon im Constructor stehen, da dort schon die null-Exceptions entstehen

        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
        this.genre = genre;
        playCount = 0;
        nextSong = null;
    }

    //Getter
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
    public int getDurationSeconds(){return durationSeconds;}
    public Genre getGenre(){return genre;}
    public int getPlayCount(){return playCount;}
    public Song getNextSong(){return nextSong;}
    public int getEnergy(){
        return genre.getEnergyForDuration(durationSeconds);
    }



    /**
     * Erstellt eine flache Kopie eines Songs.
     *
     * <p>Alle Attribute werden übernommen. Die Referenz {@code nextSong}
     * wird nicht kopiert, sondern direkt übernommen (flache Kopie).
     *
     * @param other der zu kopierende Song, must not be {@code null}
     * @throws IllegalArgumentException wenn {@code other} {@code null} ist
     */
    public Song(Song other){ //Flache Kopie: Attribute werden kopiert, aber zeigen noch auf das gleiche Objekt
        if (other == null){
            throw new IllegalArgumentException("null song is not allowed");
        }
        this.title = other.title;
        this.artist = other.artist;
        this.durationSeconds = other.durationSeconds;
        this.genre = other.genre;
        this.playCount = other.playCount;
        this.nextSong = other.nextSong;
    }

    //Setter
    public void setNextSong(Song nextSong){this.nextSong = nextSong;}

    /**
     * Erhöht den Abspielzähler des Songs um 1.
     */
    public void play(){
        playCount++;
    }

    /**
     * Gibt die Dauer des Songs im Format {@code m:ss} zurück.
     *
     * @return formatierte Dauer (z. B. {@code 4:05})
     */
    public String getFormattedDuration(){
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);// "d" für normale Zahlen; "02d" Zahl mit führender Null
    }

    /**
     * Vergleicht diesen Song mit einem anderen Objekt auf Gleichheit.
     *
     * <p>Zwei Songs gelten als gleich, wenn Titel, Interpret, Dauer und Genre
     * übereinstimmen. {@code playCount} und {@code nextSong} werden nicht berücksichtigt.
     *
     * @param other das zu vergleichende Objekt
     * @return {@code true}, wenn die Songs gleich sind, sonst {@code false}
     */
    @Override //weil sonst equals() von Object hergenommen wirdSong
    public boolean equals(Object other){
        if (this == other) return true; //Prüft, ob gleiches Objekt im Speicher
        if (!(other instanceof Song)){ return false;} //Prüft ob other kein Song ist oder null ist

        Song song = (Song) other;

        return durationSeconds == song.durationSeconds
                && title.equals(song.title)
                && artist.equals(song.artist)
                && genre == song.genre;
    }

    /**
     * Gibt eine String-Repräsentation des Songs zurück.
     *
     * <p>Format: {@code Titel - Interpret (m:ss) [Genre Symbol] Plays: x}
     *
     * @return String-Repräsentation des Songs
     */
    public String toString(){
        return title + " - "
                + artist + " ("
                + getFormattedDuration() + ") ["
                + genre + " "
                + genre.getSymbol() + "] Plays: "
                + playCount;
    }


}
