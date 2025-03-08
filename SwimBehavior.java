//SwimBehavior.java
interface SwimBehavior {
    void swim();
}
class Swim implements SwimBehavior {
    public void swim() { System.out.println("I am swimming!"); }
}

class Float implements SwimBehavior {
    public void swim() { System.out.println("I am floating!"); }
}

class Drown implements SwimBehavior {
    public void swim() { System.out.println("I am drowning!"); }
}
