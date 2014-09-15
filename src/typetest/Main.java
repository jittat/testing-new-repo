package typetest;

public class Main {

  public static void main(String[] args) {
    Dog dang = new Dog(10);
    BigDog dum = new BigDog(5);
    Duck d = new Duck();
    
    //callBark(dang);
    callBark(dum);
    callJump(d);
  }

  private static void callJump(Flyable j) {
    j.jump();
    j.fly();
  }
  
  private static void callBark(BigDog dog) {
    dog.bark();    
  }

}