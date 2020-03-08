import java.util.*;

class Main { // C024
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    Computer cmp = new Computer();
    for (int i = 0; i < num; i++) {
      String func = sc.next();
      switch (func) {
        case "SET":
          cmp.set(sc.nextInt(), sc.nextInt());
          break;
        case "ADD":
          cmp.add(sc.nextInt());
          break;
        case "SUB":
          cmp.sub(sc.nextInt());
          break;
      }
      if (i == num) {
        sc.close();
      }
    }
    System.out.println(String.valueOf(cmp.val[0]) + " " + String.valueOf(cmp.val[1]));
  }
}

class Computer {

  int val[] = { 0, 0 };

  public void set(int index, int num) {
    this.val[index - 1] = num;
  }

  public void add(int num) {
    this.val[1] = this.val[0] + num;
  }

  public void sub(int num) {
    this.val[1] = this.val[0] - num;
  }
}
