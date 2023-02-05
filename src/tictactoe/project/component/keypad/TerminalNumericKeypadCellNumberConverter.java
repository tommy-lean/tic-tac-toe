/*
 * Copyright 2022. tommy_lean
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package tictactoe.project.component.keypad;

import tictactoe.project.component.CellNumberConverter;
import tictactoe.project.model.Cell;

/**
 * @author tommy_lean
 * @link http:/devonline.academy/java
 */
public class TerminalNumericKeypadCellNumberConverter implements CellNumberConverter {

    private final char[][] mapping =
            {{'1', '2', '3'},
                    {'4', '5', '6'},
                    {'7', '8', '9'}};

    @Override
    public Cell toCell(char number) {
        for (int i = 0; i < mapping[i].length; i++) {
            for (int j = 0; j < 3; j++) {
                if (number == mapping[i][j]) {
                    return new Cell(i, j);
                }
            }
        }
        return null;
    }

    @Override
    public char toNumber(Cell cell) {
        return mapping[cell.getRow()][cell.getCol()];
    }
}
