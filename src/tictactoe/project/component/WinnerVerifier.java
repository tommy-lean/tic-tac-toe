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

import tictactoe.project.model.GameTable;

/**
 * @author tommy_lean
 * @link http:/devonline.academy/java
 */
public class WinnerVerifier {
    public boolean isUserWin(GameTable gameTable) {
        return isWinner(gameTable, 'X');
    }

    private boolean isWinner(GameTable gameTable, char playerSign) {
        char[][] table = gameTable.getTable();

        if (checkWinByRow(table, playerSign)) {
            return true;
        }
        if (checkWinByColumn(table, playerSign)) {
            return true;
        }
        if (checkWinByDiagonal(table, playerSign)) {
            return true;
        }
        return false;
    }

    public boolean isComputerWin(GameTable gameTable) {
        return isWinner(gameTable, '0');
    }

    private boolean checkWinByDiagonal(char[][] table, char playerSign) {
        int counterSign = 0;
        for (int i = 0; i < 3; i++) {
            if (table[i][i] == playerSign) {
                counterSign++;
                if (counterSign == 3) {
                    return true;
                }
            }
        }

        int j = 2;
        counterSign = 0;
        for (int i = 0; i < 3; i++) {
            if (table[i][j] == playerSign) {
                counterSign++;
                if (counterSign == 3) {
                    return true;
                }
            }
            j--;
        }
        return false;
    }

    private boolean checkWinByRow(char[][] table, char playerSign) {
        int counterSign;
        for (int i = 0; i < 3; i++) {
            counterSign = 0;
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == playerSign) {
                    counterSign++;
                    if (counterSign == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean checkWinByColumn(char[][] table, char playerSign) {
        int counterSign;
        for (int i = 0; i < 3; i++) {
            counterSign = 0;
            for (int j = 0; j < 3; j++) {
                if (table[j][i] == playerSign) {
                    counterSign++;
                    if (counterSign == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
