package jp.ac.uryukyu.ie.e205746;

/**
 * ○プレイヤー
 */
class Maru extends Player {
    /**
     * ○を持つ
     */
    public Maru(){
        super("○");
    }
    /**
     * ○を返す
     */
    @Override
    public String view(){
        return "○";
    }
}
