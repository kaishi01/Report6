package jp.ac.uryukyu.ie.e205746;

/**
 * プレイヤーのスーパークラス
 */
public class Player {
    private String mark;
    /**
     * 記号を持つ
     * @param mark 記号
     */
    public Player(String mark) {
        this.mark = mark;
    }

    /**
     * プレイヤーの持つ記号を返す
     * @return プレイヤーの記号
     */
    public String view(){
        return mark;
    }
}
