//Duck.java
abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    void performFly() { flyBehavior.fly(); }
    void performQuack() { quackBehavior.quack(); }
    void performSwim() { swimBehavior.swim(); }

    abstract void display();

    void setFlyBehavior(FlyBehavior fb) { flyBehavior = fb; }
    void setQuackBehavior(QuackBehavior qb) { quackBehavior = qb; }
    void setSwimBehavior(SwimBehavior sb) { swimBehavior = sb; }
}  
