import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GenreTest {

    /*
    @Test
    public void testValues() {
        assertEquals("Pop", Genre.POP.getDescription(), "Description of POP must be Pop");
        assertEquals("Rock", Genre.ROCK.getDescription(), "Description of ROCK must be Rock");
        assertEquals("Klassik", Genre.CLASSICAL.getDescription(), "Description of CLASSICAL must be Klassik");
        assertEquals("Hip-Hop", Genre.HIP_HOP.getDescription(), "Description of HIP_HOP must be Hip-Hop");
        assertEquals("Elektronisch", Genre.ELECTRONIC.getDescription(), "Description of ELECTRONIC must be Elektronisch");

        assertEquals(1.0, Genre.POP.getEnergyMultiplier(), "Energy multiplier of POP must be 1.0");
        assertEquals(1.5, Genre.ROCK.getEnergyMultiplier(), "Energy multiplier of ROCK must be 1.5");
        assertEquals(0.5, Genre.CLASSICAL.getEnergyMultiplier(), "Energy multiplier of CLASSICAL must be 0.5");
        assertEquals(2.0, Genre.HIP_HOP.getEnergyMultiplier(), "Energy multiplier of HIP_HOP must be 2.0");
        assertEquals(1.75, Genre.ELECTRONIC.getEnergyMultiplier(), "Energy multiplier of ELECTRONIC must be 1.75");

        assertEquals("[P]", Genre.POP.getSymbol(), "Symbol of POP must be [P]");
        assertEquals("[R]", Genre.ROCK.getSymbol(), "Symbol of ROCK must be [R]");
        assertEquals("[C]", Genre.CLASSICAL.getSymbol(), "Symbol of CLASSICAL must be [C]");
        assertEquals("[H]", Genre.HIP_HOP.getSymbol(), "Symbol of HIP_HOP must be [H]");
        assertEquals("[E]", Genre.ELECTRONIC.getSymbol(), "Symbol of ELECTRONIC must be [E]");
    }



    @Test
    public void testGetEnergyForDuration() {
        // POP: 1.0 * 60 / 60 = 1
        assertEquals(1, Genre.POP.getEnergyForDuration(60), "POP energy for 60s must be 1");

        // ROCK: 1.5 * 240 / 60 = 6
        assertEquals(6, Genre.ROCK.getEnergyForDuration(240), "ROCK energy for 240s must be 6");

        // CLASSICAL: 0.5 * 180 / 60 = 1.5 -> rounds to 2
        assertEquals(2, Genre.CLASSICAL.getEnergyForDuration(180), "CLASSICAL energy for 180s must be 2");

        // HIP_HOP: 2.0 * 300 / 60 = 10
        assertEquals(10, Genre.HIP_HOP.getEnergyForDuration(300), "HIP_HOP energy for 300s must be 10");

        // ELECTRONIC: 1.75 * 120 / 60 = 3.5 -> rounds to 4
        assertEquals(4, Genre.ELECTRONIC.getEnergyForDuration(120), "ELECTRONIC energy for 120s must be 4");

        // Edge case: small duration
        // POP: 1.0 * 1 / 60 = 0.0167 -> rounds to 0
        assertEquals(0, Genre.POP.getEnergyForDuration(1), "POP energy for 1s must be 0");

        // ROCK: 1.5 * 30 / 60 = 0.75 -> rounds to 1
        assertEquals(1, Genre.ROCK.getEnergyForDuration(30), "ROCK energy for 30s must be 1");

        assertThrows(IllegalArgumentException.class,
                () -> Genre.POP.getEnergyForDuration(0),
                "duration 0 is not allowed");

        assertThrows(IllegalArgumentException.class,
                () -> Genre.POP.getEnergyForDuration(-1),
                "negative duration is not allowed");
    }
    */

}
