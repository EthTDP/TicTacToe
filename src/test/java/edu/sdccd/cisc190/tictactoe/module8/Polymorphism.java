package edu.sdccd.cisc190.tictactoe.module8;

import javafx.scene.layout.Pane;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Polymorphism {

    @Test
    void polymorphismTest()
    {
        Assertions.assertInstanceOf(CellBase.class, new Pane());
    }
}
