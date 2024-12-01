package edu.sdccd.cisc190.tictactoe.module10;

import javafx.scene.layout.Pane;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LayoutManager {

    @Test
    void layoutManager()
    {
        Assertions.assertInstanceOf(CellBase.class, new Pane());
    }
}
