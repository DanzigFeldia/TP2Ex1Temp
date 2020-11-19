import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProduitTest {

    @Test
    void multiplyEquals() {
        assertEquals(Produit.multiply(5,3),15);
    }
    @Test
    void multiplNotEquals() {
        assertNotEquals(Produit.multiply(5,3),10);
    }
}