package jp.ac.uryukyu.ie.e205746;

import org.junit.jupiter.api.Test;

public class SanmokuTest {
    @Test void appHasAGreeting() {
        Sanmoku classUnderTest = new Sanmoku();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
