package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;
/**
 * @author YangShu on 2/16/19.
 */
public class CatHouseTest {

    Cat testCat;
    CatHouse catHouse;

    @Before
    public void method() {
        testCat = new Cat("cc", new Date(), 30);
    }

    @Before
    public void houseM() {
        catHouse = new CatHouse();
    }


    // TODO - Create tests for `void add(Cat cat)`
    public void addTest() {
        catHouse.add(testCat);
        Cat actCat = catHouse.getCatById(20);
        Assert.assertEquals(testCat, actCat);


    }
    // TODO - Create tests for `void remove(Integer id)`

    public void removeTest() {
        catHouse.add(testCat);
        catHouse.remove(20);
        int actN = catHouse.getNumberOfCats();
        int expN = 0;
        Assert.assertEquals(expN, actN);


    }

    // TODO - Create tests for `void remove(Cat cat)`

    public void removeTest2() {
        catHouse.add(testCat);
        catHouse.remove(testCat);
        int actN = catHouse.getNumberOfCats();
        int expN = 0;
        Assert.assertEquals(expN, actN);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    public void testById() {
        catHouse.add(testCat);
        Cat actCat = CatHouse.getCatById(20);
        Assert.assertEquals(testCat, actCat);
    }


    // TODO - Create tests for `Integer getNumberOfCats()`
    public void testGetNumber() {
        catHouse.add(testCat);
        int actN = catHouse.getNumberOfCats();
        int expN = 1;
        Assert.assertEquals(expN, actN);
    }
}
