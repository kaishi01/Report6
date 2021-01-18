package jp.ac.uryukyu.ie.e205746;

import java.util.Scanner;

public class Board {
    private String[] cells = new String[9];

    public boolean isEmpty(int x){
        if ( cells[x]==null ){
            return true;
        }
        return false;
    }

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

    

    public void put(int select_number, String mark){
        if ( !isEmpty(select_number)){
            return;
        }
        cells[select_number] = mark;
    }
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
