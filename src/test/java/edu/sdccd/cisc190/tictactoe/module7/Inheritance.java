package edu.sdccd.cisc190.tictactoe.module7;

import javafx.scene.layout.Pane;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Inheritance {

    @Test
    void inheritanceTest()
    {
        Assertions.assertInstanceOf(CellBase.class, new Pane());
    }
}
