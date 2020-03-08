public class MakeClass {
  public MakeClass() {// class名と同じ, new はこれを呼び出している
    System.out.println("constructor");
  }

  private String name;
  private Write memo;

  public void speak() {// staticなし,クラスのメソッドには?
    System.out.println("I'm " + name);
    memo.memorize();
  }

  public String getName() { // void->String return使う場合
    return name;
  }

  public void setName(String name) {
    this.name = name;// 左辺は上のname,右辺は引数のname
  }

  public void setMemo(Write memo) {
    this.memo = memo;

  }
}
