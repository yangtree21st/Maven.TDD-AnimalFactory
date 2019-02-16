package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import org.junit.Before;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {


    Dog testDog;
    DogHouse dogHouse;

    @Before
    public void method() {
        testDog = new Dog("cc", new Date(), 30);
    }

    @Before
    public void houseM() {
        dogHouse = new DogHouse();
    }
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


    public void addTest() {
        dogHouse.add(testDog);
        Dog actDog = dogHouse.getDogById(20);
        Assert.assertEquals(testDog, actDog);


    }
    // TODO - Create tests for `void remove(Integer id)`

    public void removeTest() {
        dogHouse.add(testDog);
        dogHouse.remove(20);
        int actN = dogHouse.getNumberOfDogs();
        int expN = 0;
        Assert.assertEquals(expN, actN);


    }

    // TODO - Create tests for `void remove(Cat cat)`

    public void removeTest2() {
        dogHouse.add(testDog);
        dogHouse.remove(testDog);
        int actN = dogHouse.getNumberOfDogs();
        int expN = 0;
        Assert.assertEquals(expN, actN);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    public void testById() {
        dogHouse.add(testDog);
        Dog actdog = DogHouse.getDogById(20);
        Assert.assertEquals(testDog, actdog);
    }


    // TODO - Create tests for `Integer getNumberOfCats()`
    public void testGetNumber() {
        dogHouse.add(testDog);
        int actN = dogHouse.getNumberOfDogs();
        int expN = 1;
        Assert.assertEquals(expN, actN);
    }
}


