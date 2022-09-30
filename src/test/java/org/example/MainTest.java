package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void pushNameChristian() {
        //given
        String name = "Christian";
        //when
        String actual = Main.namePrint(name);

        //then
        assertEquals("Christian", actual);
    }

    @Test
    public void pushNameAsem() {
        //given
        String name = "Asem";
        //when
        String actual = Main.namePrint(name);

        //then
        assertEquals("Asem", actual);
    }

    @Test
    public void pushNameChris() {
        //given
        String name = "chris_yooo";
        //when
        String actual = Main.namePrint(name);

        //then
        assertEquals("chris_yooo", actual);
    }

    @Test
    public void namePrint5() {
        //given
        String name = "chris_yooo";

        //when
        String actual = Main.namePrint5(name);

        //then
        assertEquals("chris_yooo\nchris_yooo\nchris_yooo\nchris_yooo\nchris_yooo\n", actual);
    }

    @Test
    public void biggerThan0() {
        //given
        int number = 0;

        //when
        boolean actual = Main.isBiggerThan0(number);

        //then
        assertEquals(false, actual);
    }
}