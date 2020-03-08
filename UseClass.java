public class UseClass {
  public static void main(String[] args) {
    MakeClass man = new MakeClass();
    // man.name = "Amy"; // 代入しないと I'm null
    man.getName();
    man.setName("Bob");
    man.setMemo(new Write());
    man.speak();
  }
}
