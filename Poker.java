import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numOfRepeat = sc.nextInt();
    for (int i = 0; i < numOfRepeat; i++) {
      String[] cardNums = sc.next().split("");
      List<String> cardNumList = List.of(cardNums);
      Set<String> set = new HashSet<String>(cardNumList);
      if (set.size() == 4) {
        System.out.println("No Pair");
      } else if (set.size() == 3) {
        System.out.println("One Pair");
      } else if (set.size() == 2) {
        if (count(cardNums[0], cardNums) == 2) {
          System.out.println("Two Pair");
        } else {
          System.out.println("Three Card");
        }
      } else if (set.size() == 1) {
        System.out.println("Four Card");
      }
    }
    sc.close();
  }

  private static int count(String target, String[] array) {
    int count = 0;
    for (String x : array) {
      if (x.equals(target)) {
        count++;
      }
    }
    return count;
  }
}
// List<Integer> num = List.of(array) // 配列をlist型に() = asList()?
// .stream()
// .map(num -> num * 2) // cf.map(python)
// .filter(num -> num > 0) // cf.filter(python)
// .forEach(System.out::println); // 出力
