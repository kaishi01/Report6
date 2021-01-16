package jp.ac.uryukyu.ie.e205746;

class GameManager {
    private Board board = new Board();
    private Player player1 = new Maru("○");
    private Player player2 = new Player("×");

    public GameManager() {
        player1.view();
    }

    public void showBoard() {
        board.view();
    }
    
}
