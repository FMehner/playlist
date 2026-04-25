public class Song {

    //Attributes Declaration
    private final String title;
    private final String artist;
    private final int durationSeconds;
    private final Genre genre;
    private int playCount;
    private Song nextSong;

    //Constructor
    public Song(String title, String artist, int durationSeconds, Genre genre){
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



    //Flache Kopie: Attribute werden kopiert, aber zeigen noch auf das gleiche Objekt
    public Song(Song other){
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


    public void play(){
        playCount++;
    }

    public String getFormattedDuration(){
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);// "d" für normale Zahlen; "02d" Zahl mit führender Null
    }

    @Override
    public boolean equals(Object other){
        if (this == other) return true; //Prüft, ob gleiches Objekt im Speicher
        if (!(other instanceof Song)){ return false;} //Prüft ob other kein Song ist oder null ist

        Song song = (Song) other;

        return durationSeconds == song.durationSeconds
                && title.equals(song.title)
                && artist.equals(song.artist)
                && genre == song.genre;
    }

    public String toString(){
        return title + " - "
                + artist + " ("
                + getFormattedDuration() + ") ["
                + genre + " ["
                + genre.getSymbol() + "]] Plays: "
                + playCount;
    }


}
