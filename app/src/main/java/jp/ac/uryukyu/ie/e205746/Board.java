package jp.ac.uryukyu.ie.e205746;

import java.util.Scanner;

public class Board {
    private Player[] cells = new Player[9];

    public boolean isEmpty(int x){
        if ( cells[x]==null){
            return true;
        }
        return false;
    }

    public void select() {
        System.out.println("どこに置く？");
        for ( int index=0; index<9; index++) {
            if (isEmpty(index)){
                System.out.println(index + ": 置けます");
            }else {
                System.out.println(index + ": 置けません");
            }
        }

        Scanner scanner = new Scanner(System.in);
        int select_number = scanner.nextInt();

        put(select_number, Maru.view());
    }

    

    public void put(int select_number, Player mark){
        if ( !isEmpty(select_number)){
            //既に埋まっている
            return;//実際はエラーを起こしたい
        }
        cells[select_number] = mark;
    }
	public void showBoard(){
        /*
        String[][] board = new String [3][3];
        for ( int i=0; i<3; i++){
            String str = String.join("|", board[i]);
            System.out.println(str);
            if (i<2){
                System.out.println("--------------");
            }
        }
        */
        //別の表記法
        for ( int i=0; i<9; i++ ){
            System.out.print(cells[i]+" ");
            if (i==2||i==5||i==8) {
                System.out.println();

                if (i==2||i==5) {
                    System.out.println("--------------");
                }
                
            }
        }
        System.out.println();
    }
}
