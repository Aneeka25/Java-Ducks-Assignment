//RedheadDuck.java
class RedheadDuck extends Duck {
    RedheadDuck() {
        flyBehavior = new Fly();
        quackBehavior = new Quack();
        swimBehavior = new Swim();
    }
