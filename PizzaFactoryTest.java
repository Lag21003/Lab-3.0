public class PizzaFactoryTest {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        store.orderPizza("Cheese");
        store.orderPizza("Greek");
        store.orderPizza("Pepperoni");
        store.orderPizza("GlutenFree");
    }
}