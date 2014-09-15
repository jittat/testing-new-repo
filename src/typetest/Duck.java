package typetest;

public class Duck implements Flyable {

  @Override
  public void jump() {
    System.out.println("Duck jump");
  }

  @Override
  public void fly() {
    System.out.println("Duck fly");
  }
  
}
