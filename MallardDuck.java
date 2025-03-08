//MallardDuck.java
class MallardDuck extends Duck {
    MallardDuck() {
        flyBehavior = new Fly();
        quackBehavior = new Quack();
        swimBehavior = new Swim();
    }
