//public class PizzaFactory {

    //public Pizza makePizza (String type) {
        //if (null == type ll type.isEmpty()) {
           // System.err.println("Error ' no pizza of this type");
            //return null;
        //}

    //switch(type) {
        
        //case "Greek":
            //return new GreekPizza();

        //default:
            //System.err.println("Error - no pizza of this type");
            //return null;
        //}
    //}
//}

class PizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("Cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("Greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("Pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("Glutenfree")) {
            pizza = new GlutenFreePizza();
        }
            return pizza;
    }
}