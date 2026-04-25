import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SongTest {

    /*
    @Test
    public void testConstructor() {

        Song song = new Song("Bohemian Rhapsody", "Queen", 355, Genre.ROCK);
        assertEquals("Bohemian Rhapsody", song.getTitle(), "title must be Bohemian Rhapsody");
        assertEquals("Queen", song.getArtist(), "artist must be Queen");
        assertEquals(355, song.getDurationSeconds(), "duration must be 355");
        assertEquals(Genre.ROCK, song.getGenre(), "genre must be ROCK");
        assertEquals(0, song.getPlayCount(), "play count must be 0");
        assertNull(song.getNextSong(), "next song must be null");

        assertThrows(IllegalArgumentException.class,
                () -> new Song(null, "Queen", 355, Genre.ROCK),
                "null title is not allowed");

        assertThrows(IllegalArgumentException.class,
                () -> new Song("   ", "Queen", 355, Genre.ROCK),
                "blank title is not allowed");

        assertThrows(IllegalArgumentException.class,
                () -> new Song("Bohemian Rhapsody", null, 355, Genre.ROCK),
                "null artist is not allowed");

        assertThrows(IllegalArgumentException.class,
                () -> new Song("Bohemian Rhapsody", "  ", 355, Genre.ROCK),
                "blank artist is not allowed");

        assertThrows(IllegalArgumentException.class,
                () -> new Song("Bohemian Rhapsody", "Queen", 0, Genre.ROCK),
                "duration 0 is not allowed");

        assertThrows(IllegalArgumentException.class,
                () -> new Song("Bohemian Rhapsody", "Queen", -1, Genre.ROCK),
                "negative duration is not allowed");

        assertThrows(IllegalArgumentException.class,
                () -> new Song("Bohemian Rhapsody", "Queen", 355, null),
                "null genre is not allowed");

    }

    */
    /*
    @Test
    public void testCopyConstructor() {

        Song song = new Song("Bohemian Rhapsody", "Queen", 355, Genre.ROCK);
        Song anotherSong = new Song("Blinding Lights", "The Weeknd", 200, Genre.POP);
        song.setNextSong(anotherSong);

        // Play the original a few times to test playCount copy
        song.play();
        song.play();

        Song copy = new Song(song);
        assertEquals("Bohemian Rhapsody", copy.getTitle(), "title of copy must be Bohemian Rhapsody");
        assertEquals("Queen", copy.getArtist(), "artist of copy must be Queen");
        assertEquals(355, copy.getDurationSeconds(), "duration of copy must be 355");
        assertEquals(Genre.ROCK, copy.getGenre(), "genre of copy must be ROCK");
        assertEquals(2, copy.getPlayCount(), "play count of copy must be 2");
        assertSame(anotherSong, copy.getNextSong(), "next song of copy must be the same as next song of original");

        assertThrows(IllegalArgumentException.class,
                () -> new Song(null),
                "null song is not allowed");

    }
    */

    /*
    @Test
    public void testPlay() {

        Song song = new Song("Bohemian Rhapsody", "Queen", 355, Genre.ROCK);
        assertEquals(0, song.getPlayCount(), "play count must be 0 initially");

        song.play();
        assertEquals(1, song.getPlayCount(), "play count must be 1 after one play");

        song.play();
        song.play();
        assertEquals(3, song.getPlayCount(), "play count must be 3 after three plays");

    }
    */

    /*
    @Test
    public void testGetFormattedDuration() {

        Song song1 = new Song("Test", "Artist", 245, Genre.POP);
        assertEquals("4:05", song1.getFormattedDuration(), "245 seconds must be 4:05");

        Song song2 = new Song("Test", "Artist", 60, Genre.POP);
        assertEquals("1:00", song2.getFormattedDuration(), "60 seconds must be 1:00");

        Song song3 = new Song("Test", "Artist", 355, Genre.POP);
        assertEquals("5:55", song3.getFormattedDuration(), "355 seconds must be 5:55");

        Song song4 = new Song("Test", "Artist", 30, Genre.POP);
        assertEquals("0:30", song4.getFormattedDuration(), "30 seconds must be 0:30");

        Song song5 = new Song("Test", "Artist", 3, Genre.POP);
        assertEquals("0:03", song5.getFormattedDuration(), "3 seconds must be 0:03");

    }
    */

    /*
    @Test
    public void testGetEnergy() {

        // ROCK: 1.5 * 355 / 60 = 8.875 -> rounds to 9
        Song song = new Song("Bohemian Rhapsody", "Queen", 355, Genre.ROCK);
        assertEquals(9, song.getEnergy(), "energy of Bohemian Rhapsody must be 9");

        // POP: 1.0 * 200 / 60 = 3.333 -> rounds to 3
        Song song2 = new Song("Blinding Lights", "The Weeknd", 200, Genre.POP);
        assertEquals(3, song2.getEnergy(), "energy of Blinding Lights must be 3");

        // CLASSICAL: 0.5 * 180 / 60 = 1.5 -> rounds to 2
        Song song3 = new Song("Für Elise", "Beethoven", 180, Genre.CLASSICAL);
        assertEquals(2, song3.getEnergy(), "energy of Für Elise must be 2");

    }
    */

    /*
    @Test
    public void testEquals() {

        Song song = new Song("Bohemian Rhapsody", "Queen", 355, Genre.ROCK);

        assertTrue(song.equals(song), "identical songs must be equal");
        assertFalse(song.equals(null), "null is not equal");
        assertFalse(song.equals("Song!"), "String is a different type");

        assertFalse(song.equals(new Song("Another Song", "Queen", 355, Genre.ROCK)),
                "songs with different titles are not equal");

        assertFalse(song.equals(new Song("Bohemian Rhapsody", "Other Artist", 355, Genre.ROCK)),
                "songs with different artists are not equal");

        assertFalse(song.equals(new Song("Bohemian Rhapsody", "Queen", 200, Genre.ROCK)),
                "songs with different durations are not equal");

        assertFalse(song.equals(new Song("Bohemian Rhapsody", "Queen", 355, Genre.POP)),
                "songs with different genres are not equal");

        // Play count must NOT affect equality
        Song other = new Song("Bohemian Rhapsody", "Queen", 355, Genre.ROCK);
        other.play();
        other.play();
        assertTrue(song.equals(other), "songs with different play counts must be equal");

        // Next song must NOT affect equality
        Song another = new Song("Bohemian Rhapsody", "Queen", 355, Genre.ROCK);
        another.setNextSong(new Song("Test", "Test", 100, Genre.POP));
        assertTrue(song.equals(another), "songs with different next songs must be equal");

        assertTrue(song.equals(new Song("Bohemian Rhapsody", "Queen", 355, Genre.ROCK)),
                "equal must return true for equal songs");

    }
    */

    /*
    @Test
    public void testSetNextSong() {

        Song song = new Song("Bohemian Rhapsody", "Queen", 355, Genre.ROCK);
        Song next = new Song("Blinding Lights", "The Weeknd", 200, Genre.POP);

        assertNull(song.getNextSong(), "next song must be null initially");

        song.setNextSong(next);
        assertSame(next, song.getNextSong(), "next song must be set correctly");

        song.setNextSong(null);
        assertNull(song.getNextSong(), "next song must be null after setting to null");

    }
    */

}
