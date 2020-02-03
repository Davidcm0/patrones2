package alarcos.patrones.prototype.examples.animals;

/**
 * Created by luisburgos on 23/07/15.
 */
public class AnimalPrototypeTest {

    public static void main(String[] args) {

        AnimalCloneFactory factory = new AnimalCloneFactory();
        Animal animal;
        Animal clonedAnimal;

        System.out.println("Turn of the dogs...");

        animal = new Dog();
        Dog perro = ((Dog)animal);
        perro.setColor_ojos("azules");
        perro.setColor_pelo("blanco");
        perro.setLocalidad("Ciudad Real");
        perro.setPatas(4);
        perro.setRaza("Alaska");
        perro.setIdPropietario("Alberto");
        
        
        clonedAnimal = (Dog) factory.getClone(animal);
        System.out.println(animal + " with ID: " + System.identityHashCode(System.identityHashCode(animal)));
        System.out.println(clonedAnimal + " with ID: " + System.identityHashCode(System.identityHashCode(clonedAnimal)));
        
        System.out.println("propietario del original: "+ ((Dog)animal).getIdPropietario());
        System.out.println("propietario de la copia: "+ ((Dog)animal).getIdPropietario());
        
        System.out.println("Turn of the cats...");

        animal = new Cat();
        clonedAnimal = (Cat) factory.getClone(animal);
        System.out.println(animal + " with ID: " + System.identityHashCode(System.identityHashCode(animal)));
        System.out.println(clonedAnimal + " with ID: " + System.identityHashCode(System.identityHashCode(clonedAnimal)));


    }

}
