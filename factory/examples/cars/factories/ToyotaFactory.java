package alarcos.patrones.factory.examples.cars.factories;

import alarcos.patrones.factory.examples.cars.products.Camry;
import alarcos.patrones.factory.examples.cars.products.Car;
import alarcos.patrones.factory.examples.cars.products.Corolla;

/**
 * Created by luisburgos on 15/07/15.
 */
public class ToyotaFactory extends CarsFactory {
    @Override
    public Car createProduct(String productName) {
        Car car = null;

        if(productName.equalsIgnoreCase("CAMRY")){
            car = new Camry();
        }else if(productName.equalsIgnoreCase("COROLLA")){
            car = new Corolla();
        }

        return car;
    }
}
