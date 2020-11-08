package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        Date date = new Date();
        Dog toby = AnimalFactory.createDog("toby", date);

        String expectedName = "toby";
        Date expectedDate = new Date();
        expectedDate = date;

        Assert.assertEquals(expectedName, toby.getName());
        Assert.assertEquals(expectedDate, toby.getBirthDate());
    }

    @Test
    public void createCatTest() {
        Date date = new Date();
        Cat snaps = AnimalFactory.createCat("snaps", date);

        String expectedName = "snaps";
        Date expectedDate = new Date();
        expectedDate = date;

        Assert.assertEquals(expectedName, snaps.getName());
        Assert.assertEquals(expectedDate, snaps.getBirthDate());
    }

}
