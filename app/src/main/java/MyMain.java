public class MyMain {
    public static void main(String[] args){
//        Genre description = Genre.POP;
//        System.out.println(description.getDescription());
        Song song = new Song(null, "Queen", 355, Genre.ROCK);
        System.out.println(song.getTitle());
    }

}
