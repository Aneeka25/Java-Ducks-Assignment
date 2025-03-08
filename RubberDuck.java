//RubberDuck.java
class RubberDuck extends Duck {
    RubberDuck() {
        flyBehavior = new NotFly();
        quackBehavior = new Squeak();
        swimBehavior = new Float();
    }
    void display() { System.out.println("I am a Rubber Duck"); }
}
