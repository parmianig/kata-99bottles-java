import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class Song99BottlesTest {
    @Test
    @DisplayName("Sing 99 bottles")
    void shouldSing99Bottles() {
        Song99Bottles song99Bottles = new Song99Bottles();
        
        ArrayList<String> sing = song99Bottles.sing(99);
        
        final String expected = "99 bottles of beer on the wall, 99 bottles of beer. Take one down and pass it around, 98 bottles of beer on the wall.\n";
        assertEquals(1, sing.size());
        assertEquals(expected, sing.getFirst());
    }
    
    @Test
    @DisplayName("Sing 98 bottles")
    void shouldSing98Bottles() {
        Song99Bottles song99Bottles = new Song99Bottles();
        
        ArrayList<String> sing = song99Bottles.sing(98);
        
        final String expected = "98 bottles of beer on the wall, 98 bottles of beer. Take one down and pass it around, 97 bottles of beer on the wall.\n";
        assertEquals(1, sing.size());
        assertEquals(expected, sing.getFirst());
    }
    
    @Test
    @DisplayName("Sing 97 bottles")
    void shouldSing97Bottles() {
        Song99Bottles song99Bottles = new Song99Bottles();
        
        ArrayList<String> sing = song99Bottles.sing(97);
        
        final String expected = "97 bottles of beer on the wall, 97 bottles of beer. Take one down and pass it around, 96 bottles of beer on the wall.\n";
        assertEquals(1, sing.size());
        assertEquals(expected, sing.getFirst());
    }
}