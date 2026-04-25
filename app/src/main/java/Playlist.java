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
        if (firstSong == null){
            firstSong = song;
            size++;
            return true;
        }


        while(true){
            if (current.equals(song)){
                return false;
            }

            if (current.getNextSong() == null){
                break;
            }

            current = current.getNextSong();
        }
        song.setNextSong(firstSong);
        firstSong = song;
        size++;
        return true;
    }


//    public boolean containsGenre(Genre genre){}
//
//    public void playAll(){}
//
//    public void printPlaylist(){}
//
//    public void printPlaylist(Genre genre){}
//
//    public int getTotalDuration(){}
//
//    public int getTotalEnergy(){}


}
