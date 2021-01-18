package jp.ac.uryukyu.ie.e205746;

/**
 * ×プレイヤー
 */
class Batsu extends Player{
    /**
     * ×を持つ
     */
    public Batsu(){
        super("×");
    }
    /**
     * ×を返す
     */
    @Override
    public String view(){
        return "×";
    }
}
