package kasparovtron.pieces;

public class Queen {
    public String color;
    public int power;
    public int id;

    public int row;
    public int col;

    public Queen(String color, int row, int col) {

        this.color  = color;
        this.power 	= 10;
        this.id 	= 6;

        this.row = row;
        this.col = col;
    }

    public boolean isMovePossible (int moveRow, int moveCol) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((moveRow == (this.row + i)) && (moveCol == this.col)) {
                    return true;
                }
                if ((moveRow == (this.row - i)) && (moveCol == this.col)) {
                    return true;
                }
                if ((moveRow == (this.row + i)) && (moveCol == (this.col + j))) {
                    return true;
                }
                if ((moveRow == (this.row - i)) && (moveCol == (this.col - j))) {
                    return true;
                }
                if ((moveRow == (this.row - i)) && (moveCol == (this.col + j))) {
                    return true;
                }
                if ((moveRow == (this.row + i)) && (moveCol == (this.col - j))) {
                    return true;
                }
                if ((moveRow == this.row) && (moveCol == (this.col + j))) {
                    return true;
                }
                if ((moveRow == this.row) && (moveCol == (this.col - j))) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;

    }
}
