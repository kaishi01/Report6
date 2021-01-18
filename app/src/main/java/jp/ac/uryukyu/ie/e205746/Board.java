package jp.ac.uryukyu.ie.e205746;

import java.util.Scanner;

/**
 * ３×３のボード
 */
public class Board {
    private String[] cells = new String[9];
    /**
     * cells[x]がnullかどうか判定する
     * @param x cells内の任意の要素
     * @return nullの場合true, nullでない場合false
     */
    public boolean isEmpty(int x){
        if ( cells[x]==null ){
            return true;
        }
        return false;
    }

    /**
     * 番号を選び、選んだ番号に置けるならそこにそれぞれのプレイヤーが持つ記号を代入する
     * @param player ○または×を持つ
     */
    public void select(Player player) {
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

        put(select_number, player.view());
    }

    /**
     * 選択した番号がnullであった場合、そこに○または×を代入する
     * @param select_number プレイヤーが選択した番号
     * @param mark ○または×
     */
    public void put(int select_number, String mark){
        if ( !isEmpty(select_number)){
            return;
        }
        cells[select_number] = mark;
    }

    /**
     * ３×３のボードを表示する
     */
	public void showBoard(){
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

    /**
     * ○が勝つ勝利条件
     * @return ○が勝つ場合true,そうでない場合faise
     */
    public boolean maruCheck(){
        if ( cells[0]=="○" && cells[1]=="○" && cells[2]=="○"||
             cells[3]=="○" && cells[4]=="○" && cells[5]=="○"||
             cells[6]=="○" && cells[7]=="○" && cells[8]=="○"||
             cells[0]=="○" && cells[3]=="○" && cells[6]=="○"||
             cells[1]=="○" && cells[4]=="○" && cells[7]=="○"||
             cells[2]=="○" && cells[5]=="○" && cells[8]=="○"||
             cells[0]=="○" && cells[4]=="○" && cells[8]=="○"||
             cells[2]=="○" && cells[4]=="○" && cells[6]=="○"){
                return true;
        }
        return false;
    }

    /**
     * ×が勝つ勝利条件
     * @return ×が勝つ場合true,そうでない場合faise
     */
    public boolean batsuCheck(){
        if ( cells[0]=="×" && cells[1]=="×" && cells[2]=="×"||
             cells[3]=="×" && cells[4]=="×" && cells[5]=="×"||
             cells[6]=="×" && cells[7]=="×" && cells[8]=="×"||
             cells[0]=="×" && cells[3]=="×" && cells[6]=="×"||
             cells[1]=="×" && cells[4]=="×" && cells[7]=="×"||
             cells[2]=="×" && cells[5]=="×" && cells[8]=="×"||
             cells[0]=="×" && cells[4]=="×" && cells[8]=="×"||
             cells[2]=="×" && cells[4]=="×" && cells[6]=="×"){
                return true;
        }
        return false;
    }
}
