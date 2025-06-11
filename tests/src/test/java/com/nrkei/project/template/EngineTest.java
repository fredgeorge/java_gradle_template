package com.nrkei.project.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngineTest {

    private final Engine engine = new Engine();

    @Test
    void addsNumbers() {
        assertEquals(4, engine.add(2, 2));
    }
}
