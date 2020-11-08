package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addDogTest() {
        String givenName = "Toby";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        Dog toby = new Dog(givenName, givenBirthDate, givenID);
        DogHouse.add(toby);

        Assert.assertEquals(toby, DogHouse.getDogById(1));
    }

    @Test
    public void removeDogByIDTest() {
        Date date = new Date();
        Dog toby = AnimalFactory.createDog("toby", date);
        DogHouse.add(toby);
        DogHouse.remove(toby.getId());

        Assert.assertEquals(null, DogHouse.getDogById(toby.getId()));
    }

    @Test
    public void removeDogByNameTest() {
        Date date = new Date();
        Dog toby = AnimalFactory.createDog("toby", date);
        DogHouse.add(toby);
        DogHouse.remove(toby);

        Assert.assertEquals(null, DogHouse.getDogById(toby.getId()));
    }

    @Test
    public void getDogByIDTest() {
        Date date = new Date();
        Dog toby = AnimalFactory.createDog("toby", date);
        DogHouse.add(toby);

        Assert.assertEquals(toby, DogHouse.getDogById(toby.getId()));
    }

    @Test
    public void getNumberOfDogsTest() {
        Date date = new Date();
        Dog toby = AnimalFactory.createDog("toby", date);
        DogHouse.add(toby);

        Integer expectedDogNumber = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedDogNumber, DogHouse.getNumberOfDogs());
    }
}
