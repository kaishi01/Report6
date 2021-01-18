package jp.ac.uryukyu.ie.e205746;

import java.util.ArrayList;

/**
 * ゲームを進める
 */
class GameManager {
    private Board board = new Board();
    private ArrayList<Player> players = new ArrayList<>(); 

    /**
     * プレイヤーを用意し、リストに追加する
     */
    public GameManager() {
        var player1 = new Maru();
        var player2 = new Batsu();
        players.add(player1);
        players.add(player2);
    }

    /**
     * ボードを表示する
     */
    public void showBoard() {
        board.showBoard();
    }

    /**
     * ゲームを実行する
     * プレイヤーが番号選んだ時にその都度勝利条件を確認する
     */
    public void action() {
        for ( var player : players ){
            showBoard();
            board.select(player);

            maruCheck();
            batsuCheck();
            //勝ったらreturn
            
        }
    }

    /**
     * ○が勝った場合に表示する
     */
    public void maruCheck(){
        if ( board.maruCheck() == true){
            System.out.println("○の勝ちです");
        }
    }

    /**
     * ×が勝った時に表示する
     */
    public void batsuCheck(){
        if ( board.batsuCheck()){
            System.out.println("×の勝ちです");
        }
    }
}
