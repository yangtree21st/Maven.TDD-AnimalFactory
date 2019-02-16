package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    Cat testCat ;

    @Before
    public void set() {
        testCat = new Cat("red", new Date(0), 1);

    }




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
        Cat newCat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = newCat.getName();
        Date retrievedBirthDate = newCat.getBirthDate();
        Integer retrievedId = newCat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test

    public  void testSetName(){




//      Given  this cat a new name
        String newName= "blue";


//        When
        testCat.setName(newName);


//        Then
        String actName = testCat.getName();
        Date actDate = testCat.getBirthDate();
        int actId = testCat.getId();

        Assert.assertEquals(newName,actName);
        Assert.assertEquals(new Date(0),actDate);
        Assert.assertEquals(1,actId );
    }
//
//    TODO - Create tests for `speak`
    @Test
    public void testSpeak() {



        String act = testCat.speak();
        Assert.assertEquals("meow!", act);

    }
//    TODO - Create tests for `void eat(Food food)`
    @Test
      public void eatTest(){
        Food fish = new Food();
        testCat.eat(fish);

        int actMeal = testCat.getNumberOfMealsEaten();

        Assert.assertEquals(1,actMeal);

      }
//    TODO - Create tests for `Integer getId()`

    @Test
        public  void getIdTest(){

         int actId = testCat.getId();

         Assert.assertEquals(1,actId );

        }



        @Test
        public void testInstanceOfAnimal(){
//        when
         boolean isAnimal = testCat instanceof Animal;
//         then
            Assert.assertEquals(true,isAnimal);


        }

    @Test
    public void testInstanceOfMammal(){
//        when
        boolean isMammal = testCat instanceof Mammal;
//         then
        Assert.assertEquals(true,isMammal);


    }





}
