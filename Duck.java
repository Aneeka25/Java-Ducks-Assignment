//Duck.java
abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    void performFly() { flyBehavior.fly(); }
    void performQuack() { quackBehavior.quack(); }
    void performSwim() { swimBehavior.swim(); }


    
