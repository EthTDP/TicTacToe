package edu.sdccd.cisc190.tictactoe.module4;

import org.junit.jupiter.api.Assertions;

public class Methods {

    @Test
    void methodTest()
    {
        GameController gc = new GameController((however you make players), (player2));

        Assertions.assertEquals(gc.getCurrentPlayer(), "X");
    }
}
