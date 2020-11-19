import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurfaceTest {

    @Test
    void calculEquals() {
        assertEquals(Surface.calcul(5,3),15);
    }
    @Test
    void calculNotEquals() {
        assertNotEquals(Surface.calcul(5,3),10);
    }
}