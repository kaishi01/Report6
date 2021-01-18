package jp.ac.uryukyu.ie.e205746;

import java.util.ArrayList;

class GameManager {
    private Board board = new Board();
    private ArrayList<Player> players = new ArrayList<>(); 

    public GameManager() {
        var player1 = new Maru();
        var player2 = new Batsu();
        players.add(player1);
        players.add(player2);
    }

    public void showBoard() {
        board.showBoard();
    }

    public void action() {// 名前変更
        for ( var player : players){
            board.select(player);
            
            //勝利条件のメソッド
            //勝ったらreturn
            board.showBoard();
        }
        
    }
    
    //public void actPlayer1() {

}
