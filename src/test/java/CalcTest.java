import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest extends Object {

    @Test
    public void testEmpty(){
        Calc calc = new Calc();
        int actual = calc.sum("");
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void test0and1(){
        Calc calc = new Calc();
        int actual = calc.sum("0,1");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void test0and2(){
        Calc calc = new Calc();
        int actual = calc.sum("0,2");
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void test1and2(){
        Calc calc = new Calc();
        int actual = calc.sum("1,2");
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void test0and1and2(){
        Calc calc = new Calc();
        int actual = calc.sum("0,1,2");
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void test0and1and2NotEquals(){
        Calc calc = new Calc();
        int actual = calc.sum("0,1,2");
        int expected = 5;
        assertNotEquals(expected, actual);
    }

    @Test
    public void testNegative1(){
        Calc calc = new Calc();
        int actual = calc.sum("123.1");
        int expected = -1;
        assertNotEquals(expected, actual);
    }
    @Test
    public void testNegative2(){
        Calc calc = new Calc();
        int actual = calc.sum("123,2,3,5");
        int expected = -1;
        assertNotEquals(expected, actual);
    }
    @Test
    public void testNegative3(){
        Calc calc = new Calc();
        int actual = calc.sum("123;1");
        int expected = -1;
        assertNotEquals(expected, actual);
    }
}