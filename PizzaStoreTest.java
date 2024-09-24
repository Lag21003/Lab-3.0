import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaStoreTest {
    
    private PizzaStore store;

    @Before
    public void setUp() {
        PizzaFactory factory = new PizzaFactory();
        store = new PizzaStore(factory);
    }

    @Test
    public void testOrderCheesePizza() {
        Pizza pizza = store.orderPizza("Cheese");
        assertNotNull(pizza);
        assertEquals("Cheese Pizza", pizza.getName());
    }

    @Test
    public void testOrderGreekPizza() {
        Pizza pizza = store.orderPizza("Greek");
        assertNotNull(pizza);
        assertEquals("Greek Pizza", pizza.getName();)
    }

    @Test
    public void testOrderPepperoniPizza() {
        Pizza pizza = store.orderPizza("Pepperoni");
        assertNotNull(pizza);
        assertEquals("Pepperoni Pizza", pizza.getName);
    }

    @Test
    public void testOrderGlutenFreePizza() {
        Pizza pizza = store.orderPizza("GlutenFree");
        assertNotNull(pizza);
        assertEquals("GlutenFree Pizza", pizza.getName);
    }

    @Test
    public void testOrderInvalidPizza() {
        Pizza pizza = sotre.orderPizza("Invalid");
        assertNull(pizza);
    }
}