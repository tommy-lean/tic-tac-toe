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

package tictactoe.project.component;

import tictactoe.project.model.Cell;
import tictactoe.project.model.GameTable;

/**
 * @author tommy_lean
 * @link http:/devonline.academy/java
 */
public class DataPrinter extends GameTable {

    private final CellNumberConverter cellNumberConverter;

    public DataPrinter(CellNumberConverter cellNumberConverter) {
        this.cellNumberConverter = cellNumberConverter;
    }

    public void printMappingTable() {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + cellNumberConverter.toNumber(new Cell(i, j)) + " |");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }

    public void printGameTable(GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + gameTable.getSign(new Cell(i, j)) + " |");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }
}