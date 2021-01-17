package jp.ac.uryukyu.ie.e205746;

class GameManager {
    private Board board = new Board();
    private Player player1 = new Player("○");
    private Player player2 = new Player("×");

    public GameManager() {
        
    }

    public void showBoard() {
        board.showBoard();
    }

    public void isPut() {
        board.select();
    }
    
    //public void actPlayer1() {

}
