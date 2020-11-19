import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    public void addEquals() {
        assertEquals(Addition.add(5,3),8);
    }

    @Test
   public void addNotEquals() {
        assertNotEquals(Addition.add(5,3), 7);
    }
}