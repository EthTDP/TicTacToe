package edu.sdccd.cisc190.tictactoe.module3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Conditionals {

    @Test
    void conditionalTest()
    {
        //however you get a GameController (also idk if this counts???)
        if(gc.getCurrentPlayer() == "X")
        {
            Assertions.assertTrue(true);
        }
    }
}
