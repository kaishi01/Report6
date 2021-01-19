package jp.ac.uryukyu.ie.e205746;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BoardTest {
    @Test void emptyTest() {
        int x=2;
        Board sampleBoard = new Board();
        assertTrue(sampleBoard.isEmpty(x));
    }
}
