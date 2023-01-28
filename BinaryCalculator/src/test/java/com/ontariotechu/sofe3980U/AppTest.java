package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void and1()
    {
        Binary binary1 = new Binary("1111");
        Binary binary2 = new Binary("1111");
        Binary binary3 = Binary.AND(binary1, binary2);
        assertTrue(binary3.getValue().equals("1111"));
    }
    @Test
    public void and2()
    {
        Binary binary1 = new Binary("11111");
        Binary binary2 = new Binary("00000");
        Binary binary3 = Binary.AND(binary1, binary2);
        assertTrue(binary3.getValue().equals("0"));
    }
    @Test
    public void and3()
    {
        Binary binary1 = new Binary("10101");
        Binary binary2 = new Binary("10011");
        Binary binary3 = Binary.AND(binary1, binary2);
        assertTrue(binary3.getValue().equals("10001"));
    }
    @Test
    public void or1()
    {
        Binary binary1 = new Binary("1111");
        Binary binary2 = new Binary("1010");
        Binary binary3 = Binary.OR(binary1, binary2);
        assertTrue(binary3.getValue().equals("1111"));
    }
    @Test
    public void or2()
    {
        Binary binary1 = new Binary("1000");
        Binary binary2 = new Binary("0001");
        Binary binary3 = Binary.OR(binary1, binary2);
        assertTrue(binary3.getValue().equals("1001"));
    }
    @Test
    public void or3()
    {
        Binary binary1 = new Binary("10010");
        Binary binary2 = new Binary("11001");
        Binary binary3 = Binary.OR(binary1, binary2);
        assertTrue(binary3.getValue().equals("11011"));
    }
    @Test
    public void multiply1()
    {
        Binary binary1 = new Binary("00110");
        Binary binary2 = new Binary("11010");
        Binary binary3 = Binary.Multiply(binary1, binary2);
        assertTrue(binary3.getValue().equals("10011100"));
    }
    @Test
    public void multiply2()
    {
        Binary binary1 = new Binary("11011");
        Binary binary2 = new Binary("00011");
        Binary binary3 = Binary.Multiply(binary1, binary2);
        assertTrue(binary3.getValue().equals("1010001"));
    }
    @Test
    public void multiply3()
    {
        Binary binary1 = new Binary("00111");
        Binary binary2 = new Binary("11111");
        Binary binary3 = Binary.Multiply(binary1, binary2);
        assertTrue(binary3.getValue().equals("11011001"));
    }
}
