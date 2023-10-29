import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class Song99BottlesTest {
    @Test
    @DisplayName("Add true is true")
    void add() {
        Song99Bottles song99Bottles = new Song99Bottles();
        assertTrue(song99Bottles.handle());
    }
}