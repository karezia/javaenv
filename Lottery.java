import java.util.*;

class Main { // C023
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Lottery lot = new Lottery();
    for (int i = 0; i < 6; i++) {
      lot.winNums[i] = sc.nextInt();
    }
    int numOfRepeat = sc.nextInt();
    for (int i = 0; i < numOfRepeat; i++) {
      int lotNum[] = new int[lot.winNums.length];
      for (int j = 0; j < lot.winNums.length; j++) {
        lotNum[i] = sc.nextInt();
      }
      System.out.println(lot.checkWinNum(lotNum));
    }
    sc.close();
  }
}

class Lottery {
  public Lottery() {
  }

  public Lottery(int[] nums) {
    this.winNums = nums;
  }

  int winNums[];

  public int checkWinNum(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      for (int winNum : winNums) {
        if (num == winNum) {
          sum++;
        }
      }
    }
    return sum;
  }
}
