package cn.dreampie;

/**
 * Hello world!
 */
public class MethodApp {
  @MethodAnn
  public static void a() {
    System.out.println("Hello World!");
  }

  @MethodAnn
  public void b() {
    System.out.println("Hello World!");
  }
}
