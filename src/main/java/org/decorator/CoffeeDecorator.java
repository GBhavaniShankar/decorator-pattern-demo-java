package org.decorator;

/**
 * Abstract coffee decorator class.
 */
public abstract class CoffeeDecorator implements ICoffee {

    /** The decorated coffee instance. */
    private final ICoffee decoratedCoffee;

    /**
     * Constructor for coffee decorator.
     *
     * @param coffee coffee instance to decorate
     */
    protected CoffeeDecorator(final ICoffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }
}
