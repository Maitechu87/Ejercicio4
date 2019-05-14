import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestSegment {
    @Test
    public void testSegment(){
        Segment seg = new Segment(-4,0,5,0);
        assertEquals(9, seg.getLong());
    }
}
