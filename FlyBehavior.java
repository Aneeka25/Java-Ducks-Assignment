//FlyBehavior.java
interface FlyBehavior {
    void fly();
}
class Fly implements FlyBehavior {
    public void fly() { System.out.println("I am flying!"); }
}

class NotFly implements FlyBehavior {
    public void fly() { System.out.println("I cannot fly."); }
}
