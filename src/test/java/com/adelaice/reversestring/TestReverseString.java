package com.adelaice.reversestring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestReverseString {

    @Test
    public void testStringOne() {
        assertEquals("dcba", ReverseString.reverseString("abcd"));
    }

    @Test
    public void testStringTwo() {
        assertEquals("dcba  ", ReverseString.reverseString("  abcd"));
    }

    @Test
    public void testStringThree() {
        Assert.assertEquals("gfedcba", ReverseString.reverseString("abcdefg"));
    }
}
