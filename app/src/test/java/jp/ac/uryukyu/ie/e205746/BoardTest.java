package jp.ac.uryukyu.ie.e205746;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BoardTest {
    @Test void emptyTest() {
        Board sampleboard = new Board();
        assertEquals(sampleboard.isEmpty(2), null); 
    }
}
