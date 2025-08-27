package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.decorator.Coffee;
import org.decorator.ICoffee;
import org.decorator.MilkDecorator;
import org.decorator.SugarDecorator;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for Coffee and its decorators.
 */
public class CoffeeTest {

    /** Base price for a simple coffee. */
    private static final double BASE_PRICE = 5.0;

    /** Extra cost for milk. */
    private static final double MILK_PRICE = 1.5;

    /** Extra cost for sugar. */
    private static final double SUGAR_PRICE = 0.5;

    /** Allowed delta when comparing floating-point values. */
    private static final double TOLERANCE = 0.01;

    @Test
    void testSimpleCoffee() {
        final ICoffee coffee = new Coffee();
        assertEquals("Simple Coffee", coffee.getDescription());
        assertEquals(BASE_PRICE, coffee.cost(), TOLERANCE);
    }

    @Test
    void testCoffeeWithMilk() {
        final ICoffee coffee = new MilkDecorator(new Coffee());
        assertEquals("Simple Coffee, Milk", coffee.getDescription());
        assertEquals(BASE_PRICE + MILK_PRICE, coffee.cost(), TOLERANCE);
    }

    @Test
    void testCoffeeWithSugar() {
        final ICoffee coffee = new SugarDecorator(new Coffee());
        assertEquals("Simple Coffee, Sugar", coffee.getDescription());
        assertEquals(BASE_PRICE + SUGAR_PRICE, coffee.cost(), TOLERANCE);
    }

    @Test
    void testCoffeeWithMilkAndSugar() {
        final ICoffee coffee = new SugarDecorator(new MilkDecorator(new Coffee()));
        assertEquals("Simple Coffee, Milk, Sugar", coffee.getDescription());
        assertEquals(BASE_PRICE + MILK_PRICE + SUGAR_PRICE, coffee.cost(), TOLERANCE);
    }

    @Test
    void testDoubleMilkAndSugar() {
        final ICoffee coffee = new SugarDecorator(new MilkDecorator(new MilkDecorator(new Coffee())));
        assertEquals("Simple Coffee, Milk, Milk, Sugar", coffee.getDescription());
        assertEquals(BASE_PRICE + MILK_PRICE + MILK_PRICE + SUGAR_PRICE, coffee.cost(), TOLERANCE);
    }
}
