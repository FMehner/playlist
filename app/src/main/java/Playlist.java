public class Playlist {

    //Attributes Declaration
    private final String name;
    private int size;
    private Song firstSong;

    //Constructor (init)
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
