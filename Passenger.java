import java.util.*;

class Main { // C075
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int cash = sc.nextInt();
    int num = sc.nextInt();
    Passenger first = new Passenger(cash);
    // scn.close();
    for (int i = 0; i < num; i++) {
      // Scanner sc2 = new Scanner(System.in);
      int fee = sc.nextInt();
      first.payOff(fee);
      System.out.println(String.valueOf(first.cash) + " " + String.valueOf(first.point));
      if (i == num) {
        sc.close();
      }
    }
  }
}

class Passenger {
  public Passenger(int cash) {
    this.cash = cash;
  }

  int cash = 0;
  int point = 0;

  public void payOff(int fee) {
    if (this.point >= fee) {
      this.point -= fee;
    } else {
      this.cash = this.cash - fee;
      this.point += fee / 10;
    }
  }
}

// 2000 5
// 300 -> 2000 - 300, 300 * 0.1 if point: point - 300

// status: 出力 >> cash
// 出力: 残金(2000 - 300) ポイント(300 * 0.1)
// (入力1(初期値) - 入力3(fee)) 入力3(fee) * 0.1

// cash = 入力1(初期値) fee = 入力3(fee)
// for (int i = 0; i < 入力2(回数); i++){
