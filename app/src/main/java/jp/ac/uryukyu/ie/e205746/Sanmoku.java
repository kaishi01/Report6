
package jp.ac.uryukyu.ie.e205746;
/**
 * ３×３の3目並べ
 * 先手：○, 後手：×
 * 縦横斜めで同じ記号が揃うと勝ち
 */
public class Sanmoku {
    /**
     * 3目並べを実行する
     * @param args 引数
     */
    public static void main(String[] args) {
        var manager = new GameManager();
        
        while(true) {
            manager.action();
        }
    }
}
