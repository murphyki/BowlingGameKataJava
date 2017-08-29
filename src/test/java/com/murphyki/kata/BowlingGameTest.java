package com.murphyki.kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
    private  Game game;

    @Before
    public void setUp()
    {
        game = new Game();
    }

    private void rollMany(int n, int pins)
    {
        for(int i = 0; i < n; i++)
        {
            game.roll(pins);
        }
    }

    @Test
    public void testGutterGame() throws Exception
    {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void testAllOnes() throws Exception
    {
        rollMany(20, 1);
        assertEquals(20, game.score());
    }

}
