import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPunt {

    @Test
    public void testSetX() {
        Punt p = new Punt();
        p.setX(3);
        assertEquals(3, p.getX());
    }
    @Test
    public void testSetY() {
        Punt puntDos = new Punt();
        puntDos.setY(7);
        assertEquals(7, puntDos.getY());
    }
}