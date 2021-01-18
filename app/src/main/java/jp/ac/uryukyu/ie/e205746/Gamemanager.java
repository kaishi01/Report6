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

    public void action() {
        for ( var player : players ){
            showBoard();
            board.select(player);

            maruCheck();
            batsuCheck();
            //勝ったらreturn
            
        }
    }

    public void maruCheck(){
        if ( board.maruCheck() == true){
            System.out.println("○の勝ちです");
        }
    }

    public void batsuCheck(){
        if ( board.batsuCheck()){
            System.out.println("×の勝ちです");
        }
    }
}
