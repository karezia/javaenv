import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numOfRepeat = sc.nextInt();
    int distanceToDestination = sc.nextInt();
    int[] totalFeeArray = new int[numOfRepeat];
    for (int i = 0; i < numOfRepeat; i++) {
      int firstFeeDistance = sc.nextInt();
      int firstFee = sc.nextInt();
      int additionalFeeDistance = sc.nextInt();
      int additionalFee = sc.nextInt();
      int firstFeePayment = 0;
      int additionalFeePayment = 0;

      firstFeePayment = firstFee;
      int restOfDistance = distanceToDestination - firstFeeDistance;
      if (restOfDistance > 0) {
        restOfDistance = distanceToDestination - firstFeeDistance;
        // 切り上げ除算 (割られる数 + (割る数 – 1)) / 割る数 -> +(割る数 – 1)で商を1つだけ上げる
        int numOfAddtionalFee = (restOfDistance + additionalFeeDistance - 1) / additionalFeeDistance;
        if (restOfDistance % additionalFeeDistance == 0)
          numOfAddtionalFee++; // 距離到達時点で追加料金
        additionalFeePayment = numOfAddtionalFee * additionalFee;
      } else if (restOfDistance == 0) {
        additionalFeePayment = additionalFee;
      }

      int totalFee = firstFeePayment + additionalFeePayment;
      totalFeeArray[i] = totalFee;
    }
    // 配列の最大値最小値求めるメソッドがないjava
    int max = totalFeeArray[0];
    int min = totalFeeArray[1];
    for (int i = 0; i < totalFeeArray.length; i++) {
      int v = totalFeeArray[i];
      if (v > max) {
        max = v;
      }
      if (v < min) {
        min = v;
      }
    }
    sc.close();
    System.out.println(String.valueOf(min) + " " + String.valueOf(max));
  }
}
