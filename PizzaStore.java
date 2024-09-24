//public class PizzaStore {

    //public static void main(String[] args) {
        //PizzaFactory pf = new PizzaFactory();

        //Pizza pizza = pf.makePizza(type:"Greek");
        //pizza.bake();
       // pizza.cut();
        //pizza.cut();
        //pizza.box();

        //Pizza pizza = pf.
    //}
//}

class PizzaStore {
    private PizzaFactory factory;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else if {
            System.out.println("Invalid Pizza type: " + type);
        }

        return pizza;

    }
}