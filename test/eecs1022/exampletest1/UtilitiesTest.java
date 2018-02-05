package eecs1022.exampletest1;

import org.junit.Before;

import static org.junit.Assert.*;

public class UtilitiesTest {

    //@Inject
    private Utilities u;

    @Before
    public void setUp() throws Exception {
        u = new Utilities();
    }

    @org.junit.Test
    public void areaOfCircle() throws Exception {
        assertEquals(78.5, u.areaOfCircle(5), 0);
    }

    @org.junit.Test
    public void averageOf() throws Exception {
        assertEquals(38.5, u.averageOf(23, 45, 67, 19), 0);
    }

    @org.junit.Test
    public void maximumOf() throws Exception {
        assertEquals(67, u.maximumOf(23, 45, 67));
        assertEquals(67, u.maximumOf(45, 67, 23));
        assertEquals(67, u.maximumOf(67, 45, 23));
        assertEquals(2, u.maximumOf(2, -5,-80));
        assertEquals(100, u.maximumOf(5, -5,100));
        assertEquals(91, u.maximumOf(-10, 8,91));
        assertEquals(-91, u.maximumOf(-99, -1000,-91));
        assertEquals(-91, u.maximumOf(-91, -98,-91));
        assertEquals(-1, u.maximumOf(-91, -1,-1));
        assertEquals(8, u.maximumOf(-91, -91,8));
    }

    @org.junit.Test
    public void isArithmeticSeq() throws Exception {
        assertTrue(u.isArithmeticSeq(23, 23, 23, 23));
        assertTrue(u.isArithmeticSeq(23, 46, 69, 92));
        assertTrue(u.isArithmeticSeq(23, 0, -23, -46));
        assertFalse(u.isArithmeticSeq(23, 46, 68, 90));
        assertFalse(u.isArithmeticSeq(23, 0, -24, -48));

        assertTrue(u.isArithmeticSeq(1,3,5,7));
        assertTrue(u.isArithmeticSeq(7, 5, 3, 1));
        assertFalse(u.isArithmeticSeq(0, 1 ,-1,1));
    }
}