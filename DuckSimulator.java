public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        System.out.println("--- Mallard Duck ---");
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.performSwim();
