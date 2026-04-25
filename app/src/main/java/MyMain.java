public class MyMain {
    public static void main(String[] args){

        //Test Variabeln
        Song s1 = new Song("Blinding Lights", "The Weeknd", 200, Genre.POP);
        Song s2 = new Song("Bohemian Rhapsody", "Queen", 355, Genre.ROCK);

//        Genre description = Genre.POP;
//        System.out.println(description.getDescription());
//        Song song = new Song("Blinding Lights", "The Weeknd", 200, Genre.POP);
//        System.out.println(song.toString());
        Playlist playlist = new Playlist("MyPlaylist");
        playlist.add(s1);
        playlist.add(s1);

    }

}
