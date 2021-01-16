package jp.ac.uryukyu.ie.e205746;

public class Player {
    private String mark;
    public Player(String mark) {
        this.mark = mark;
    }

    public String view(){
        return mark;
    }

    /*
    if (board[num-1]=='□') {
        board[num-1]='〇';
        }else {
        System.out.println("ほかのところを選んでください");
        }return board;
        }
    */
}
