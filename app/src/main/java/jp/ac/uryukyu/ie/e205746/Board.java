package jp.ac.uryukyu.ie.e205746;

public class Board {
    private Player[] cells = new Player[9];

    public boolean isEmpty(int x){
        if ( cells[x]==null){
            return true;
        }
        return false;
    }

    public void put(int x, Player player){
        if ( !isEmpty(x)){
            //既に埋まっている
            return;//実際はエラーを起こしたい
        }
        cells[x] = player;
    }
	public void view(){
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
    }

    //public static void showBoard(){ 
        
    //}
}
