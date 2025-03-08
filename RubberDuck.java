//RubberDuck.java
class RubberDuck extends Duck {
    RubberDuck() {
        flyBehavior = new NotFly();
        quackBehavior = new Squeak();
        swimBehavior = new Float();
    }
