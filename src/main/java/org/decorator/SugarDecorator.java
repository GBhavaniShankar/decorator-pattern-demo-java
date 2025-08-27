package org.decorator;

/**
 * Sugar decorator for coffee.
 */
public class SugarDecorator extends CoffeeDecorator {

    /** Extra price for sugar. */
    private static final double SUGAR_PRICE = 0.5;

    /**
     * Constructor for sugar decorator.
     *
     * @param coffee coffee instance to decorate
     */
    public SugarDecorator(final ICoffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return super.cost() + SUGAR_PRICE;
    }
}
