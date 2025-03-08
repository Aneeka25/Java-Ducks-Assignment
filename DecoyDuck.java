//DecoyDuck.java
class DecoyDuck extends Duck {
    DecoyDuck() {
        flyBehavior = new NotFly();
        quackBehavior = new MuteQuack();
        swimBehavior = new Drown();
    }
