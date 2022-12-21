package com.example.finalsprintsemester4.games;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GamesTest {

    @Test
    void getId() {
        Games gamecubeGame = new Games("smash","sakurai", "2001" );
        assertEquals("smash", gamecubeGame.getTitle());
    }

    @Test
    void setId() {
    }

    @Test
    void getTitle() {
    }

    @Test
    void setTitle() {
    }

    @Test
    void getDeveloper() {
    }

    @Test
    void setDeveloper() {
    }

    @Test
    void getRelease_date() {
    }

    @Test
    void setRelease_date() {
    }

    @Test
    void testToString() {
    }
}