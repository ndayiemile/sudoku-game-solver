public class BoardClone{
    private int[][] _board;
    private int _x;
    private int _y;
    public BoardClone(int[][] board){
        _board = cloneBoard(board);
        findFirstEmpty();
    }
    public boolean isLegal(int v) {
        for (int i = 0; i < 9; i += 1) {

            if ( (_board[_x][i] == v) || (_board[i][_y] == v)) {
                return false;
            }

        }

        int i = (_x / 3) * 3;
        int j = (_y / 3) * 3;
        for (int di = 0; di < 3; di += 1) {
            for (int dj = 0; dj < 3; dj += 1) {
                if (_board[i + di][j + dj] == v) {

                    return false;

                }

            }
        }

        return true;

    }
    public void findFirstEmpty() {

        _x = 0;
        _y = 0;
        while ((_x < 9) && (_board[_x][_y] != 0)) {

            _y += 1;
            if (_y == 9) {
                _x += 1;
                _y = 0;
            }

        }

    }   
    private int[][] cloneBoard(int[][] board){
        int[][] instance = new int[9][9];
        for (int i = 0; i < instance.length; i++) {
            for (int j = 0; j < instance.length; j++) {
                instance[i][j] = board[i][j];
            }
        }
        return instance;
    }
    public int emptySpacesCount(){
        int counts = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (_board[i][j] == 0) counts++;
            }
        }
        return counts;
    }
    public boolean hasNoEmpty(){
        return (_x < 9);
    }
    public void set(int v) {
        _board[_x][_y] = v;
    }
    public int[][] getClone(){
        return _board;
    }
}