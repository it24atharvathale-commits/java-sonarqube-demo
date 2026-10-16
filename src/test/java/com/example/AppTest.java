
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAddition() {
        App app = new App();
        assertEquals(30, app.add(10, 20));
    }

    @Test
    void testGrade() {
        App app = new App();
        assertEquals("Distinction", app.getGrade(82));
    }
}
