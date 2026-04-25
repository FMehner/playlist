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
}
