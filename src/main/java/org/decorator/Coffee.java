package org.decorator;

/**
 * Basic coffee implementation.
 */
public class Coffee implements ICoffee {

    /** Base price for simple coffee. */
    private static final double BASE_PRICE = 5.0;

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return BASE_PRICE;
    }
}
