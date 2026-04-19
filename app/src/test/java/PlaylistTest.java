import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlaylistTest {

    /*
    private Song s1;
    private Song s2;
    private Song s3;

    @BeforeEach
    public void init() {
        s1 = new Song("Bohemian Rhapsody", "Queen", 355, Genre.ROCK);
        s2 = new Song("Blinding Lights", "The Weeknd", 200, Genre.POP);
        s3 = new Song("Lose Yourself", "Eminem", 326, Genre.HIP_HOP);
    }

    @Test
    public void testConstructor() {

        Playlist playlist = new Playlist("My Playlist");
        assertEquals("My Playlist", playlist.getName(), "name must be My Playlist");
        assertEquals(0, playlist.getSize(), "empty playlist has size 0");
        assertNull(playlist.getFirstSong(), "empty playlist has no first song");

        assertThrows(IllegalArgumentException.class,
                () -> new Playlist(null),
                "null name is not allowed");

        assertThrows(IllegalArgumentException.class,
                () -> new Playlist("   "),
                "blank name is not allowed");

    }
    */

    /*
    @Test
    public void testAdd() {

        Playlist playlist = new Playlist("Test");

        assertTrue(playlist.add(s1), "must return true on s1");
        assertEquals(1, playlist.getSize(), "size must be 1");
        assertSame(s1, playlist.getFirstSong(), "first song must be s1");
        assertNull(s1.getNextSong(), "next song of first song must be null");

        assertTrue(playlist.add(s2), "must return true on s2");
        assertEquals(2, playlist.getSize(), "size must be 2");
        assertSame(s2, playlist.getFirstSong(), "first song must be s2");
        assertSame(s1, s2.getNextSong(), "next song of first song must be s1");
        assertNull(s1.getNextSong(), "next song of second song must be null");

        assertTrue(playlist.add(s3), "must return true on s3");
        assertEquals(3, playlist.getSize(), "size must be 3");
        assertSame(s3, playlist.getFirstSong(), "first song must be s3");
        assertSame(s2, s3.getNextSong(), "next song of first song must be s2");
        assertSame(s1, s2.getNextSong(), "next song of second song must be s1");
        assertNull(s1.getNextSong(), "next song of third song must be null");

        assertThrows(IllegalArgumentException.class,
                () -> playlist.add(null),
                "null song is not allowed");

        assertFalse(playlist.add(new Song("Bohemian Rhapsody", "Queen", 355, Genre.ROCK)),
                "must return false when song equal to s1 is added again");

    }
    */

    /*
    @Test
    public void testContainsGenre() {

        Playlist playlist = new Playlist("Test");
        playlist.add(s1);
        playlist.add(s2);

        assertTrue(playlist.containsGenre(Genre.ROCK), "must return true for ROCK");
        assertTrue(playlist.containsGenre(Genre.POP), "must return true for POP");
        assertFalse(playlist.containsGenre(Genre.HIP_HOP), "must return false for HIP_HOP");
        assertFalse(playlist.containsGenre(Genre.CLASSICAL), "must return false for CLASSICAL");
        assertFalse(playlist.containsGenre(Genre.ELECTRONIC), "must return false for ELECTRONIC");

        assertThrows(IllegalArgumentException.class,
                () -> playlist.containsGenre(null),
                "null genre is not allowed");

    }
    */

    /*
    @Test
    public void testPlayAll() {

        Playlist playlist = new Playlist("Test");
        playlist.add(s3);
        playlist.add(s2);
        playlist.add(s1);

        assertEquals(0, s1.getPlayCount(), "play count of s1 must be 0 before playAll");
        assertEquals(0, s2.getPlayCount(), "play count of s2 must be 0 before playAll");
        assertEquals(0, s3.getPlayCount(), "play count of s3 must be 0 before playAll");

        playlist.playAll();

        assertEquals(1, s1.getPlayCount(), "play count of s1 must be 1 after playAll");
        assertEquals(1, s2.getPlayCount(), "play count of s2 must be 1 after playAll");
        assertEquals(1, s3.getPlayCount(), "play count of s3 must be 1 after playAll");

        playlist.playAll();

        assertEquals(2, s1.getPlayCount(), "play count of s1 must be 2 after second playAll");
        assertEquals(2, s2.getPlayCount(), "play count of s2 must be 2 after second playAll");
        assertEquals(2, s3.getPlayCount(), "play count of s3 must be 2 after second playAll");

    }
    */

    /*
    @Test
    public void testGetTotalDuration() {

        Playlist playlist = new Playlist("Test");
        assertEquals(0, playlist.getTotalDuration(), "total duration of empty playlist must be 0");

        playlist.add(s1);
        assertEquals(355, playlist.getTotalDuration(), "total duration must be 355 after adding s1");

        playlist.add(s2);
        assertEquals(555, playlist.getTotalDuration(), "total duration must be 555 after adding s2");

        playlist.add(s3);
        assertEquals(881, playlist.getTotalDuration(), "total duration must be 881 after adding s3");

    }
    */

    /*
    @Test
    public void testGetTotalEnergy() {

        Playlist playlist = new Playlist("Test");
        assertEquals(0, playlist.getTotalEnergy(), "total energy of empty playlist must be 0");

        // ROCK: 1.5 * 355 / 60 = 8.875 -> 9
        playlist.add(s1);
        assertEquals(9, playlist.getTotalEnergy(), "total energy must be 9 after adding s1");

        // POP: 1.0 * 200 / 60 = 3.333 -> 3
        playlist.add(s2);
        assertEquals(12, playlist.getTotalEnergy(), "total energy must be 12 after adding s2");

        // HIP_HOP: 2.0 * 326 / 60 = 10.867 -> 11
        playlist.add(s3);
        assertEquals(23, playlist.getTotalEnergy(), "total energy must be 23 after adding s3");

    }
    */

    /*
    @Test
    public void testContainsGenreEmptyPlaylist() {

        Playlist playlist = new Playlist("Empty");
        assertFalse(playlist.containsGenre(Genre.ROCK), "empty playlist must not contain ROCK");

    }
    */

    /*
    @Test
    public void testPlayAllEmptyPlaylist() {

        Playlist playlist = new Playlist("Empty");
        // Should not throw any exception
        playlist.playAll();

    }
    */

}
