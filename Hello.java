// import java.io.Console;

class Hello {
  public static void main(String args[]) {
    // // byte eight = -127; // 0000 0000 ~ 1111 1111 (2)
    // // short sixteen = -32768; // -32768 ~ 32767 (10)
    // int thirty_two = 200;
    // final long sixty_four = 300; // 定数
    // Console irb = System.console(); // 入力待ち
    // int input = Integer.parseInt(irb.readLine()); // 値を取出 & int()変換
    // if (input <= 0 && input % 2 == 0) { // 左辺Falseなら右辺実行せず
    // System.out.println("マイナス");
    // } else if (input >= 0 || input % 10 == 0) { // 左辺Trueなら右辺実行せず
    // System.out.println("ゼロ");
    // } else {
    // System.out.println(thirty_two + sixty_four + "円"); // '500円'
    // /*
    // * int + long + str 条件付きで可 結果がlong型になること、文字は""で括ること
    // * long->intにしたい(上位32bit削っても良い)なら(int)resとする
    // */
    // }
    int[] tupple = new int[5];
    // 左辺は宣言のみ, 右辺でメモリ確保, 要素数[5]は不可超, 同じ型(int)しか入らない
    String[] tupple2 = { "A", "B", "C", "D", "E" }; // 別解
    for (int i = 0; i < tupple.length; i++) {// 存在しない要素参照->エラー
      tupple[i] = i;
      System.out.print(tupple[i]);// 01234 print->改行なし
      System.out.print(tupple2[i]);

    }
    System.out.println();
    for (int ex_for : tupple) {
      System.out.print(ex_for);
    }
    do {
      System.out.println("do-while");
    } while (false); // ここも ;が必要

    test(2);

  }

  // メソッド 今までのブロックは def main: の中だった...
  public static int test(int arg) { // main関数の外で定義,実行は中で
    System.out.println("メソッド定義 引数" + 2);
    return 10; // void->int void ではreturn利用不可
  }
}
