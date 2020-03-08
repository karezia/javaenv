import java.util.*;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int firstDate = sc.nextInt();
    Tyhoon tyhoon = new Tyhoon(firstDate);

    int num = 5 - 1;
    for (int i = 0; i < num; i++) {
      tyhoon.calcInterval(sc.nextInt());
      System.out.println(tyhoon.interval);
      if (i == num) {
        sc.close();
      }
    }
  }
}

class Tyhoon {
  public Tyhoon(int date) {
    this.previousDate = date;
  }

  int previousDate;
  int interval = 0;

  public void calcInterval(int date) {
    this.interval = date - this.previousDate;
    this.previousDate = date;
  }
}

// 文字スライス str[0:1]
// Scanner sc = new Scanner(System.in);
// int index = sc.nextInt();
// String str = sc.next();
// System.out.println(str.substring(0,index))

// 10->2進数
// String bin = Integer.toBinaryString(dec);

// x桁目->index=要素数-x(桁目)
// int length = bin.length(); // 4321 0123
// char result = bin.charAt(length - sc.nextInt()); // index_char取得

// 文字配列化 "abc" -> ["a", "b", "c"]
// String[] arr = str.split("");
// for (String chara : arr){ // foreach
// System.out.println(chara);
// }

// 含有確認 in
// if (str.contains(keyword)){
// System.out.println(str);
// count++;
// }

// 文字連結
// StringBuilder buf = new StringBuilder();
// buf.append(str);
// String joinedStr = buf.toString();

// 正規表現
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;
// Pattern p = Pattern.compile(String.format(".{1,%d}", afterLength)); // 8文字改行
// Matcher m = p.matcher(joinedStr);
// while (m.find()) {
// System.out.println(m.group());
