import java.util.*;

class Main { // C072
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Monster monster = new Monster(sc.nextInt(), sc.nextInt(), sc.nextInt());
    int numOfRepeat = sc.nextInt();
    for (int i = 0; i < numOfRepeat; i++) {
      String name = monster.judgeEvol(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(),
          sc.nextInt());
      if (!name.isEmpty()) {
        System.out.println(name);
      }
    }
    if (monster.numOfEvol == 0) {
      System.out.println("no evolution");
    }
    sc.close();
  }
}

class Monster {
  public Monster(int atk, int def, int spd) {
    this.attack = atk;
    this.defence = def;
    this.speed = spd;
  }

  int attack;
  int defence;
  int speed;
  int numOfEvol = 0;

  public String judgeEvol(String name, int minAtk, int maxAtk, int minDef, int maxDef, int minSpd, int maxSpd) {
    int okAtk = 0;
    int okDef = 0;
    int okSpd = 0;
    if (minAtk <= this.attack & this.attack <= maxAtk) {
      okAtk = 1;
    }
    if (this.defence >= minDef & this.defence <= maxDef) {
      okDef = 1;
    }
    if (this.speed >= minSpd & this.speed <= maxSpd) {
      okSpd = 1;
    }
    if (okAtk == 1 & okDef == 1 & okSpd == 1) {
      numOfEvol++;
      return name;
    } else {
      return "";
    }
  }
}
