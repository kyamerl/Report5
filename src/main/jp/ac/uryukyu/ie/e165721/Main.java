package jp.ac.uryukyu.ie.e165721;

/**
 * Created by e165721 on 2016/12/03.
 * ステップ1: コードの準備
 */

public class Main {
    public static void main(String[] args){
        String str = "3．14";
        double value;
        try {
            value = Double.parseDouble(str);
            System.out.println(str.length());
        }catch(NullPointerException e){
            //NullPointerExceptionが起きた時の処理
            System.out.println("NullPointerException(Nullアクセス)が発生した。");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
