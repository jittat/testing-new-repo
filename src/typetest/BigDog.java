package typetest;

public class BigDog extends Dog implements Jumpable {

  BigDog(int age) {
    super(age);
  }

  public void jump() {
    System.out.println("Jump: " + age*5);
  }
  
  @Override
  public void bark() {
    System.out.println("BOOddddOOOXXXXX " + age);
  }
}
