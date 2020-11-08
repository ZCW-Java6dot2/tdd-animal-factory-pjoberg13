package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void constructorTest() {
        String givenName = "Toby";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        Dog toby = new Dog(givenName, givenBirthDate, givenID);

        String retrievedName = toby.getName();
        Date retrievedBirthDate = toby.getBirthDate();
        Integer retrievedId = toby.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenID, retrievedId);
    }

    @Test
    public void speakTest() {
        String givenName = "Toby";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        Dog toby = new Dog(givenName, givenBirthDate, givenID);

        String expectedPhrase = "bark!";

        Assert.assertEquals(expectedPhrase, toby.speak());
    }

    @Test
    public void setBirthDateTest() {
        String givenName = "Toby";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        Dog toby = new Dog(givenName, givenBirthDate, givenID);
        Date newBirthDate = new Date(10/12/2010);
        toby.setBirthDate(newBirthDate);

        Assert.assertEquals(newBirthDate, toby.getBirthDate());
    }

    @Test
    public void getIDTest() {
        String givenName = "Toby";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        Dog toby = new Dog(givenName, givenBirthDate, givenID);

        Assert.assertEquals(givenID, toby.getId());
    }

    @Test
    public void animalInheritanceTest() {
        String givenName = "Toby";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        Dog toby = new Dog(givenName, givenBirthDate, givenID);

        boolean expectedReturn = true;

        Assert.assertEquals(expectedReturn, toby instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest() {
        String givenName = "Toby";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        Dog toby = new Dog(givenName, givenBirthDate, givenID);

        boolean expectedReturn = true;

        Assert.assertEquals(expectedReturn, toby instanceof Mammal);
    }
}
