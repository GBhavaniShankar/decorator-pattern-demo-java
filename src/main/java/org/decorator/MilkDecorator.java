package org.decorator;

/**
 * Milk decorator for coffee.
 */
public class MilkDecorator extends CoffeeDecorator {

    /** Extra price for milk. */
    private static final double MILK_PRICE = 1.5;

    /**
     * Constructor for milk decorator.
     *
     * @param coffee coffee instance to decorate
     */
    public MilkDecorator(final ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return super.cost() + MILK_PRICE;
    }
}
