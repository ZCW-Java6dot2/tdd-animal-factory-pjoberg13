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
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest() {
        String givenName = "Snaps";
        Date givenBirthDate = new Date();
        Integer givenID = 1;

        Cat snaps = new Cat(givenName, givenBirthDate, givenID);
        CatHouse.add(snaps);

        Assert.assertEquals(snaps, CatHouse.getCatById(1));
    }

    @Test
    public void removeCatByIDTest() {
        Date date = new Date();
        Cat snaps = AnimalFactory.createCat("snaps", date);
        CatHouse.add(snaps);
        CatHouse.remove(snaps.getId());

        Assert.assertEquals(null, CatHouse.getCatById(snaps.getId()));
    }

    @Test
    public void removeCatByNameTest() {
        Date date = new Date();
        Cat snaps = AnimalFactory.createCat("snaps", date);
        CatHouse.add(snaps);
        CatHouse.remove(snaps);

        Assert.assertEquals(null, CatHouse.getCatById(snaps.getId()));
    }

    @Test
    public void getCatByIDTest() {
        Date date = new Date();
        Cat snaps = AnimalFactory.createCat("snaps", date);
        CatHouse.add(snaps);

        Assert.assertEquals(snaps, CatHouse.getCatById(snaps.getId()));
    }

    @Test
    public void getNumberOfCatsTest() {
        Date date = new Date();
        Cat snaps = AnimalFactory.createCat("snaps", date);
        CatHouse.add(snaps);

        Integer expectedCatNumber = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedCatNumber, CatHouse.getNumberOfCats());
    }
}
