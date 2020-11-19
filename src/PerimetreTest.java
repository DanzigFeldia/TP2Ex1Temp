import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerimetreTest {


    @Test
    void calculEquals() {
        assertEquals(Perimetre.calcul(5,3, 2),16);
    }
    @Test
    void calculNotEquals() {
        assertNotEquals(Perimetre.calcul(5,3, 2),12);
    }
}