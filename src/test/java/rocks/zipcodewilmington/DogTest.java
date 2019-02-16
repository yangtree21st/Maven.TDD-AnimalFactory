package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    private Dog testDog;

    @Before
            public void setTestDog(){
                testDog = new Dog("aa",new Date(0),1);
            }




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
    public void  getTestDog() {

        String actname = testDog.getName();
        Date actDate = testDog.getBirthDate();
        int actId = testDog.getId();
        Assert.assertEquals("aa",actname);
        Assert.assertEquals(new Date(0),actDate);
        Assert.assertEquals(1,actId);

    }
    @Test
    public void speakTest(){
        String actS = testDog.speak();
        Assert.assertEquals("bark!", actS);

    }

    @Test
    public void eatTest(){
        Food bones = new Food();
        Food bananan = new Food();
        testDog.eat(bones);
        testDog.eat(bananan);
        int actMeals = testDog.getNumberOfMealsEaten();
        Assert.assertEquals(2,actMeals);

    }
//    TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
//     TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public  void testAIn(){
//      when
        Boolean AIn = testDog instanceof Animal;
//        then
        Assert.assertEquals(true,AIn) ;
    }


    @Test
    public void testMIn(){
//        when
        Boolean MIn = testDog instanceof Mammal;
//        then
        Assert.assertEquals(true,MIn);
    }

}
