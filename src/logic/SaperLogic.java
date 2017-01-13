package logic;

import javafx.scene.control.Cell;

/**
 * Created by nazar on 13.01.17.
 */
public interface SaperLogic {

    void loadBoard(Cell[][] cells);

    boolean shouldBang(int x, int y);

    boolean finish();

    void suggest(int x, int y, boolean bomb);


}
