package kasparovtron.pieces;

public class Knight {
    public String color;
    public int power;
    public int id;

    public int row;
    public int col;

    public Knight(String color, int row, int col) {

        this.color  = color;
        this.power 	= 5;
        this.id 	= 4;

        this.row = row;
        this.col = col;

    }

    public boolean isMovePossible(int moveRow, int moveCol) {

        for(int i = 0; i < 10; i++){

            for(int j = 0; j < 10; j++){

                if((moveRow == this.row + i + 3) && (moveCol == this.col + j + 1)){
                    return true;
                }
                if((moveRow == this.row + i + 1) && (moveCol == this.col + j + 3)){
                    return true;
                }
                if((moveRow == this.row + i - 1) && (moveCol == this.col + j + 3)){
                    return true;
                }
                if ((moveRow == this.row + i - 3) && (moveCol == this.col + j + 1)){
                    return true;
                }
                if ((moveRow == this.row + i - 3) && (moveCol == this.col + j - 1)){
                    return true;
                }
                if ((moveRow == this.row + i - 1) && (moveCol == this.col + j - 3)) {
                    return true;
                }
                if ((moveRow == this.row + i + 1) && (moveCol == this.col + j - 3)) {
                    return true;
                }
                if ((moveRow == this.row + i + 3) && (moveCol == this.col + j - 1)) {
                    return true;
                } else {
                    return false;
                }
            }
        } return false;

    }

    public void move(int moveRow, int moveCol) {

        if(this.isMovePossible(moveRow, moveCol)) {

            this.row = moveRow;
            this.col = moveCol;
        }
    }

    public void attack() {

    }
}
