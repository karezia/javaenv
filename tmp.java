import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Tmp {

  // --------------------- field (+ ~ = member)
  int speed = 0;

  // ---------------------
  public static void main(String[] args) { // mainで始まりmainで終わる->void(returnなしのmethod)
    // main持たないclassもあり(他のclassで用いられる),main有class(台本[useclass]),mainないclass(設計書[instanse前])
    int num = 5;
    // int num = 7; // 変数ｵｰﾊﾞｰﾗｲﾄﾞ不可
    String str = "6"; // '' だとchar型
    fizzBuzz(num); // 後ろで定義
    fizzBuzz(str); // 型の違い, 引数の違いで関数作成&実行(ｵｰﾊﾞｰﾛｰﾄﾞ) printlnも裏でｵｰﾊﾞｰﾛｰﾄﾞしている void println(int
                   // [double, char, etc])
  }

  private static int fizzBuzz(int num) { // main の外->"mainで終わる"のでmainの中で使われている必要
    // static クラスオブジェクト([変数, メソッド])
    return num * 2;
  }

  private static double fizzBuzz(double num) {
    BigDecimal d1 = new BigDecimal("1.0"); // 誤差. 2進数で表しきれない str型を.double型は既に10進数と乖離
    BigDecimal d2 = new BigDecimal("1.2");
    d1.add(d1.multiply(d2));
    List<Integer> users = new ArrayList<Integer>();
    users.add(32);
    users.get(0);
    users.remove(0);
    for (int user : users) { // for-each
      System.out.println(user);
    }
    return num * 2;
  }

  private static int fizzBuzz(String str) { // fizzの前 返り値の型, ()内のStringは引数の型
    int num = Integer.parseInt(str);
    return num * 2;
  }

}
