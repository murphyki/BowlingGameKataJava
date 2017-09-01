package com.murphyki.kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest2 {
    private Game2 game;

    @Before
    public void setUp()
    {
        game = new Game2();
    }

    private void rollMany(int n, int pins)
    {
        for (int i = 0; i < n; i++)
        {
            game.roll(pins);
        }
    }

    private void rollSpare()
    {
        game.roll(5);
        game.roll(5);
    }

    private void rollStrike()
    {
        game.roll(10);
    }

    @Test
    public void testGutterGame()
    {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void testAllOnes()
    {
        rollMany(20, 1);
        assertEquals(20, game.score());
    }

    @Test
    public void testOneSpare()
    {
        rollSpare();
        game.roll(3);
        assertEquals(16, game.score());
    }

    @Test
    public void testOneStrike()
    {
        rollStrike();
        game.roll(3);
        game.roll(4);
        assertEquals(24, game.score());
    }

    @Test
    public void testPerfectGame() throws Exception {
        rollMany(12,10);
        assertEquals(300, game.score());
    }

}
