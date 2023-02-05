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

import java.util.Scanner;

/**
 * @author tommy_lean
 * @link http:/devonline.academy/java
 */
public class UserMove {

    char[][] mapping =
            {{'7', '8', '9'},
                    {'4', '5', '6'},
                    {'1', '2', '3'}};

    public void make(GameTable gameTable) {
        while (true) {
            Cell cell = getUserInput(gameTable);
            if (gameTable.isEmpty(cell)) {
                gameTable.setSign(cell, 'X');
                return;
            } else {
                System.out.println("Your sell is not free, make move on free cell");
            }
        }


    }

    private Cell getUserInput(GameTable gameTable) {
        while (true) {
            System.out.println("Please type number between 1 and 9: ");
            String userInput = new Scanner(System.in).nextLine();
            if (userInput.length() == 1) {
                char numberCell = userInput.charAt(0);
                if (numberCell >= '1' && numberCell <= '9') {
                    for (int i = 0; i < mapping[i].length; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (numberCell == mapping[i][j]) {
                                return new Cell(i, j);
                            }
                        }
                    }
                }
            }
        }
    }
}
