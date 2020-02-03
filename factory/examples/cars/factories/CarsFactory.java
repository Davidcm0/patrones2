package alarcos.patrones.factory.examples.cars.factories;

import alarcos.patrones.factory.examples.cars.products.Car;

/**
 * Created by luisburgos on 15/07/15.
 */
public abstract class CarsFactory {
    public abstract Car createProduct(String productName);
}
