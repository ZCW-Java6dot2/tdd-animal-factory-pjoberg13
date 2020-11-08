package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        String givenName = "Snaps";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        String newName = "Mutton";

        Cat snaps = new Cat(givenName, givenBirthDate, givenID);
        snaps.setName(newName);

        Assert.assertEquals(newName, snaps.getName());
    }

    @Test
    public void speakTest() {
        String givenName = "Snaps";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        Cat snaps = new Cat(givenName, givenBirthDate, givenID);

        String expectedPhrase = "meow!";

        Assert.assertEquals(expectedPhrase, snaps.speak());
    }

    @Test
    public void setBirthDateTest() {
        String givenName = "Snaps";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        Cat snaps = new Cat(givenName, givenBirthDate, givenID);

        Date newBirthDate = new Date(7/12/13);
        snaps.setBirthDate(newBirthDate);

        Assert.assertEquals(newBirthDate, snaps.getBirthDate());
    }

    @Test
    public void eatFoodTest() {
        String givenName = "Snaps";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        Cat snaps = new Cat(givenName, givenBirthDate, givenID);

        Food spaghetti = new Food();
        snaps.eat(spaghetti);
        int expectedFoodListLength = 1;

        Assert.assertEquals(java.util.Optional.of(expectedFoodListLength),
                 java.util.Optional.ofNullable(snaps.getNumberOfMealsEaten()));
    }

    @Test
    public void getIDTest() {
        String givenName = "Snaps";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        Cat snaps = new Cat(givenName, givenBirthDate, givenID);

        Integer expectedID = 1;

        Assert.assertEquals(expectedID, snaps.getId());
    }

    @Test
    public void animalInheritanceTest() {
        String givenName = "Snaps";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        Cat snaps = new Cat(givenName, givenBirthDate, givenID);

        boolean expectedReturn = true;

        Assert.assertEquals(expectedReturn, snaps instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest() {
        String givenName = "Snaps";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        Cat snaps = new Cat(givenName, givenBirthDate, givenID);

        boolean expectedReturn = true;

        Assert.assertEquals(expectedReturn, snaps instanceof Mammal);
    }

}
